/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.persistence;

import com.demo.crud.model.Games;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the games service. This utility wraps <code>com.demo.crud.service.persistence.impl.GamesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GamesPersistence
 * @generated
 */
public class GamesUtil {

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
	public static void clearCache(Games games) {
		getPersistence().clearCache(games);
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
	public static Map<Serializable, Games> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Games> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Games> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Games> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Games> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Games update(Games games) {
		return getPersistence().update(games);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Games update(Games games, ServiceContext serviceContext) {
		return getPersistence().update(games, serviceContext);
	}

	/**
	 * Returns all the gameses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching gameses
	 */
	public static List<Games> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the gameses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @return the range of matching gameses
	 */
	public static List<Games> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the gameses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching gameses
	 */
	public static List<Games> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Games> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gameses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching gameses
	 */
	public static List<Games> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Games> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching games
	 * @throws NoSuchGamesException if a matching games could not be found
	 */
	public static Games findByUuid_First(
			String uuid, OrderByComparator<Games> orderByComparator)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching games, or <code>null</code> if a matching games could not be found
	 */
	public static Games fetchByUuid_First(
		String uuid, OrderByComparator<Games> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching games
	 * @throws NoSuchGamesException if a matching games could not be found
	 */
	public static Games findByUuid_Last(
			String uuid, OrderByComparator<Games> orderByComparator)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching games, or <code>null</code> if a matching games could not be found
	 */
	public static Games fetchByUuid_Last(
		String uuid, OrderByComparator<Games> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the gameses before and after the current games in the ordered set where uuid = &#63;.
	 *
	 * @param gamesId the primary key of the current games
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next games
	 * @throws NoSuchGamesException if a games with the primary key could not be found
	 */
	public static Games[] findByUuid_PrevAndNext(
			long gamesId, String uuid,
			OrderByComparator<Games> orderByComparator)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByUuid_PrevAndNext(
			gamesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the gameses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of gameses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching gameses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the games where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchGamesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching games
	 * @throws NoSuchGamesException if a matching games could not be found
	 */
	public static Games findByUUID_G(String uuid, long groupId)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the games where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching games, or <code>null</code> if a matching games could not be found
	 */
	public static Games fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the games where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching games, or <code>null</code> if a matching games could not be found
	 */
	public static Games fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the games where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the games that was removed
	 */
	public static Games removeByUUID_G(String uuid, long groupId)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of gameses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching gameses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the gameses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching gameses
	 */
	public static List<Games> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the gameses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @return the range of matching gameses
	 */
	public static List<Games> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the gameses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching gameses
	 */
	public static List<Games> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Games> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gameses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching gameses
	 */
	public static List<Games> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Games> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first games in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching games
	 * @throws NoSuchGamesException if a matching games could not be found
	 */
	public static Games findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Games> orderByComparator)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first games in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching games, or <code>null</code> if a matching games could not be found
	 */
	public static Games fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Games> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last games in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching games
	 * @throws NoSuchGamesException if a matching games could not be found
	 */
	public static Games findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Games> orderByComparator)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last games in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching games, or <code>null</code> if a matching games could not be found
	 */
	public static Games fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Games> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the gameses before and after the current games in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param gamesId the primary key of the current games
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next games
	 * @throws NoSuchGamesException if a games with the primary key could not be found
	 */
	public static Games[] findByUuid_C_PrevAndNext(
			long gamesId, String uuid, long companyId,
			OrderByComparator<Games> orderByComparator)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			gamesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the gameses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of gameses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching gameses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the games in the entity cache if it is enabled.
	 *
	 * @param games the games
	 */
	public static void cacheResult(Games games) {
		getPersistence().cacheResult(games);
	}

	/**
	 * Caches the gameses in the entity cache if it is enabled.
	 *
	 * @param gameses the gameses
	 */
	public static void cacheResult(List<Games> gameses) {
		getPersistence().cacheResult(gameses);
	}

	/**
	 * Creates a new games with the primary key. Does not add the games to the database.
	 *
	 * @param gamesId the primary key for the new games
	 * @return the new games
	 */
	public static Games create(long gamesId) {
		return getPersistence().create(gamesId);
	}

	/**
	 * Removes the games with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gamesId the primary key of the games
	 * @return the games that was removed
	 * @throws NoSuchGamesException if a games with the primary key could not be found
	 */
	public static Games remove(long gamesId)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().remove(gamesId);
	}

	public static Games updateImpl(Games games) {
		return getPersistence().updateImpl(games);
	}

	/**
	 * Returns the games with the primary key or throws a <code>NoSuchGamesException</code> if it could not be found.
	 *
	 * @param gamesId the primary key of the games
	 * @return the games
	 * @throws NoSuchGamesException if a games with the primary key could not be found
	 */
	public static Games findByPrimaryKey(long gamesId)
		throws com.demo.crud.exception.NoSuchGamesException {

		return getPersistence().findByPrimaryKey(gamesId);
	}

	/**
	 * Returns the games with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param gamesId the primary key of the games
	 * @return the games, or <code>null</code> if a games with the primary key could not be found
	 */
	public static Games fetchByPrimaryKey(long gamesId) {
		return getPersistence().fetchByPrimaryKey(gamesId);
	}

	/**
	 * Returns all the gameses.
	 *
	 * @return the gameses
	 */
	public static List<Games> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the gameses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @return the range of gameses
	 */
	public static List<Games> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the gameses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gameses
	 */
	public static List<Games> findAll(
		int start, int end, OrderByComparator<Games> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the gameses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GamesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gameses
	 */
	public static List<Games> findAll(
		int start, int end, OrderByComparator<Games> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the gameses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of gameses.
	 *
	 * @return the number of gameses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static GamesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(GamesPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile GamesPersistence _persistence;

}