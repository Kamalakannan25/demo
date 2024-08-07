/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.external.db.service.persistence;

import com.external.db.exception.NoSuchEmpException;
import com.external.db.model.Emp;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the emp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpUtil
 * @generated
 */
@ProviderType
public interface EmpPersistence extends BasePersistence<Emp> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpUtil} to access the emp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the emps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching emps
	 */
	public java.util.List<Emp> findByUuid(String uuid);

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
	public java.util.List<Emp> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Emp> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Emp>
			orderByComparator);

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
	public java.util.List<Emp> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Emp> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp
	 * @throws NoSuchEmpException if a matching emp could not be found
	 */
	public Emp findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Emp>
				orderByComparator)
		throws NoSuchEmpException;

	/**
	 * Returns the first emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public Emp fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Emp>
			orderByComparator);

	/**
	 * Returns the last emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp
	 * @throws NoSuchEmpException if a matching emp could not be found
	 */
	public Emp findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Emp>
				orderByComparator)
		throws NoSuchEmpException;

	/**
	 * Returns the last emp in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp, or <code>null</code> if a matching emp could not be found
	 */
	public Emp fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Emp>
			orderByComparator);

	/**
	 * Returns the emps before and after the current emp in the ordered set where uuid = &#63;.
	 *
	 * @param eId the primary key of the current emp
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp
	 * @throws NoSuchEmpException if a emp with the primary key could not be found
	 */
	public Emp[] findByUuid_PrevAndNext(
			long eId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Emp>
				orderByComparator)
		throws NoSuchEmpException;

	/**
	 * Removes all the emps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of emps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching emps
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the emp in the entity cache if it is enabled.
	 *
	 * @param emp the emp
	 */
	public void cacheResult(Emp emp);

	/**
	 * Caches the emps in the entity cache if it is enabled.
	 *
	 * @param emps the emps
	 */
	public void cacheResult(java.util.List<Emp> emps);

	/**
	 * Creates a new emp with the primary key. Does not add the emp to the database.
	 *
	 * @param eId the primary key for the new emp
	 * @return the new emp
	 */
	public Emp create(long eId);

	/**
	 * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param eId the primary key of the emp
	 * @return the emp that was removed
	 * @throws NoSuchEmpException if a emp with the primary key could not be found
	 */
	public Emp remove(long eId) throws NoSuchEmpException;

	public Emp updateImpl(Emp emp);

	/**
	 * Returns the emp with the primary key or throws a <code>NoSuchEmpException</code> if it could not be found.
	 *
	 * @param eId the primary key of the emp
	 * @return the emp
	 * @throws NoSuchEmpException if a emp with the primary key could not be found
	 */
	public Emp findByPrimaryKey(long eId) throws NoSuchEmpException;

	/**
	 * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param eId the primary key of the emp
	 * @return the emp, or <code>null</code> if a emp with the primary key could not be found
	 */
	public Emp fetchByPrimaryKey(long eId);

	/**
	 * Returns all the emps.
	 *
	 * @return the emps
	 */
	public java.util.List<Emp> findAll();

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
	public java.util.List<Emp> findAll(int start, int end);

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
	public java.util.List<Emp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Emp>
			orderByComparator);

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
	public java.util.List<Emp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Emp> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the emps from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of emps.
	 *
	 * @return the number of emps
	 */
	public int countAll();

}