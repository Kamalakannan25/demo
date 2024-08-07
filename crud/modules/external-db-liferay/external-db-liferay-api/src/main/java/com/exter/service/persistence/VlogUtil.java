/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service.persistence;

import com.exter.model.Vlog;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the vlog service. This utility wraps <code>com.exter.service.persistence.impl.VlogPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VlogPersistence
 * @generated
 */
public class VlogUtil {

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
	public static void clearCache(Vlog vlog) {
		getPersistence().clearCache(vlog);
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
	public static Map<Serializable, Vlog> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Vlog> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Vlog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Vlog> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Vlog> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Vlog update(Vlog vlog) {
		return getPersistence().update(vlog);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Vlog update(Vlog vlog, ServiceContext serviceContext) {
		return getPersistence().update(vlog, serviceContext);
	}

	/**
	 * Returns all the vlogs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vlogs
	 */
	public static List<Vlog> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the vlogs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @return the range of matching vlogs
	 */
	public static List<Vlog> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the vlogs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vlogs
	 */
	public static List<Vlog> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Vlog> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vlogs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vlogs
	 */
	public static List<Vlog> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Vlog> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vlog
	 * @throws NoSuchVlogException if a matching vlog could not be found
	 */
	public static Vlog findByUuid_First(
			String uuid, OrderByComparator<Vlog> orderByComparator)
		throws com.exter.exception.NoSuchVlogException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vlog, or <code>null</code> if a matching vlog could not be found
	 */
	public static Vlog fetchByUuid_First(
		String uuid, OrderByComparator<Vlog> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vlog
	 * @throws NoSuchVlogException if a matching vlog could not be found
	 */
	public static Vlog findByUuid_Last(
			String uuid, OrderByComparator<Vlog> orderByComparator)
		throws com.exter.exception.NoSuchVlogException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vlog, or <code>null</code> if a matching vlog could not be found
	 */
	public static Vlog fetchByUuid_Last(
		String uuid, OrderByComparator<Vlog> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the vlogs before and after the current vlog in the ordered set where uuid = &#63;.
	 *
	 * @param vlogId the primary key of the current vlog
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vlog
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	public static Vlog[] findByUuid_PrevAndNext(
			long vlogId, String uuid, OrderByComparator<Vlog> orderByComparator)
		throws com.exter.exception.NoSuchVlogException {

		return getPersistence().findByUuid_PrevAndNext(
			vlogId, uuid, orderByComparator);
	}

	/**
	 * Removes all the vlogs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of vlogs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vlogs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the vlog in the entity cache if it is enabled.
	 *
	 * @param vlog the vlog
	 */
	public static void cacheResult(Vlog vlog) {
		getPersistence().cacheResult(vlog);
	}

	/**
	 * Caches the vlogs in the entity cache if it is enabled.
	 *
	 * @param vlogs the vlogs
	 */
	public static void cacheResult(List<Vlog> vlogs) {
		getPersistence().cacheResult(vlogs);
	}

	/**
	 * Creates a new vlog with the primary key. Does not add the vlog to the database.
	 *
	 * @param vlogId the primary key for the new vlog
	 * @return the new vlog
	 */
	public static Vlog create(long vlogId) {
		return getPersistence().create(vlogId);
	}

	/**
	 * Removes the vlog with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog that was removed
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	public static Vlog remove(long vlogId)
		throws com.exter.exception.NoSuchVlogException {

		return getPersistence().remove(vlogId);
	}

	public static Vlog updateImpl(Vlog vlog) {
		return getPersistence().updateImpl(vlog);
	}

	/**
	 * Returns the vlog with the primary key or throws a <code>NoSuchVlogException</code> if it could not be found.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	public static Vlog findByPrimaryKey(long vlogId)
		throws com.exter.exception.NoSuchVlogException {

		return getPersistence().findByPrimaryKey(vlogId);
	}

	/**
	 * Returns the vlog with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog, or <code>null</code> if a vlog with the primary key could not be found
	 */
	public static Vlog fetchByPrimaryKey(long vlogId) {
		return getPersistence().fetchByPrimaryKey(vlogId);
	}

	/**
	 * Returns all the vlogs.
	 *
	 * @return the vlogs
	 */
	public static List<Vlog> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the vlogs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @return the range of vlogs
	 */
	public static List<Vlog> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the vlogs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vlogs
	 */
	public static List<Vlog> findAll(
		int start, int end, OrderByComparator<Vlog> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vlogs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of vlogs
	 */
	public static List<Vlog> findAll(
		int start, int end, OrderByComparator<Vlog> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the vlogs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of vlogs.
	 *
	 * @return the number of vlogs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VlogPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(VlogPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile VlogPersistence _persistence;

}