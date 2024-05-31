/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.persistence.impl;

import com.demo.crud.exception.NoSuchSportsException;
import com.demo.crud.model.Sports;
import com.demo.crud.model.SportsTable;
import com.demo.crud.model.impl.SportsImpl;
import com.demo.crud.model.impl.SportsModelImpl;
import com.demo.crud.service.persistence.SportsPersistence;
import com.demo.crud.service.persistence.SportsUtil;
import com.demo.crud.service.persistence.impl.constants.SportsPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the sports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SportsPersistence.class)
public class SportsPersistenceImpl
	extends BasePersistenceImpl<Sports> implements SportsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SportsUtil</code> to access the sports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SportsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the sportses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sportses
	 */
	@Override
	public List<Sports> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sportses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @return the range of matching sportses
	 */
	@Override
	public List<Sports> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sportses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sportses
	 */
	@Override
	public List<Sports> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sports> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sportses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sportses
	 */
	@Override
	public List<Sports> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sports> orderByComparator, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Sports> list = null;

		if (useFinderCache) {
			list = (List<Sports>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Sports sports : list) {
					if (!uuid.equals(sports.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_SPORTS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SportsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Sports>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	@Override
	public Sports findByUuid_First(
			String uuid, OrderByComparator<Sports> orderByComparator)
		throws NoSuchSportsException {

		Sports sports = fetchByUuid_First(uuid, orderByComparator);

		if (sports != null) {
			return sports;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSportsException(sb.toString());
	}

	/**
	 * Returns the first sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports, or <code>null</code> if a matching sports could not be found
	 */
	@Override
	public Sports fetchByUuid_First(
		String uuid, OrderByComparator<Sports> orderByComparator) {

		List<Sports> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	@Override
	public Sports findByUuid_Last(
			String uuid, OrderByComparator<Sports> orderByComparator)
		throws NoSuchSportsException {

		Sports sports = fetchByUuid_Last(uuid, orderByComparator);

		if (sports != null) {
			return sports;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchSportsException(sb.toString());
	}

	/**
	 * Returns the last sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports, or <code>null</code> if a matching sports could not be found
	 */
	@Override
	public Sports fetchByUuid_Last(
		String uuid, OrderByComparator<Sports> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Sports> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sportses before and after the current sports in the ordered set where uuid = &#63;.
	 *
	 * @param sportsId the primary key of the current sports
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	@Override
	public Sports[] findByUuid_PrevAndNext(
			long sportsId, String uuid,
			OrderByComparator<Sports> orderByComparator)
		throws NoSuchSportsException {

		uuid = Objects.toString(uuid, "");

		Sports sports = findByPrimaryKey(sportsId);

		Session session = null;

		try {
			session = openSession();

			Sports[] array = new SportsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, sports, uuid, orderByComparator, true);

			array[1] = sports;

			array[2] = getByUuid_PrevAndNext(
				session, sports, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Sports getByUuid_PrevAndNext(
		Session session, Sports sports, String uuid,
		OrderByComparator<Sports> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SPORTS_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(SportsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(sports)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Sports> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sportses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Sports sports :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sports);
		}
	}

	/**
	 * Returns the number of sportses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sportses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SPORTS_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "sports.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(sports.uuid IS NULL OR sports.uuid = '')";

	private FinderPath _finderPathWithPaginationFindBysportsName;
	private FinderPath _finderPathWithoutPaginationFindBysportsName;
	private FinderPath _finderPathCountBysportsName;

	/**
	 * Returns all the sportses where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @return the matching sportses
	 */
	@Override
	public List<Sports> findBysportsName(String sportsName) {
		return findBysportsName(
			sportsName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sportses where sportsName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param sportsName the sports name
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @return the range of matching sportses
	 */
	@Override
	public List<Sports> findBysportsName(
		String sportsName, int start, int end) {

		return findBysportsName(sportsName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sportses where sportsName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param sportsName the sports name
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sportses
	 */
	@Override
	public List<Sports> findBysportsName(
		String sportsName, int start, int end,
		OrderByComparator<Sports> orderByComparator) {

		return findBysportsName(
			sportsName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sportses where sportsName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param sportsName the sports name
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sportses
	 */
	@Override
	public List<Sports> findBysportsName(
		String sportsName, int start, int end,
		OrderByComparator<Sports> orderByComparator, boolean useFinderCache) {

		sportsName = Objects.toString(sportsName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBysportsName;
				finderArgs = new Object[] {sportsName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBysportsName;
			finderArgs = new Object[] {
				sportsName, start, end, orderByComparator
			};
		}

		List<Sports> list = null;

		if (useFinderCache) {
			list = (List<Sports>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Sports sports : list) {
					if (!sportsName.equals(sports.getSportsName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_SPORTS_WHERE);

			boolean bindSportsName = false;

			if (sportsName.isEmpty()) {
				sb.append(_FINDER_COLUMN_SPORTSNAME_SPORTSNAME_3);
			}
			else {
				bindSportsName = true;

				sb.append(_FINDER_COLUMN_SPORTSNAME_SPORTSNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SportsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindSportsName) {
					queryPos.add(sportsName);
				}

				list = (List<Sports>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	@Override
	public Sports findBysportsName_First(
			String sportsName, OrderByComparator<Sports> orderByComparator)
		throws NoSuchSportsException {

		Sports sports = fetchBysportsName_First(sportsName, orderByComparator);

		if (sports != null) {
			return sports;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sportsName=");
		sb.append(sportsName);

		sb.append("}");

		throw new NoSuchSportsException(sb.toString());
	}

	/**
	 * Returns the first sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports, or <code>null</code> if a matching sports could not be found
	 */
	@Override
	public Sports fetchBysportsName_First(
		String sportsName, OrderByComparator<Sports> orderByComparator) {

		List<Sports> list = findBysportsName(
			sportsName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	@Override
	public Sports findBysportsName_Last(
			String sportsName, OrderByComparator<Sports> orderByComparator)
		throws NoSuchSportsException {

		Sports sports = fetchBysportsName_Last(sportsName, orderByComparator);

		if (sports != null) {
			return sports;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sportsName=");
		sb.append(sportsName);

		sb.append("}");

		throw new NoSuchSportsException(sb.toString());
	}

	/**
	 * Returns the last sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports, or <code>null</code> if a matching sports could not be found
	 */
	@Override
	public Sports fetchBysportsName_Last(
		String sportsName, OrderByComparator<Sports> orderByComparator) {

		int count = countBysportsName(sportsName);

		if (count == 0) {
			return null;
		}

		List<Sports> list = findBysportsName(
			sportsName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sportses before and after the current sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsId the primary key of the current sports
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	@Override
	public Sports[] findBysportsName_PrevAndNext(
			long sportsId, String sportsName,
			OrderByComparator<Sports> orderByComparator)
		throws NoSuchSportsException {

		sportsName = Objects.toString(sportsName, "");

		Sports sports = findByPrimaryKey(sportsId);

		Session session = null;

		try {
			session = openSession();

			Sports[] array = new SportsImpl[3];

			array[0] = getBysportsName_PrevAndNext(
				session, sports, sportsName, orderByComparator, true);

			array[1] = sports;

			array[2] = getBysportsName_PrevAndNext(
				session, sports, sportsName, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Sports getBysportsName_PrevAndNext(
		Session session, Sports sports, String sportsName,
		OrderByComparator<Sports> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SPORTS_WHERE);

		boolean bindSportsName = false;

		if (sportsName.isEmpty()) {
			sb.append(_FINDER_COLUMN_SPORTSNAME_SPORTSNAME_3);
		}
		else {
			bindSportsName = true;

			sb.append(_FINDER_COLUMN_SPORTSNAME_SPORTSNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(SportsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindSportsName) {
			queryPos.add(sportsName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(sports)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Sports> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sportses where sportsName = &#63; from the database.
	 *
	 * @param sportsName the sports name
	 */
	@Override
	public void removeBysportsName(String sportsName) {
		for (Sports sports :
				findBysportsName(
					sportsName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sports);
		}
	}

	/**
	 * Returns the number of sportses where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @return the number of matching sportses
	 */
	@Override
	public int countBysportsName(String sportsName) {
		sportsName = Objects.toString(sportsName, "");

		FinderPath finderPath = _finderPathCountBysportsName;

		Object[] finderArgs = new Object[] {sportsName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SPORTS_WHERE);

			boolean bindSportsName = false;

			if (sportsName.isEmpty()) {
				sb.append(_FINDER_COLUMN_SPORTSNAME_SPORTSNAME_3);
			}
			else {
				bindSportsName = true;

				sb.append(_FINDER_COLUMN_SPORTSNAME_SPORTSNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindSportsName) {
					queryPos.add(sportsName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SPORTSNAME_SPORTSNAME_2 =
		"sports.sportsName = ?";

	private static final String _FINDER_COLUMN_SPORTSNAME_SPORTSNAME_3 =
		"(sports.sportsName IS NULL OR sports.sportsName = '')";

	public SportsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Sports.class);

		setModelImplClass(SportsImpl.class);
		setModelPKClass(long.class);

		setTable(SportsTable.INSTANCE);
	}

	/**
	 * Caches the sports in the entity cache if it is enabled.
	 *
	 * @param sports the sports
	 */
	@Override
	public void cacheResult(Sports sports) {
		entityCache.putResult(SportsImpl.class, sports.getPrimaryKey(), sports);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sportses in the entity cache if it is enabled.
	 *
	 * @param sportses the sportses
	 */
	@Override
	public void cacheResult(List<Sports> sportses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sportses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Sports sports : sportses) {
			if (entityCache.getResult(
					SportsImpl.class, sports.getPrimaryKey()) == null) {

				cacheResult(sports);
			}
		}
	}

	/**
	 * Clears the cache for all sportses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SportsImpl.class);

		finderCache.clearCache(SportsImpl.class);
	}

	/**
	 * Clears the cache for the sports.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Sports sports) {
		entityCache.removeResult(SportsImpl.class, sports);
	}

	@Override
	public void clearCache(List<Sports> sportses) {
		for (Sports sports : sportses) {
			entityCache.removeResult(SportsImpl.class, sports);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SportsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SportsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sports with the primary key. Does not add the sports to the database.
	 *
	 * @param sportsId the primary key for the new sports
	 * @return the new sports
	 */
	@Override
	public Sports create(long sportsId) {
		Sports sports = new SportsImpl();

		sports.setNew(true);
		sports.setPrimaryKey(sportsId);

		String uuid = PortalUUIDUtil.generate();

		sports.setUuid(uuid);

		return sports;
	}

	/**
	 * Removes the sports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports that was removed
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	@Override
	public Sports remove(long sportsId) throws NoSuchSportsException {
		return remove((Serializable)sportsId);
	}

	/**
	 * Removes the sports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sports
	 * @return the sports that was removed
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	@Override
	public Sports remove(Serializable primaryKey) throws NoSuchSportsException {
		Session session = null;

		try {
			session = openSession();

			Sports sports = (Sports)session.get(SportsImpl.class, primaryKey);

			if (sports == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSportsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sports);
		}
		catch (NoSuchSportsException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Sports removeImpl(Sports sports) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sports)) {
				sports = (Sports)session.get(
					SportsImpl.class, sports.getPrimaryKeyObj());
			}

			if (sports != null) {
				session.delete(sports);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sports != null) {
			clearCache(sports);
		}

		return sports;
	}

	@Override
	public Sports updateImpl(Sports sports) {
		boolean isNew = sports.isNew();

		if (!(sports instanceof SportsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sports.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(sports);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sports proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Sports implementation " +
					sports.getClass());
		}

		SportsModelImpl sportsModelImpl = (SportsModelImpl)sports;

		if (Validator.isNull(sports.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			sports.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sports);
			}
			else {
				sports = (Sports)session.merge(sports);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(SportsImpl.class, sportsModelImpl, false, true);

		if (isNew) {
			sports.setNew(false);
		}

		sports.resetOriginalValues();

		return sports;
	}

	/**
	 * Returns the sports with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sports
	 * @return the sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	@Override
	public Sports findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSportsException {

		Sports sports = fetchByPrimaryKey(primaryKey);

		if (sports == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSportsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sports;
	}

	/**
	 * Returns the sports with the primary key or throws a <code>NoSuchSportsException</code> if it could not be found.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	@Override
	public Sports findByPrimaryKey(long sportsId) throws NoSuchSportsException {
		return findByPrimaryKey((Serializable)sportsId);
	}

	/**
	 * Returns the sports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports, or <code>null</code> if a sports with the primary key could not be found
	 */
	@Override
	public Sports fetchByPrimaryKey(long sportsId) {
		return fetchByPrimaryKey((Serializable)sportsId);
	}

	/**
	 * Returns all the sportses.
	 *
	 * @return the sportses
	 */
	@Override
	public List<Sports> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @return the range of sportses
	 */
	@Override
	public List<Sports> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sportses
	 */
	@Override
	public List<Sports> findAll(
		int start, int end, OrderByComparator<Sports> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SportsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sportses
	 */
	@Override
	public List<Sports> findAll(
		int start, int end, OrderByComparator<Sports> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Sports> list = null;

		if (useFinderCache) {
			list = (List<Sports>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SPORTS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SPORTS;

				sql = sql.concat(SportsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Sports>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the sportses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Sports sports : findAll()) {
			remove(sports);
		}
	}

	/**
	 * Returns the number of sportses.
	 *
	 * @return the number of sportses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SPORTS);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "sportsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SPORTS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SportsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sports persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathWithPaginationFindBysportsName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBysportsName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sportsName"}, true);

		_finderPathWithoutPaginationFindBysportsName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBysportsName",
			new String[] {String.class.getName()}, new String[] {"sportsName"},
			true);

		_finderPathCountBysportsName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBysportsName",
			new String[] {String.class.getName()}, new String[] {"sportsName"},
			false);

		SportsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SportsUtil.setPersistence(null);

		entityCache.removeCache(SportsImpl.class.getName());
	}

	@Override
	@Reference(
		target = SportsPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SportsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SportsPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SPORTS =
		"SELECT sports FROM Sports sports";

	private static final String _SQL_SELECT_SPORTS_WHERE =
		"SELECT sports FROM Sports sports WHERE ";

	private static final String _SQL_COUNT_SPORTS =
		"SELECT COUNT(sports) FROM Sports sports";

	private static final String _SQL_COUNT_SPORTS_WHERE =
		"SELECT COUNT(sports) FROM Sports sports WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sports.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Sports exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Sports exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SportsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}