/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.persistence;

import com.demo.crud.model.Sports;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sports service. This utility wraps <code>com.demo.crud.service.persistence.impl.SportsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SportsPersistence
 * @generated
 */
public class SportsUtil {

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
	public static void clearCache(Sports sports) {
		getPersistence().clearCache(sports);
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
	public static Map<Serializable, Sports> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Sports> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Sports> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Sports> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Sports> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Sports update(Sports sports) {
		return getPersistence().update(sports);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Sports update(Sports sports, ServiceContext serviceContext) {
		return getPersistence().update(sports, serviceContext);
	}

	/**
	 * Returns all the sportses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sportses
	 */
	public static List<Sports> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
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
	public static List<Sports> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
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
	public static List<Sports> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sports> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
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
	public static List<Sports> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Sports> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public static Sports findByUuid_First(
			String uuid, OrderByComparator<Sports> orderByComparator)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public static Sports fetchByUuid_First(
		String uuid, OrderByComparator<Sports> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public static Sports findByUuid_Last(
			String uuid, OrderByComparator<Sports> orderByComparator)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public static Sports fetchByUuid_Last(
		String uuid, OrderByComparator<Sports> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
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
	public static Sports[] findByUuid_PrevAndNext(
			long sportsId, String uuid,
			OrderByComparator<Sports> orderByComparator)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().findByUuid_PrevAndNext(
			sportsId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sportses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sportses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sportses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns all the sportses where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @return the matching sportses
	 */
	public static List<Sports> findBysportsName(String sportsName) {
		return getPersistence().findBysportsName(sportsName);
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
	public static List<Sports> findBysportsName(
		String sportsName, int start, int end) {

		return getPersistence().findBysportsName(sportsName, start, end);
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
	public static List<Sports> findBysportsName(
		String sportsName, int start, int end,
		OrderByComparator<Sports> orderByComparator) {

		return getPersistence().findBysportsName(
			sportsName, start, end, orderByComparator);
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
	public static List<Sports> findBysportsName(
		String sportsName, int start, int end,
		OrderByComparator<Sports> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBysportsName(
			sportsName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public static Sports findBysportsName_First(
			String sportsName, OrderByComparator<Sports> orderByComparator)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().findBysportsName_First(
			sportsName, orderByComparator);
	}

	/**
	 * Returns the first sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public static Sports fetchBysportsName_First(
		String sportsName, OrderByComparator<Sports> orderByComparator) {

		return getPersistence().fetchBysportsName_First(
			sportsName, orderByComparator);
	}

	/**
	 * Returns the last sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public static Sports findBysportsName_Last(
			String sportsName, OrderByComparator<Sports> orderByComparator)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().findBysportsName_Last(
			sportsName, orderByComparator);
	}

	/**
	 * Returns the last sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public static Sports fetchBysportsName_Last(
		String sportsName, OrderByComparator<Sports> orderByComparator) {

		return getPersistence().fetchBysportsName_Last(
			sportsName, orderByComparator);
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
	public static Sports[] findBysportsName_PrevAndNext(
			long sportsId, String sportsName,
			OrderByComparator<Sports> orderByComparator)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().findBysportsName_PrevAndNext(
			sportsId, sportsName, orderByComparator);
	}

	/**
	 * Removes all the sportses where sportsName = &#63; from the database.
	 *
	 * @param sportsName the sports name
	 */
	public static void removeBysportsName(String sportsName) {
		getPersistence().removeBysportsName(sportsName);
	}

	/**
	 * Returns the number of sportses where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @return the number of matching sportses
	 */
	public static int countBysportsName(String sportsName) {
		return getPersistence().countBysportsName(sportsName);
	}

	/**
	 * Caches the sports in the entity cache if it is enabled.
	 *
	 * @param sports the sports
	 */
	public static void cacheResult(Sports sports) {
		getPersistence().cacheResult(sports);
	}

	/**
	 * Caches the sportses in the entity cache if it is enabled.
	 *
	 * @param sportses the sportses
	 */
	public static void cacheResult(List<Sports> sportses) {
		getPersistence().cacheResult(sportses);
	}

	/**
	 * Creates a new sports with the primary key. Does not add the sports to the database.
	 *
	 * @param sportsId the primary key for the new sports
	 * @return the new sports
	 */
	public static Sports create(long sportsId) {
		return getPersistence().create(sportsId);
	}

	/**
	 * Removes the sports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports that was removed
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	public static Sports remove(long sportsId)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().remove(sportsId);
	}

	public static Sports updateImpl(Sports sports) {
		return getPersistence().updateImpl(sports);
	}

	/**
	 * Returns the sports with the primary key or throws a <code>NoSuchSportsException</code> if it could not be found.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	public static Sports findByPrimaryKey(long sportsId)
		throws com.demo.crud.exception.NoSuchSportsException {

		return getPersistence().findByPrimaryKey(sportsId);
	}

	/**
	 * Returns the sports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports, or <code>null</code> if a sports with the primary key could not be found
	 */
	public static Sports fetchByPrimaryKey(long sportsId) {
		return getPersistence().fetchByPrimaryKey(sportsId);
	}

	/**
	 * Returns all the sportses.
	 *
	 * @return the sportses
	 */
	public static List<Sports> findAll() {
		return getPersistence().findAll();
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
	public static List<Sports> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Sports> findAll(
		int start, int end, OrderByComparator<Sports> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Sports> findAll(
		int start, int end, OrderByComparator<Sports> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sportses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sportses.
	 *
	 * @return the number of sportses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SportsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(SportsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile SportsPersistence _persistence;

}