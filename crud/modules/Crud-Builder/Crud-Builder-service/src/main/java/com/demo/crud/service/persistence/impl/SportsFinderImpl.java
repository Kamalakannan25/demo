package com.demo.crud.service.persistence.impl;

import com.demo.crud.model.Sports;
import com.demo.crud.model.impl.SportsImpl;
import com.demo.crud.service.persistence.SportsFinder;
import com.liferay.portal.dao.orm.custom.sql.CustomSQL;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import java.util.Collections;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = SportsFinder.class)
public class SportsFinderImpl extends SportsFinderBaseImpl implements SportsFinder {

	@Reference
	private CustomSQL _customSQL;

	public List<Sports> getSportsTabByName(String sportsName) {
		System.out.println("Inside custom sql");
		Session session = null;
List<Sports> sportsList = Collections.EMPTY_LIST;
		try {
			session = openSession();
			String sql = _customSQL.get(getClass(), "getSportsByName");
			System.out.println("Query==>" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("Sports", SportsImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(sportsName);
			//return (List<Sports>) sqlQuery.list();
			sportsList = (List<Sports>) sqlQuery.list();
			return sportsList;
		} catch (Exception e) {

		} finally {
			closeSession(session);
		}
		return sportsList;

	}
	
	public List<Sports> getSportsDetails(String sportsName) {
		System.out.println("Inside 3 table join custom sql...");
		Session session = null;
		List<Sports> sportsList = Collections.EMPTY_LIST;
		try {
			session = openSession();
			String sql = _customSQL.get(getClass(), "getSportsAllDetails");
			System.out.println("Query==>" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("Sports", SportsImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(sportsName);
			sportsList = (List<Sports>) sqlQuery.list();
			return sportsList;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	        if (session != null) {
	            closeSession(session);
	        }
	    }
		return sportsList;
		
	}
}
