package com.demo.crud.service.persistence.impl;

import com.demo.crud.model.Players;
import com.demo.crud.model.Sports;
import com.demo.crud.model.impl.PlayersImpl;
import com.demo.crud.service.persistence.PlayersFinder;
import com.demo.crud.service.persistence.SportsFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.Collections;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = PlayersFinder.class)
public class PlayersFinderImpl extends PlayersFinderBaseImpl implements PlayersFinder {

	@Reference
	private CustomSQL _customSQL;

	public List<Players> getSportsAndPlayersNames(String playersName) {
		System.out.println("Inside Inner join using...");
		Session session = null;
		List<Players> playerList = Collections.EMPTY_LIST;
		try {
			session = openSession();
			String sqlInnerJoin = _customSQL.get(getClass(), "getSportsAndPlayersName");
			System.out.println("Query Inner Join ==>" + sqlInnerJoin);
			SQLQuery sqlQuery = session.createSQLQuery(sqlInnerJoin);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("Players", PlayersImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(playersName);
			playerList = (List<Players>) sqlQuery.list();
			return playerList;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}

		return playerList;

	}

}
