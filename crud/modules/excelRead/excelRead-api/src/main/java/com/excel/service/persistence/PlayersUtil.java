/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.service.persistence;

import com.excel.model.Players;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the players service. This utility wraps <code>com.excel.service.persistence.impl.PlayersPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlayersPersistence
 * @generated
 */
public class PlayersUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Players players) {
		getPersistence().clearCache(players);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Players> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Players> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Players> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Players> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Players> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Players update(Players players) {
		return getPersistence().update(players);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Players update(
		Players players, ServiceContext serviceContext) {

		return getPersistence().update(players, serviceContext);
	}

	/**
	 * Returns all the playerses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching playerses
	 */
	public static List<Players> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<Players> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<Players> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Players> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<Players> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Players> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching players
	 * @throws NoSuchPlayersException if a matching players could not be found
	 */
	public static Players findByUuid_First(
			String uuid, OrderByComparator<Players> orderByComparator)
		throws com.excel.exception.NoSuchPlayersException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching players, or <code>null</code> if a matching players could not be found
	 */
	public static Players fetchByUuid_First(
		String uuid, OrderByComparator<Players> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching players
	 * @throws NoSuchPlayersException if a matching players could not be found
	 */
	public static Players findByUuid_Last(
			String uuid, OrderByComparator<Players> orderByComparator)
		throws com.excel.exception.NoSuchPlayersException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching players, or <code>null</code> if a matching players could not be found
	 */
	public static Players fetchByUuid_Last(
		String uuid, OrderByComparator<Players> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static Players[] findByUuid_PrevAndNext(
			long playersId, String uuid,
			OrderByComparator<Players> orderByComparator)
		throws com.excel.exception.NoSuchPlayersException {

		return getPersistence().findByUuid_PrevAndNext(
			playersId, uuid, orderByComparator);
	}

	/**
	 * Removes all the playerses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of playerses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching playerses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the players in the entity cache if it is enabled.
	 *
	 * @param players the players
	 */
	public static void cacheResult(Players players) {
		getPersistence().cacheResult(players);
	}

	/**
	 * Caches the playerses in the entity cache if it is enabled.
	 *
	 * @param playerses the playerses
	 */
	public static void cacheResult(List<Players> playerses) {
		getPersistence().cacheResult(playerses);
	}

	/**
	 * Creates a new players with the primary key. Does not add the players to the database.
	 *
	 * @param playersId the primary key for the new players
	 * @return the new players
	 */
	public static Players create(long playersId) {
		return getPersistence().create(playersId);
	}

	/**
	 * Removes the players with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param playersId the primary key of the players
	 * @return the players that was removed
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	public static Players remove(long playersId)
		throws com.excel.exception.NoSuchPlayersException {

		return getPersistence().remove(playersId);
	}

	public static Players updateImpl(Players players) {
		return getPersistence().updateImpl(players);
	}

	/**
	 * Returns the players with the primary key or throws a <code>NoSuchPlayersException</code> if it could not be found.
	 *
	 * @param playersId the primary key of the players
	 * @return the players
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	public static Players findByPrimaryKey(long playersId)
		throws com.excel.exception.NoSuchPlayersException {

		return getPersistence().findByPrimaryKey(playersId);
	}

	/**
	 * Returns the players with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param playersId the primary key of the players
	 * @return the players, or <code>null</code> if a players with the primary key could not be found
	 */
	public static Players fetchByPrimaryKey(long playersId) {
		return getPersistence().fetchByPrimaryKey(playersId);
	}

	/**
	 * Returns all the playerses.
	 *
	 * @return the playerses
	 */
	public static List<Players> findAll() {
		return getPersistence().findAll();
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
	public static List<Players> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Players> findAll(
		int start, int end, OrderByComparator<Players> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Players> findAll(
		int start, int end, OrderByComparator<Players> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the playerses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of playerses.
	 *
	 * @return the number of playerses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PlayersPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(PlayersPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile PlayersPersistence _persistence;

}