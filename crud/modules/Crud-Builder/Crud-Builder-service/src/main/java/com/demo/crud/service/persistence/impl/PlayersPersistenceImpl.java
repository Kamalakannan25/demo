/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.persistence.impl;

import com.demo.crud.exception.NoSuchPlayersException;
import com.demo.crud.model.Players;
import com.demo.crud.model.PlayersTable;
import com.demo.crud.model.impl.PlayersImpl;
import com.demo.crud.model.impl.PlayersModelImpl;
import com.demo.crud.service.persistence.PlayersPersistence;
import com.demo.crud.service.persistence.PlayersUtil;
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
 * The persistence implementation for the players service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PlayersPersistence.class)
public class PlayersPersistenceImpl
	extends BasePersistenceImpl<Players> implements PlayersPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PlayersUtil</code> to access the players persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PlayersImpl.class.getName();

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
	 * Returns all the playerses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching playerses
	 */
	@Override
	public List<Players> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the playerses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of playerses
	 * @param end the upper bound of the range of playerses (not inclusive)
	 * @return the range of matching playerses
	 */
	@Override
	public List<Players> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the playerses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of playerses
	 * @param end the upper bound of the range of playerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching playerses
	 */
	@Override
	public List<Players> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Players> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the playerses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of playerses
	 * @param end the upper bound of the range of playerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching playerses
	 */
	@Override
	public List<Players> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Players> orderByComparator, boolean useFinderCache) {

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

		List<Players> list = null;

		if (useFinderCache) {
			list = (List<Players>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Players players : list) {
					if (!uuid.equals(players.getUuid())) {
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

			sb.append(_SQL_SELECT_PLAYERS_WHERE);

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
				sb.append(PlayersModelImpl.ORDER_BY_JPQL);
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

				list = (List<Players>)QueryUtil.list(
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
	 * Returns the first players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching players
	 * @throws NoSuchPlayersException if a matching players could not be found
	 */
	@Override
	public Players findByUuid_First(
			String uuid, OrderByComparator<Players> orderByComparator)
		throws NoSuchPlayersException {

		Players players = fetchByUuid_First(uuid, orderByComparator);

		if (players != null) {
			return players;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPlayersException(sb.toString());
	}

	/**
	 * Returns the first players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching players, or <code>null</code> if a matching players could not be found
	 */
	@Override
	public Players fetchByUuid_First(
		String uuid, OrderByComparator<Players> orderByComparator) {

		List<Players> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching players
	 * @throws NoSuchPlayersException if a matching players could not be found
	 */
	@Override
	public Players findByUuid_Last(
			String uuid, OrderByComparator<Players> orderByComparator)
		throws NoSuchPlayersException {

		Players players = fetchByUuid_Last(uuid, orderByComparator);

		if (players != null) {
			return players;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchPlayersException(sb.toString());
	}

	/**
	 * Returns the last players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching players, or <code>null</code> if a matching players could not be found
	 */
	@Override
	public Players fetchByUuid_Last(
		String uuid, OrderByComparator<Players> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Players> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the playerses before and after the current players in the ordered set where uuid = &#63;.
	 *
	 * @param playersId the primary key of the current players
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next players
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	@Override
	public Players[] findByUuid_PrevAndNext(
			long playersId, String uuid,
			OrderByComparator<Players> orderByComparator)
		throws NoSuchPlayersException {

		uuid = Objects.toString(uuid, "");

		Players players = findByPrimaryKey(playersId);

		Session session = null;

		try {
			session = openSession();

			Players[] array = new PlayersImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, players, uuid, orderByComparator, true);

			array[1] = players;

			array[2] = getByUuid_PrevAndNext(
				session, players, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Players getByUuid_PrevAndNext(
		Session session, Players players, String uuid,
		OrderByComparator<Players> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_PLAYERS_WHERE);

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
			sb.append(PlayersModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(players)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Players> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the playerses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Players players :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(players);
		}
	}

	/**
	 * Returns the number of playerses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching playerses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PLAYERS_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "players.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(players.uuid IS NULL OR players.uuid = '')";

	public PlayersPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Players.class);

		setModelImplClass(PlayersImpl.class);
		setModelPKClass(long.class);

		setTable(PlayersTable.INSTANCE);
	}

	/**
	 * Caches the players in the entity cache if it is enabled.
	 *
	 * @param players the players
	 */
	@Override
	public void cacheResult(Players players) {
		entityCache.putResult(
			PlayersImpl.class, players.getPrimaryKey(), players);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the playerses in the entity cache if it is enabled.
	 *
	 * @param playerses the playerses
	 */
	@Override
	public void cacheResult(List<Players> playerses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (playerses.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Players players : playerses) {
			if (entityCache.getResult(
					PlayersImpl.class, players.getPrimaryKey()) == null) {

				cacheResult(players);
			}
		}
	}

	/**
	 * Clears the cache for all playerses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PlayersImpl.class);

		finderCache.clearCache(PlayersImpl.class);
	}

	/**
	 * Clears the cache for the players.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Players players) {
		entityCache.removeResult(PlayersImpl.class, players);
	}

	@Override
	public void clearCache(List<Players> playerses) {
		for (Players players : playerses) {
			entityCache.removeResult(PlayersImpl.class, players);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PlayersImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PlayersImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new players with the primary key. Does not add the players to the database.
	 *
	 * @param playersId the primary key for the new players
	 * @return the new players
	 */
	@Override
	public Players create(long playersId) {
		Players players = new PlayersImpl();

		players.setNew(true);
		players.setPrimaryKey(playersId);

		String uuid = PortalUUIDUtil.generate();

		players.setUuid(uuid);

		return players;
	}

	/**
	 * Removes the players with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param playersId the primary key of the players
	 * @return the players that was removed
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	@Override
	public Players remove(long playersId) throws NoSuchPlayersException {
		return remove((Serializable)playersId);
	}

	/**
	 * Removes the players with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the players
	 * @return the players that was removed
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	@Override
	public Players remove(Serializable primaryKey)
		throws NoSuchPlayersException {

		Session session = null;

		try {
			session = openSession();

			Players players = (Players)session.get(
				PlayersImpl.class, primaryKey);

			if (players == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPlayersException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(players);
		}
		catch (NoSuchPlayersException noSuchEntityException) {
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
	protected Players removeImpl(Players players) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(players)) {
				players = (Players)session.get(
					PlayersImpl.class, players.getPrimaryKeyObj());
			}

			if (players != null) {
				session.delete(players);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (players != null) {
			clearCache(players);
		}

		return players;
	}

	@Override
	public Players updateImpl(Players players) {
		boolean isNew = players.isNew();

		if (!(players instanceof PlayersModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(players.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(players);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in players proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Players implementation " +
					players.getClass());
		}

		PlayersModelImpl playersModelImpl = (PlayersModelImpl)players;

		if (Validator.isNull(players.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			players.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(players);
			}
			else {
				players = (Players)session.merge(players);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(PlayersImpl.class, playersModelImpl, false, true);

		if (isNew) {
			players.setNew(false);
		}

		players.resetOriginalValues();

		return players;
	}

	/**
	 * Returns the players with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the players
	 * @return the players
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	@Override
	public Players findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPlayersException {

		Players players = fetchByPrimaryKey(primaryKey);

		if (players == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPlayersException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return players;
	}

	/**
	 * Returns the players with the primary key or throws a <code>NoSuchPlayersException</code> if it could not be found.
	 *
	 * @param playersId the primary key of the players
	 * @return the players
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	@Override
	public Players findByPrimaryKey(long playersId)
		throws NoSuchPlayersException {

		return findByPrimaryKey((Serializable)playersId);
	}

	/**
	 * Returns the players with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param playersId the primary key of the players
	 * @return the players, or <code>null</code> if a players with the primary key could not be found
	 */
	@Override
	public Players fetchByPrimaryKey(long playersId) {
		return fetchByPrimaryKey((Serializable)playersId);
	}

	/**
	 * Returns all the playerses.
	 *
	 * @return the playerses
	 */
	@Override
	public List<Players> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the playerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of playerses
	 * @param end the upper bound of the range of playerses (not inclusive)
	 * @return the range of playerses
	 */
	@Override
	public List<Players> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the playerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of playerses
	 * @param end the upper bound of the range of playerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of playerses
	 */
	@Override
	public List<Players> findAll(
		int start, int end, OrderByComparator<Players> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the playerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of playerses
	 * @param end the upper bound of the range of playerses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of playerses
	 */
	@Override
	public List<Players> findAll(
		int start, int end, OrderByComparator<Players> orderByComparator,
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

		List<Players> list = null;

		if (useFinderCache) {
			list = (List<Players>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PLAYERS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PLAYERS;

				sql = sql.concat(PlayersModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Players>)QueryUtil.list(
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
	 * Removes all the playerses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Players players : findAll()) {
			remove(players);
		}
	}

	/**
	 * Returns the number of playerses.
	 *
	 * @return the number of playerses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PLAYERS);

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
		return "playersId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PLAYERS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PlayersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the players persistence.
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

		PlayersUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PlayersUtil.setPersistence(null);

		entityCache.removeCache(PlayersImpl.class.getName());
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

	private static final String _SQL_SELECT_PLAYERS =
		"SELECT players FROM Players players";

	private static final String _SQL_SELECT_PLAYERS_WHERE =
		"SELECT players FROM Players players WHERE ";

	private static final String _SQL_COUNT_PLAYERS =
		"SELECT COUNT(players) FROM Players players";

	private static final String _SQL_COUNT_PLAYERS_WHERE =
		"SELECT COUNT(players) FROM Players players WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "players.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Players exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Players exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PlayersPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}