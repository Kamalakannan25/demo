package com.object.portlet;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.object.constants.ObjectTablePortletKeys;
import com.object.util.HttpConnectionUtil;

import java.io.IOException;

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
	    
	    _log.info("Employee data to be set in request: " + data);
	    renderRequest.setAttribute("data", data);

	    super.render(renderRequest, renderResponse);
	}
	
	
//	@Override
//		public void render(RenderRequest renderRequest, RenderResponse renderResponse)
//				throws IOException, PortletException {
//		JSONArray employeeGet = getJson("http://localhost:8080", "/o/c/employees");
//		
//		_log.info("employeeGet........" + employeeGet);
//		System.out.println("employeeGet........" + employeeGet);
//		renderRequest.setAttribute("employeeGet", employeeGet);
//		super.render(renderRequest, renderResponse);
//		}
//	
	
	
//	public JSONArray getJson(String baseUrl, String addedUrl) {
//
//		JSONArray jsonArray = null;
//		try {
//			String data = HttpConnectionUtil.getUrl(baseUrl, addedUrl);
//			JSONObject jsonObject = new JSONObject(data);
//			jsonArray = jsonObject.getJSONArray("items");
//			System.out.println("jsonObject......." +jsonObject);
//			System.out.println("Data......" + data);
//			_log.info("Data......" + data);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return jsonArray;
//	}
}