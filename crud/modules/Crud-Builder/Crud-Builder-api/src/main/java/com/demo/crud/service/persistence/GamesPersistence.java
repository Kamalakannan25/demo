/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.persistence;

import com.demo.crud.exception.NoSuchGamesException;
import com.demo.crud.model.Games;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the games service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see GamesUtil
 * @generated
 */
@ProviderType
public interface GamesPersistence extends BasePersistence<Games> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GamesUtil} to access the games persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the gameses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching gameses
	 */
	public java.util.List<Games> findByUuid(String uuid);

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
	public java.util.List<Games> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Games> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Games>
			orderByComparator);

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
	public java.util.List<Games> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Games>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching games
	 * @throws NoSuchGamesException if a matching games could not be found
	 */
	public Games findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Games>
				orderByComparator)
		throws NoSuchGamesException;

	/**
	 * Returns the first games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching games, or <code>null</code> if a matching games could not be found
	 */
	public Games fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Games>
			orderByComparator);

	/**
	 * Returns the last games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching games
	 * @throws NoSuchGamesException if a matching games could not be found
	 */
	public Games findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Games>
				orderByComparator)
		throws NoSuchGamesException;

	/**
	 * Returns the last games in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching games, or <code>null</code> if a matching games could not be found
	 */
	public Games fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Games>
			orderByComparator);

	/**
	 * Returns the gameses before and after the current games in the ordered set where uuid = &#63;.
	 *
	 * @param gamesId the primary key of the current games
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next games
	 * @throws NoSuchGamesException if a games with the primary key could not be found
	 */
	public Games[] findByUuid_PrevAndNext(
			long gamesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Games>
				orderByComparator)
		throws NoSuchGamesException;

	/**
	 * Removes all the gameses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of gameses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching gameses
	 */
	public int countByUuid(String uuid);

	/**
	 * Caches the games in the entity cache if it is enabled.
	 *
	 * @param games the games
	 */
	public void cacheResult(Games games);

	/**
	 * Caches the gameses in the entity cache if it is enabled.
	 *
	 * @param gameses the gameses
	 */
	public void cacheResult(java.util.List<Games> gameses);

	/**
	 * Creates a new games with the primary key. Does not add the games to the database.
	 *
	 * @param gamesId the primary key for the new games
	 * @return the new games
	 */
	public Games create(long gamesId);

	/**
	 * Removes the games with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gamesId the primary key of the games
	 * @return the games that was removed
	 * @throws NoSuchGamesException if a games with the primary key could not be found
	 */
	public Games remove(long gamesId) throws NoSuchGamesException;

	public Games updateImpl(Games games);

	/**
	 * Returns the games with the primary key or throws a <code>NoSuchGamesException</code> if it could not be found.
	 *
	 * @param gamesId the primary key of the games
	 * @return the games
	 * @throws NoSuchGamesException if a games with the primary key could not be found
	 */
	public Games findByPrimaryKey(long gamesId) throws NoSuchGamesException;

	/**
	 * Returns the games with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param gamesId the primary key of the games
	 * @return the games, or <code>null</code> if a games with the primary key could not be found
	 */
	public Games fetchByPrimaryKey(long gamesId);

	/**
	 * Returns all the gameses.
	 *
	 * @return the gameses
	 */
	public java.util.List<Games> findAll();

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
	public java.util.List<Games> findAll(int start, int end);

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
	public java.util.List<Games> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Games>
			orderByComparator);

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
	public java.util.List<Games> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Games>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the gameses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of gameses.
	 *
	 * @return the number of gameses
	 */
	public int countAll();

}