package com.doc.med.portlet;

import com.doc.med.constants.OpenDocAndMediaPortletKeys;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.AuthTokenUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.PortletKeys;
import com.liferay.portal.kernel.util.WebKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;

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
		"javax.portlet.display-name=OpenDocAndMedia",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + OpenDocAndMediaPortletKeys.OPENDOCANDMEDIA,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class OpenDocAndMediaPortlet extends MVCPortlet {
	
	@SuppressWarnings("deprecation")
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
	        throws IOException, PortletException {
	    System.out.println("Inside the render method.........");

	    ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	    HttpServletRequest httpServletRequest = PortalUtil.getHttpServletRequest(renderRequest);

	    LiferayPortletURL documentLibraryURL = (LiferayPortletURL) renderResponse.createRenderURL();

	    try {
	        documentLibraryURL.setPortletId(PortletKeys.DOCUMENT_LIBRARY_ADMIN);
	        documentLibraryURL.setLifecycle(PortletRequest.RENDER_PHASE);

	        documentLibraryURL.setPortletMode(PortletMode.VIEW);
	        documentLibraryURL.setWindowState(WindowState.MAXIMIZED);

	        documentLibraryURL.setParameter("mvcRenderCommandName", "/document_library/view");
	        documentLibraryURL.setParameter("groupId", String.valueOf(themeDisplay.getScopeGroupId()));
	        documentLibraryURL.setParameter("p_v_l_s_g_id", String.valueOf(themeDisplay.getScopeGroupId()));
	        documentLibraryURL.setParameter("folderId", String.valueOf(DLFolderConstants.DEFAULT_PARENT_FOLDER_ID));
	        documentLibraryURL.setParameter("showActions", Boolean.TRUE.toString());

	        String p_p_auth = AuthTokenUtil.getToken(httpServletRequest);
	        documentLibraryURL.setParameter("p_p_auth", p_p_auth);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    String documentLibraryURLString = documentLibraryURL.toString();
	    System.out.println("documentLibraryURLString....." + documentLibraryURLString);
	    System.out.println("documentLibraryURL........" + documentLibraryURL);

	    renderRequest.setAttribute("documentLibraryURL", documentLibraryURLString);

	    super.render(renderRequest, renderResponse);
	}
	
	
	
	
}