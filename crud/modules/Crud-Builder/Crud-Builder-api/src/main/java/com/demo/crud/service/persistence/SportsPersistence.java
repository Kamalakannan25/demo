/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.persistence;

import com.demo.crud.exception.NoSuchSportsException;
import com.demo.crud.model.Sports;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sports service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SportsUtil
 * @generated
 */
@ProviderType
public interface SportsPersistence extends BasePersistence<Sports> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SportsUtil} to access the sports persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sportses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sportses
	 */
	public java.util.List<Sports> findByUuid(String uuid);

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
	public java.util.List<Sports> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Sports> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator);

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
	public java.util.List<Sports> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public Sports findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sports>
				orderByComparator)
		throws NoSuchSportsException;

	/**
	 * Returns the first sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public Sports fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator);

	/**
	 * Returns the last sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public Sports findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sports>
				orderByComparator)
		throws NoSuchSportsException;

	/**
	 * Returns the last sports in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public Sports fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator);

	/**
	 * Returns the sportses before and after the current sports in the ordered set where uuid = &#63;.
	 *
	 * @param sportsId the primary key of the current sports
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	public Sports[] findByUuid_PrevAndNext(
			long sportsId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Sports>
				orderByComparator)
		throws NoSuchSportsException;

	/**
	 * Removes all the sportses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of sportses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sportses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns all the sportses where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @return the matching sportses
	 */
	public java.util.List<Sports> findBysportsName(String sportsName);

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
	public java.util.List<Sports> findBysportsName(
		String sportsName, int start, int end);

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
	public java.util.List<Sports> findBysportsName(
		String sportsName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator);

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
	public java.util.List<Sports> findBysportsName(
		String sportsName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public Sports findBysportsName_First(
			String sportsName,
			com.liferay.portal.kernel.util.OrderByComparator<Sports>
				orderByComparator)
		throws NoSuchSportsException;

	/**
	 * Returns the first sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public Sports fetchBysportsName_First(
		String sportsName,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator);

	/**
	 * Returns the last sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports
	 * @throws NoSuchSportsException if a matching sports could not be found
	 */
	public Sports findBysportsName_Last(
			String sportsName,
			com.liferay.portal.kernel.util.OrderByComparator<Sports>
				orderByComparator)
		throws NoSuchSportsException;

	/**
	 * Returns the last sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sports, or <code>null</code> if a matching sports could not be found
	 */
	public Sports fetchBysportsName_Last(
		String sportsName,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator);

	/**
	 * Returns the sportses before and after the current sports in the ordered set where sportsName = &#63;.
	 *
	 * @param sportsId the primary key of the current sports
	 * @param sportsName the sports name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	public Sports[] findBysportsName_PrevAndNext(
			long sportsId, String sportsName,
			com.liferay.portal.kernel.util.OrderByComparator<Sports>
				orderByComparator)
		throws NoSuchSportsException;

	/**
	 * Removes all the sportses where sportsName = &#63; from the database.
	 *
	 * @param sportsName the sports name
	 */
	public void removeBysportsName(String sportsName);

	/**
	 * Returns the number of sportses where sportsName = &#63;.
	 *
	 * @param sportsName the sports name
	 * @return the number of matching sportses
	 */
	public int countBysportsName(String sportsName);

	/**
	 * Caches the sports in the entity cache if it is enabled.
	 *
	 * @param sports the sports
	 */
	public void cacheResult(Sports sports);

	/**
	 * Caches the sportses in the entity cache if it is enabled.
	 *
	 * @param sportses the sportses
	 */
	public void cacheResult(java.util.List<Sports> sportses);

	/**
	 * Creates a new sports with the primary key. Does not add the sports to the database.
	 *
	 * @param sportsId the primary key for the new sports
	 * @return the new sports
	 */
	public Sports create(long sportsId);

	/**
	 * Removes the sports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports that was removed
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	public Sports remove(long sportsId) throws NoSuchSportsException;

	public Sports updateImpl(Sports sports);

	/**
	 * Returns the sports with the primary key or throws a <code>NoSuchSportsException</code> if it could not be found.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports
	 * @throws NoSuchSportsException if a sports with the primary key could not be found
	 */
	public Sports findByPrimaryKey(long sportsId) throws NoSuchSportsException;

	/**
	 * Returns the sports with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports, or <code>null</code> if a sports with the primary key could not be found
	 */
	public Sports fetchByPrimaryKey(long sportsId);

	/**
	 * Returns all the sportses.
	 *
	 * @return the sportses
	 */
	public java.util.List<Sports> findAll();

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
	public java.util.List<Sports> findAll(int start, int end);

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
	public java.util.List<Sports> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator);

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
	public java.util.List<Sports> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Sports>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sportses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sportses.
	 *
	 * @return the number of sportses
	 */
	public int countAll();

}