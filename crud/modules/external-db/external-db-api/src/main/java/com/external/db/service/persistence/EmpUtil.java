/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.external.db.service.persistence;

import com.external.db.model.Emp;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the emp service. This utility wraps <code>com.external.db.service.persistence.impl.EmpPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpPersistence
 * @generated
 */
public class EmpUtil {

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
	public static void clearCache(Emp emp) {
		getPersistence().clearCache(emp);
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
	public static Map<Serializable, Emp> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Emp> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Emp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Emp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Emp> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Emp update(Emp emp) {
		return getPersistence().update(emp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Emp update(Emp emp, ServiceContext serviceContext) {
		return getPersistence().update(emp, serviceContext);
	}

	/**
	 * Returns all the emps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching emps
	 */
	public static List<Emp> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the emps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of matching emps
	 */
	public static List<Emp> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the emps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emps
	 */
	public static List<Emp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Emp> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the emps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching emps
	 */
	public static List<Emp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Emp> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp
	 * @throws NoSuchEmpException if a matching emp could not be found
	 */
	public static Emp findByUuid_First(
			String uuid, OrderByComparator<Emp> orderByComparator)
		throws com.external.db.exception.NoSuchEmpException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static Emp fetchByUuid_First(
		String uuid, OrderByComparator<Emp> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp
	 * @throws NoSuchEmpException if a matching emp could not be found
	 */
	public static Emp findByUuid_Last(
			String uuid, OrderByComparator<Emp> orderByComparator)
		throws com.external.db.exception.NoSuchEmpException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public static Emp fetchByUuid_Last(
		String uuid, OrderByComparator<Emp> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the emps before and after the current emp in the ordered set where uuid = &#63;.
	 *
	 * @param eId the primary key of the current emp
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp
	 * @throws NoSuchEmpException if a emp with the primary key could not be found
	 */
	public static Emp[] findByUuid_PrevAndNext(
			long eId, String uuid, OrderByComparator<Emp> orderByComparator)
		throws com.external.db.exception.NoSuchEmpException {

		return getPersistence().findByUuid_PrevAndNext(
			eId, uuid, orderByComparator);
	}

	/**
	 * Removes all the emps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of emps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching emps
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Caches the emp in the entity cache if it is enabled.
	 *
	 * @param emp the emp
	 */
	public static void cacheResult(Emp emp) {
		getPersistence().cacheResult(emp);
	}

	/**
	 * Caches the emps in the entity cache if it is enabled.
	 *
	 * @param emps the emps
	 */
	public static void cacheResult(List<Emp> emps) {
		getPersistence().cacheResult(emps);
	}

	/**
	 * Creates a new emp with the primary key. Does not add the emp to the database.
	 *
	 * @param eId the primary key for the new emp
	 * @return the new emp
	 */
	public static Emp create(long eId) {
		return getPersistence().create(eId);
	}

	/**
	 * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eId the primary key of the emp
	 * @return the emp that was removed
	 * @throws NoSuchEmpException if a emp with the primary key could not be found
	 */
	public static Emp remove(long eId)
		throws com.external.db.exception.NoSuchEmpException {

		return getPersistence().remove(eId);
	}

	public static Emp updateImpl(Emp emp) {
		return getPersistence().updateImpl(emp);
	}

	/**
	 * Returns the emp with the primary key or throws a <code>NoSuchEmpException</code> if it could not be found.
	 *
	 * @param eId the primary key of the emp
	 * @return the emp
	 * @throws NoSuchEmpException if a emp with the primary key could not be found
	 */
	public static Emp findByPrimaryKey(long eId)
		throws com.external.db.exception.NoSuchEmpException {

		return getPersistence().findByPrimaryKey(eId);
	}

	/**
	 * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eId the primary key of the emp
	 * @return the emp, or <code>null</code> if a emp with the primary key could not be found
	 */
	public static Emp fetchByPrimaryKey(long eId) {
		return getPersistence().fetchByPrimaryKey(eId);
	}

	/**
	 * Returns all the emps.
	 *
	 * @return the emps
	 */
	public static List<Emp> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @return the range of emps
	 */
	public static List<Emp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emps
	 */
	public static List<Emp> findAll(
		int start, int end, OrderByComparator<Emp> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the emps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>EmpModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of emps
	 * @param end the upper bound of the range of emps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of emps
	 */
	public static List<Emp> findAll(
		int start, int end, OrderByComparator<Emp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the emps from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of emps.
	 *
	 * @return the number of emps
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static EmpPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(EmpPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile EmpPersistence _persistence;

}