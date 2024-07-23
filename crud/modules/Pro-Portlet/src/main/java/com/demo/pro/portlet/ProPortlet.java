package com.demo.pro.portlet;

import com.demo.crud.model.Games;
import com.demo.crud.model.Players;
import com.demo.crud.model.Sports;
import com.demo.crud.service.GamesLocalService;
import com.demo.crud.service.PlayersLocalService;
import com.demo.crud.service.PlayersLocalServiceUtil;
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
import java.util.stream.Collectors;

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
	
	@Reference
	private PlayersLocalService playersLocalService;

	@Reference
	private GamesLocalService gamesLocalService;
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		String sportsName = renderRequest.getParameter("sportsName");
		
		List<Sports> sportsList = sportsLocalService.getSportses(-1, -1);
		System.out.println("sportsList......" + sportsList);
	    List<Players> playersList = playersLocalService.getPlayerses(-1, -1);
	    System.out.println("playersList......" + playersList);
	    List<Games> gamesList = gamesLocalService.getGameses(-1, -1);
	    System.out.println("gamesList......" + gamesList);

	    renderRequest.setAttribute("sportsList", sportsList);
	    renderRequest.setAttribute("playersList", playersList);
	    renderRequest.setAttribute("gamesList", gamesList);

	    super.render(renderRequest, renderResponse);
	}
		
		// Custom SQL 3 Table View
//		String sportsName = renderRequest.getParameter("sportsName");
//		List<Sports> sportsList1 = sportsLocalService.getSportses(-1, -1);
//		System.out.println("sportsList1111111111111" + sportsList1);
//
//		if (sportsName != null) {
//			sportsList1 = sportsLocalService.getSportsAllDetails(sportsName);
//		}
//		System.out.println("sportsList22222222222222" + sportsList1);
//		renderRequest.setAttribute("sportsList1", sportsList1);
//		super.render(renderRequest, renderResponse);
//	}
	
	
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
		
		int playesAge = playersLocalService.getSportsAndPlayersNames("ronaldo").get(0).getPlayersAge();
		System.out.println("Custom SQL Query Player Age  :  " + playesAge);
		
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