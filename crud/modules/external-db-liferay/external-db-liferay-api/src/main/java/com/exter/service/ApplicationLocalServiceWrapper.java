/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ApplicationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationLocalService
 * @generated
 */
public class ApplicationLocalServiceWrapper
	implements ApplicationLocalService,
			   ServiceWrapper<ApplicationLocalService> {

	public ApplicationLocalServiceWrapper() {
		this(null);
	}

	public ApplicationLocalServiceWrapper(
		ApplicationLocalService applicationLocalService) {

		_applicationLocalService = applicationLocalService;
	}

	/**
	 * Adds the application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param application the application
	 * @return the application that was added
	 */
	@Override
	public com.exter.model.Application addApplication(
		com.exter.model.Application application) {

		return _applicationLocalService.addApplication(application);
	}

	/**
	 * Creates a new application with the primary key. Does not add the application to the database.
	 *
	 * @param appId the primary key for the new application
	 * @return the new application
	 */
	@Override
	public com.exter.model.Application createApplication(long appId) {
		return _applicationLocalService.createApplication(appId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _applicationLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param application the application
	 * @return the application that was removed
	 */
	@Override
	public com.exter.model.Application deleteApplication(
		com.exter.model.Application application) {

		return _applicationLocalService.deleteApplication(application);
	}

	/**
	 * Deletes the application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appId the primary key of the application
	 * @return the application that was removed
	 * @throws PortalException if a application with the primary key could not be found
	 */
	@Override
	public com.exter.model.Application deleteApplication(long appId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _applicationLocalService.deleteApplication(appId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _applicationLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _applicationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _applicationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _applicationLocalService.dynamicQuery();
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

		return _applicationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.exter.model.impl.ApplicationModelImpl</code>.
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

		return _applicationLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.exter.model.impl.ApplicationModelImpl</code>.
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

		return _applicationLocalService.dynamicQuery(
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

		return _applicationLocalService.dynamicQueryCount(dynamicQuery);
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

		return _applicationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.exter.model.Application fetchApplication(long appId) {
		return _applicationLocalService.fetchApplication(appId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _applicationLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the application with the primary key.
	 *
	 * @param appId the primary key of the application
	 * @return the application
	 * @throws PortalException if a application with the primary key could not be found
	 */
	@Override
	public com.exter.model.Application getApplication(long appId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _applicationLocalService.getApplication(appId);
	}

	/**
	 * Returns a range of all the applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.exter.model.impl.ApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of applications
	 * @param end the upper bound of the range of applications (not inclusive)
	 * @return the range of applications
	 */
	@Override
	public java.util.List<com.exter.model.Application> getApplications(
		int start, int end) {

		return _applicationLocalService.getApplications(start, end);
	}

	/**
	 * Returns the number of applications.
	 *
	 * @return the number of applications
	 */
	@Override
	public int getApplicationsCount() {
		return _applicationLocalService.getApplicationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _applicationLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _applicationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _applicationLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param application the application
	 * @return the application that was updated
	 */
	@Override
	public com.exter.model.Application updateApplication(
		com.exter.model.Application application) {

		return _applicationLocalService.updateApplication(application);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _applicationLocalService.getBasePersistence();
	}

	@Override
	public ApplicationLocalService getWrappedService() {
		return _applicationLocalService;
	}

	@Override
	public void setWrappedService(
		ApplicationLocalService applicationLocalService) {

		_applicationLocalService = applicationLocalService;
	}

	private ApplicationLocalService _applicationLocalService;

}