package com.object.portlet;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.util.DLURLHelperUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.object.constants.ObjectTablePortletKeys;
import com.object.util.HttpConnectionUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osgi.service.component.annotations.Component;

/**
 * @author Suchismita
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ObjectTable",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ObjectTablePortletKeys.OBJECTTABLE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ObjectTablePortlet extends MVCPortlet {

	private static final Log _log = LogFactoryUtil.getLog(ObjectTablePortlet.class);

	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	        throws IOException, PortletException {
		System.out.println("render method>>>>>>>");
	    String data = HttpConnectionUtil.getUrl("http://localhost:8080", "/o/c/employees");
	    
	    renderRequest.setAttribute("data", data);
	    super.render(renderRequest, renderResponse);
	}
	
	public void addFilesDetails(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException, PortalException {

		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		File file = uploadPortletRequest.getFile("fileUploads");
		String name = ParamUtil.getString(uploadPortletRequest, "name");
		String address = ParamUtil.getString(uploadPortletRequest, "address");
		long phoneNumber = ParamUtil.getLong(uploadPortletRequest, "phoneNumber");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	
		long repositoryId = themeDisplay.getScopeGroupId();
		long folderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
		ServiceContext serviceContext = null;
		try {
			serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
		} catch (PortalException e1) {
			e1.printStackTrace();
		}
		
		try (InputStream is = new FileInputStream(file)) {
			
			String title = file.getName();
			String description = "Description of " + title;
			String mimeType = MimeTypesUtil.getContentType(file);
			FileEntry fileEntry = DLAppServiceUtil.addFileEntry("", repositoryId, folderId, file.getName(), 
					mimeType, title, description, "", mimeType, is, file.length(), null, null, serviceContext);
			
			String fileEntryId = String.valueOf(fileEntry.getFileEntryId());
			String fileEntryURL = DLURLHelperUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay,
					StringPool.BLANK, false, false);
			
			
			JSONObject requestData = new JSONObject();
			requestData.put("name", name);
			requestData.put("address", address);
			requestData.put("phoneNumber", phoneNumber); 
	//		requestData.put("fileEntryId", fileEntryId); 
    //      requestData.put("fileEntryURL", fileEntryURL);
	        
	        JSONObject fileUpl = new JSONObject();
	        fileUpl.put("id", fileEntryId);

			JSONObject link = new JSONObject();
			link.put("href", fileEntryURL);
			link.put("label", title);

			fileUpl.put("link", link);
			fileUpl.put("name", title);

			requestData.put("fileUploads", fileUpl); 
			
			
			try {
				String responseId = HttpConnectionUtil.postUrl(requestData.toString(), "http://localhost:8080",
						"/o/c/uploadfileses");
				System.out.println("responseId...." + responseId);
				actionRequest.setAttribute("responseId", responseId);
			} catch (UnirestException e) {
				_log.error("Error adding data: " + e.getMessage(), e);
			}
		}catch (SystemException e) {
			_log.error("Error uploading file: " + e.getMessage(), e);
			}
	}

	
}