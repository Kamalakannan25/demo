/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link PlayersLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlayersLocalService
 * @generated
 */
public class PlayersLocalServiceWrapper
	implements PlayersLocalService, ServiceWrapper<PlayersLocalService> {

	public PlayersLocalServiceWrapper() {
		this(null);
	}

	public PlayersLocalServiceWrapper(PlayersLocalService playersLocalService) {
		_playersLocalService = playersLocalService;
	}

	/**
	 * Adds the players to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlayersLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param players the players
	 * @return the players that was added
	 */
	@Override
	public com.excel.model.Players addPlayers(com.excel.model.Players players) {
		return _playersLocalService.addPlayers(players);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _playersLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new players with the primary key. Does not add the players to the database.
	 *
	 * @param playersId the primary key for the new players
	 * @return the new players
	 */
	@Override
	public com.excel.model.Players createPlayers(long playersId) {
		return _playersLocalService.createPlayers(playersId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _playersLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the players with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlayersLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param playersId the primary key of the players
	 * @return the players that was removed
	 * @throws PortalException if a players with the primary key could not be found
	 */
	@Override
	public com.excel.model.Players deletePlayers(long playersId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _playersLocalService.deletePlayers(playersId);
	}

	/**
	 * Deletes the players from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlayersLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param players the players
	 * @return the players that was removed
	 */
	@Override
	public com.excel.model.Players deletePlayers(
		com.excel.model.Players players) {

		return _playersLocalService.deletePlayers(players);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _playersLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _playersLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _playersLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _playersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.excel.model.impl.PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _playersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.excel.model.impl.PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _playersLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _playersLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _playersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.excel.model.Players fetchPlayers(long playersId) {
		return _playersLocalService.fetchPlayers(playersId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _playersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _playersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _playersLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _playersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the players with the primary key.
	 *
	 * @param playersId the primary key of the players
	 * @return the players
	 * @throws PortalException if a players with the primary key could not be found
	 */
	@Override
	public com.excel.model.Players getPlayers(long playersId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _playersLocalService.getPlayers(playersId);
	}

	/**
	 * Returns a range of all the playerses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.excel.model.impl.PlayersModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of playerses
	 * @param end the upper bound of the range of playerses (not inclusive)
	 * @return the range of playerses
	 */
	@Override
	public java.util.List<com.excel.model.Players> getPlayerses(
		int start, int end) {

		return _playersLocalService.getPlayerses(start, end);
	}

	/**
	 * Returns the number of playerses.
	 *
	 * @return the number of playerses
	 */
	@Override
	public int getPlayersesCount() {
		return _playersLocalService.getPlayersesCount();
	}

	/**
	 * Updates the players in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlayersLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param players the players
	 * @return the players that was updated
	 */
	@Override
	public com.excel.model.Players updatePlayers(
		com.excel.model.Players players) {

		return _playersLocalService.updatePlayers(players);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _playersLocalService.getBasePersistence();
	}

	@Override
	public PlayersLocalService getWrappedService() {
		return _playersLocalService;
	}

	@Override
	public void setWrappedService(PlayersLocalService playersLocalService) {
		_playersLocalService = playersLocalService;
	}

	private PlayersLocalService _playersLocalService;

}