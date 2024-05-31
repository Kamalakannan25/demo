package com.demo.pro.portlet;

import com.demo.crud.service.SportsLocalService;
import com.demo.pro.constants.ProPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Suchismita
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Pro",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ProPortletKeys.PRO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProPortlet extends MVCPortlet {
	
	@Reference
	private SportsLocalService sportsLocalService;

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		System.out.println(">>>>>>>>>>> Do View  <<<<<<<<<");
		String spoName = sportsLocalService.findBySportsName("football").get(0).getSportsName();
		System.out.println("Sports name  :  " + spoName);

		String sportNames = sportsLocalService.getSportsTabByName("football").get(0).getDescription();
		System.out.println("Custom SQL Query  :  " + sportNames);

		super.doView(renderRequest, renderResponse);
	}
}