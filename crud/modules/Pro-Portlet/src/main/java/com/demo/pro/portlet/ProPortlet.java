package com.demo.pro.portlet;

import com.demo.crud.model.Sports;
import com.demo.crud.service.SportsLocalService;
import com.demo.crud.service.SportsLocalServiceUtil;
import com.demo.pro.constants.ProPortletKeys;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.RepositoryFactoryUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

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
		try {
		//Finder Method
		String spoName = sportsLocalService.findBySportsName("football").get(0).getSportsName();
		System.out.println("Sports name  :  " + spoName);

		//Custom SQL Query
		String sportNames = sportsLocalService.getSportsTabByName("football").get(0).getDescription();
		System.out.println("Custom SQL Query  :  " + sportNames);
		
		//Service Wrapper
		System.out.println("User Local Count  :  "+ UserLocalServiceUtil.getUsersCount());
		
		//Dynamic Query  --> java class 

		DynamicQuery spoList = SportsLocalServiceUtil.dynamicQuery();
		Criterion criterion = RestrictionsFactoryUtil.eq("sportsName", "football");
		criterion = RestrictionsFactoryUtil.and(criterion, RestrictionsFactoryUtil.eq("description", "asdf"));
		spoList.add(criterion);
		
		List<Sports> sportsList = SportsLocalServiceUtil.dynamicQuery(spoList);
		renderRequest.setAttribute("sportsList", sportsList);
		}catch(Exception e) {
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}
}