package com.send.request.portlet;

import com.send.request.constants.SenderRequestPortletKeys;

import java.io.IOException;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

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
		"javax.portlet.display-name=SenderRequest",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SenderRequestPortletKeys.SENDERREQUEST,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supported-public-render-parameter=ipcMessage"
	},
	service = Portlet.class
)
public class SenderRequestPortlet extends MVCPortlet {
	
	
	public void sendMessage(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		String ipcMessage=ParamUtil.getString(actionRequest, "ipcMessage","");
		actionResponse.getRenderParameters().setValue("ipcMessage", ipcMessage);
		
	}
	
}