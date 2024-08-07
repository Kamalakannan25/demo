/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link VlogLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VlogLocalService
 * @generated
 */
public class VlogLocalServiceWrapper
	implements ServiceWrapper<VlogLocalService>, VlogLocalService {

	public VlogLocalServiceWrapper() {
		this(null);
	}

	public VlogLocalServiceWrapper(VlogLocalService vlogLocalService) {
		_vlogLocalService = vlogLocalService;
	}

	/**
	 * Adds the vlog to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VlogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vlog the vlog
	 * @return the vlog that was added
	 */
	@Override
	public com.exter.model.Vlog addVlog(com.exter.model.Vlog vlog) {
		return _vlogLocalService.addVlog(vlog);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vlogLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new vlog with the primary key. Does not add the vlog to the database.
	 *
	 * @param vlogId the primary key for the new vlog
	 * @return the new vlog
	 */
	@Override
	public com.exter.model.Vlog createVlog(long vlogId) {
		return _vlogLocalService.createVlog(vlogId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vlogLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the vlog with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VlogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog that was removed
	 * @throws PortalException if a vlog with the primary key could not be found
	 */
	@Override
	public com.exter.model.Vlog deleteVlog(long vlogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vlogLocalService.deleteVlog(vlogId);
	}

	/**
	 * Deletes the vlog from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VlogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vlog the vlog
	 * @return the vlog that was removed
	 */
	@Override
	public com.exter.model.Vlog deleteVlog(com.exter.model.Vlog vlog) {
		return _vlogLocalService.deleteVlog(vlog);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _vlogLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _vlogLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vlogLocalService.dynamicQuery();
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

		return _vlogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.exter.model.impl.VlogModelImpl</code>.
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

		return _vlogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.exter.model.impl.VlogModelImpl</code>.
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

		return _vlogLocalService.dynamicQuery(
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

		return _vlogLocalService.dynamicQueryCount(dynamicQuery);
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

		return _vlogLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.exter.model.Vlog fetchVlog(long vlogId) {
		return _vlogLocalService.fetchVlog(vlogId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _vlogLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _vlogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _vlogLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vlogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the vlog with the primary key.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog
	 * @throws PortalException if a vlog with the primary key could not be found
	 */
	@Override
	public com.exter.model.Vlog getVlog(long vlogId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vlogLocalService.getVlog(vlogId);
	}

	/**
	 * Returns a range of all the vlogs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.exter.model.impl.VlogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @return the range of vlogs
	 */
	@Override
	public java.util.List<com.exter.model.Vlog> getVlogs(int start, int end) {
		return _vlogLocalService.getVlogs(start, end);
	}

	/**
	 * Returns the number of vlogs.
	 *
	 * @return the number of vlogs
	 */
	@Override
	public int getVlogsCount() {
		return _vlogLocalService.getVlogsCount();
	}

	/**
	 * Updates the vlog in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect VlogLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param vlog the vlog
	 * @return the vlog that was updated
	 */
	@Override
	public com.exter.model.Vlog updateVlog(com.exter.model.Vlog vlog) {
		return _vlogLocalService.updateVlog(vlog);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _vlogLocalService.getBasePersistence();
	}

	@Override
	public VlogLocalService getWrappedService() {
		return _vlogLocalService;
	}

	@Override
	public void setWrappedService(VlogLocalService vlogLocalService) {
		_vlogLocalService = vlogLocalService;
	}

	private VlogLocalService _vlogLocalService;

}