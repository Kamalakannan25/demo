package com.ext.portlet;

import com.ext.constants.ExternalDbPortletKeys;
import com.exter.model.Vlog;
import com.exter.service.VlogLocalServiceUtil;
import com.external.db.model.Emp;
import com.external.db.service.EmpLocalService;
import com.external.db.service.EmpLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

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
		"javax.portlet.display-name=ExternalDb",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ExternalDbPortletKeys.EXTERNALDB,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ExternalDbPortlet extends MVCPortlet {
	
	@Reference
	private EmpLocalService empLocalService;
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		System.out.println("External Second DB....");

		List<Vlog> vlog = VlogLocalServiceUtil.getVlogs(-1, -1);
		System.out.println("VLOG DATA..." + vlog);
		
	//	List<Emp> emp = EmpLocalServiceUtil.getEmps(-1, -1);
	//	System.out.println("Employee Data...." + emp);

		super.doView(renderRequest, renderResponse);
	}
	
//	@Override
//	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
//			throws IOException, PortletException {
//		System.out.println("Inside render method.......");
//
//		List<Vlog> vlog = VlogLocalServiceUtil.getVlogs(-1, -1);
//		System.out.println("VLOG DATA..." + vlog);
//		
//		super.render(renderRequest, renderResponse);
//	}
}