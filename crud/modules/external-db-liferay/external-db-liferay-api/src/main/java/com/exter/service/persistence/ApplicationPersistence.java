/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service.persistence;

import com.exter.exception.NoSuchApplicationException;
import com.exter.model.Application;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationUtil
 * @generated
 */
@ProviderType
public interface ApplicationPersistence extends BasePersistence<Application> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ApplicationUtil} to access the application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching applications
	 */
	public java.util.List<Application> findByUuid(String uuid);

	/**
	 * Returns a range of all the applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @return the range of matching applications
	 */
	public java.util.List<Application> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching applications
	 */
	public java.util.List<Application> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Application>
			orderByComparator);

	/**
	 * Returns an ordered range of all the applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching applications
	 */
	public java.util.List<Application> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Application>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application
	 * @throws NoSuchApplicationException if a matching application could not be found
	 */
	public Application findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Application>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the first application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application, or <code>null</code> if a matching application could not be found
	 */
	public Application fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Application>
			orderByComparator);

	/**
	 * Returns the last application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application
	 * @throws NoSuchApplicationException if a matching application could not be found
	 */
	public Application findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Application>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Returns the last application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application, or <code>null</code> if a matching application could not be found
	 */
	public Application fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Application>
			orderByComparator);

	/**
	 * Returns the applications before and after the current application in the ordered set where uuid = &#63;.
	 *
	 * @param appId the primary key of the current application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next application
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	public Application[] findByUuid_PrevAndNext(
			long appId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Application>
				orderByComparator)
		throws NoSuchApplicationException;

	/**
	 * Removes all the applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the application in the entity cache if it is enabled.
	 *
	 * @param application the application
	 */
	public void cacheResult(Application application);

	/**
	 * Caches the applications in the entity cache if it is enabled.
	 *
	 * @param applications the applications
	 */
	public void cacheResult(java.util.List<Application> applications);

	/**
	 * Creates a new application with the primary key. Does not add the application to the database.
	 *
	 * @param appId the primary key for the new application
	 * @return the new application
	 */
	public Application create(long appId);

	/**
	 * Removes the application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appId the primary key of the application
	 * @return the application that was removed
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	public Application remove(long appId) throws NoSuchApplicationException;

	public Application updateImpl(Application application);

	/**
	 * Returns the application with the primary key or throws a <code>NoSuchApplicationException</code> if it could not be found.
	 *
	 * @param appId the primary key of the application
	 * @return the application
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	public Application findByPrimaryKey(long appId)
		throws NoSuchApplicationException;

	/**
	 * Returns the application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appId the primary key of the application
	 * @return the application, or <code>null</code> if a application with the primary key could not be found
	 */
	public Application fetchByPrimaryKey(long appId);

	/**
	 * Returns all the applications.
	 *
	 * @return the applications
	 */
	public java.util.List<Application> findAll();

	/**
	 * Returns a range of all the applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @return the range of applications
	 */
	public java.util.List<Application> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of applications
	 */
	public java.util.List<Application> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Application>
			orderByComparator);

	/**
	 * Returns an ordered range of all the applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of applications
	 */
	public java.util.List<Application> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Application>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of applications.
	 *
	 * @return the number of applications
	 */
	public int countAll();

}