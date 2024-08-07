/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.service.persistence;

import com.excel.exception.NoSuchPlayersException;
import com.excel.model.Players;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the players service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlayersUtil
 * @generated
 */
@ProviderType
public interface PlayersPersistence extends BasePersistence<Players> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PlayersUtil} to access the players persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the playerses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching playerses
	 */
	public java.util.List<Players> findByUuid(String uuid);

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
	public java.util.List<Players> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Players> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Players>
			orderByComparator);

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
	public java.util.List<Players> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Players>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching players
	 * @throws NoSuchPlayersException if a matching players could not be found
	 */
	public Players findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Players>
				orderByComparator)
		throws NoSuchPlayersException;

	/**
	 * Returns the first players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching players, or <code>null</code> if a matching players could not be found
	 */
	public Players fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Players>
			orderByComparator);

	/**
	 * Returns the last players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching players
	 * @throws NoSuchPlayersException if a matching players could not be found
	 */
	public Players findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Players>
				orderByComparator)
		throws NoSuchPlayersException;

	/**
	 * Returns the last players in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching players, or <code>null</code> if a matching players could not be found
	 */
	public Players fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Players>
			orderByComparator);

	/**
	 * Returns the playerses before and after the current players in the ordered set where uuid = &#63;.
	 *
	 * @param playersId the primary key of the current players
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next players
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	public Players[] findByUuid_PrevAndNext(
			long playersId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Players>
				orderByComparator)
		throws NoSuchPlayersException;

	/**
	 * Removes all the playerses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of playerses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching playerses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the players in the entity cache if it is enabled.
	 *
	 * @param players the players
	 */
	public void cacheResult(Players players);

	/**
	 * Caches the playerses in the entity cache if it is enabled.
	 *
	 * @param playerses the playerses
	 */
	public void cacheResult(java.util.List<Players> playerses);

	/**
	 * Creates a new players with the primary key. Does not add the players to the database.
	 *
	 * @param playersId the primary key for the new players
	 * @return the new players
	 */
	public Players create(long playersId);

	/**
	 * Removes the players with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param playersId the primary key of the players
	 * @return the players that was removed
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	public Players remove(long playersId) throws NoSuchPlayersException;

	public Players updateImpl(Players players);

	/**
	 * Returns the players with the primary key or throws a <code>NoSuchPlayersException</code> if it could not be found.
	 *
	 * @param playersId the primary key of the players
	 * @return the players
	 * @throws NoSuchPlayersException if a players with the primary key could not be found
	 */
	public Players findByPrimaryKey(long playersId)
		throws NoSuchPlayersException;

	/**
	 * Returns the players with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param playersId the primary key of the players
	 * @return the players, or <code>null</code> if a players with the primary key could not be found
	 */
	public Players fetchByPrimaryKey(long playersId);

	/**
	 * Returns all the playerses.
	 *
	 * @return the playerses
	 */
	public java.util.List<Players> findAll();

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
	public java.util.List<Players> findAll(int start, int end);

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
	public java.util.List<Players> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Players>
			orderByComparator);

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
	public java.util.List<Players> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Players>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the playerses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of playerses.
	 *
	 * @return the number of playerses
	 */
	public int countAll();

}