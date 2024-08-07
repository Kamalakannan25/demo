/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service.persistence;

import com.exter.exception.NoSuchVlogException;
import com.exter.model.Vlog;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the vlog service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VlogUtil
 * @generated
 */
@ProviderType
public interface VlogPersistence extends BasePersistence<Vlog> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VlogUtil} to access the vlog persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the vlogs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vlogs
	 */
	public java.util.List<Vlog> findByUuid(String uuid);

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
	public java.util.List<Vlog> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Vlog> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vlog>
			orderByComparator);

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
	public java.util.List<Vlog> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vlog>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vlog
	 * @throws NoSuchVlogException if a matching vlog could not be found
	 */
	public Vlog findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Vlog>
				orderByComparator)
		throws NoSuchVlogException;

	/**
	 * Returns the first vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vlog, or <code>null</code> if a matching vlog could not be found
	 */
	public Vlog fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vlog>
			orderByComparator);

	/**
	 * Returns the last vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vlog
	 * @throws NoSuchVlogException if a matching vlog could not be found
	 */
	public Vlog findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Vlog>
				orderByComparator)
		throws NoSuchVlogException;

	/**
	 * Returns the last vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vlog, or <code>null</code> if a matching vlog could not be found
	 */
	public Vlog fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vlog>
			orderByComparator);

	/**
	 * Returns the vlogs before and after the current vlog in the ordered set where uuid = &#63;.
	 *
	 * @param vlogId the primary key of the current vlog
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vlog
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	public Vlog[] findByUuid_PrevAndNext(
			long vlogId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Vlog>
				orderByComparator)
		throws NoSuchVlogException;

	/**
	 * Removes all the vlogs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of vlogs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vlogs
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the vlog in the entity cache if it is enabled.
	 *
	 * @param vlog the vlog
	 */
	public void cacheResult(Vlog vlog);

	/**
	 * Caches the vlogs in the entity cache if it is enabled.
	 *
	 * @param vlogs the vlogs
	 */
	public void cacheResult(java.util.List<Vlog> vlogs);

	/**
	 * Creates a new vlog with the primary key. Does not add the vlog to the database.
	 *
	 * @param vlogId the primary key for the new vlog
	 * @return the new vlog
	 */
	public Vlog create(long vlogId);

	/**
	 * Removes the vlog with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog that was removed
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	public Vlog remove(long vlogId) throws NoSuchVlogException;

	public Vlog updateImpl(Vlog vlog);

	/**
	 * Returns the vlog with the primary key or throws a <code>NoSuchVlogException</code> if it could not be found.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	public Vlog findByPrimaryKey(long vlogId) throws NoSuchVlogException;

	/**
	 * Returns the vlog with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog, or <code>null</code> if a vlog with the primary key could not be found
	 */
	public Vlog fetchByPrimaryKey(long vlogId);

	/**
	 * Returns all the vlogs.
	 *
	 * @return the vlogs
	 */
	public java.util.List<Vlog> findAll();

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
	public java.util.List<Vlog> findAll(int start, int end);

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
	public java.util.List<Vlog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vlog>
			orderByComparator);

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
	public java.util.List<Vlog> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vlog>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the vlogs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of vlogs.
	 *
	 * @return the number of vlogs
	 */
	public int countAll();

}