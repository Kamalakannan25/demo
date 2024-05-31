/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SportsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SportsLocalService
 * @generated
 */
public class SportsLocalServiceWrapper
	implements ServiceWrapper<SportsLocalService>, SportsLocalService {

	public SportsLocalServiceWrapper() {
		this(null);
	}

	public SportsLocalServiceWrapper(SportsLocalService sportsLocalService) {
		_sportsLocalService = sportsLocalService;
	}

	/**
	 * Adds the sports to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SportsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sports the sports
	 * @return the sports that was added
	 */
	@Override
	public com.demo.crud.model.Sports addSports(
		com.demo.crud.model.Sports sports) {

		return _sportsLocalService.addSports(sports);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sportsLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sports with the primary key. Does not add the sports to the database.
	 *
	 * @param sportsId the primary key for the new sports
	 * @return the new sports
	 */
	@Override
	public com.demo.crud.model.Sports createSports(long sportsId) {
		return _sportsLocalService.createSports(sportsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sportsLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sports with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SportsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports that was removed
	 * @throws PortalException if a sports with the primary key could not be found
	 */
	@Override
	public com.demo.crud.model.Sports deleteSports(long sportsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sportsLocalService.deleteSports(sportsId);
	}

	/**
	 * Deletes the sports from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SportsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sports the sports
	 * @return the sports that was removed
	 */
	@Override
	public com.demo.crud.model.Sports deleteSports(
		com.demo.crud.model.Sports sports) {

		return _sportsLocalService.deleteSports(sports);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sportsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sportsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sportsLocalService.dynamicQuery();
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

		return _sportsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.demo.crud.model.impl.SportsModelImpl</code>.
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

		return _sportsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.demo.crud.model.impl.SportsModelImpl</code>.
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

		return _sportsLocalService.dynamicQuery(
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

		return _sportsLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sportsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.demo.crud.model.Sports fetchSports(long sportsId) {
		return _sportsLocalService.fetchSports(sportsId);
	}

	@Override
	public java.util.List<com.demo.crud.model.Sports> findBySportsName(
		String sportsName) {

		return _sportsLocalService.findBySportsName(sportsName);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sportsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sportsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sportsLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sportsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sports with the primary key.
	 *
	 * @param sportsId the primary key of the sports
	 * @return the sports
	 * @throws PortalException if a sports with the primary key could not be found
	 */
	@Override
	public com.demo.crud.model.Sports getSports(long sportsId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sportsLocalService.getSports(sportsId);
	}

	/**
	 * Returns a range of all the sportses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.demo.crud.model.impl.SportsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sportses
	 * @param end the upper bound of the range of sportses (not inclusive)
	 * @return the range of sportses
	 */
	@Override
	public java.util.List<com.demo.crud.model.Sports> getSportses(
		int start, int end) {

		return _sportsLocalService.getSportses(start, end);
	}

	/**
	 * Returns the number of sportses.
	 *
	 * @return the number of sportses
	 */
	@Override
	public int getSportsesCount() {
		return _sportsLocalService.getSportsesCount();
	}

	@Override
	public java.util.List<com.demo.crud.model.Sports> getSportsTabByName(
		String sportsName) {

		return _sportsLocalService.getSportsTabByName(sportsName);
	}

	/**
	 * Updates the sports in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SportsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sports the sports
	 * @return the sports that was updated
	 */
	@Override
	public com.demo.crud.model.Sports updateSports(
		com.demo.crud.model.Sports sports) {

		return _sportsLocalService.updateSports(sports);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sportsLocalService.getBasePersistence();
	}

	@Override
	public SportsLocalService getWrappedService() {
		return _sportsLocalService;
	}

	@Override
	public void setWrappedService(SportsLocalService sportsLocalService) {
		_sportsLocalService = sportsLocalService;
	}

	private SportsLocalService _sportsLocalService;

}