/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.base;

import com.demo.crud.model.Games;
import com.demo.crud.service.GamesLocalService;
import com.demo.crud.service.GamesLocalServiceUtil;
import com.demo.crud.service.persistence.GamesPersistence;
import com.demo.crud.service.persistence.SportsFinder;
import com.demo.crud.service.persistence.SportsPersistence;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the games local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.demo.crud.service.impl.GamesLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.demo.crud.service.impl.GamesLocalServiceImpl
 * @generated
 */
public abstract class GamesLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, GamesLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>GamesLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>GamesLocalServiceUtil</code>.
	 */

	/**
	 * Adds the games to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GamesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param games the games
	 * @return the games that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Games addGames(Games games) {
		games.setNew(true);

		return gamesPersistence.update(games);
	}

	/**
	 * Creates a new games with the primary key. Does not add the games to the database.
	 *
	 * @param gamesId the primary key for the new games
	 * @return the new games
	 */
	@Override
	@Transactional(enabled = false)
	public Games createGames(long gamesId) {
		return gamesPersistence.create(gamesId);
	}

	/**
	 * Deletes the games with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GamesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param gamesId the primary key of the games
	 * @return the games that was removed
	 * @throws PortalException if a games with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Games deleteGames(long gamesId) throws PortalException {
		return gamesPersistence.remove(gamesId);
	}

	/**
	 * Deletes the games from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GamesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param games the games
	 * @return the games that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Games deleteGames(Games games) {
		return gamesPersistence.remove(games);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return gamesPersistence.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(DSLQuery dslQuery) {
		Long count = dslQuery(dslQuery);

		return count.intValue();
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			Games.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return gamesPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.demo.crud.model.impl.GamesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return gamesPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.demo.crud.model.impl.GamesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return gamesPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return gamesPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return gamesPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Games fetchGames(long gamesId) {
		return gamesPersistence.fetchByPrimaryKey(gamesId);
	}

	/**
	 * Returns the games matching the UUID and group.
	 *
	 * @param uuid the games's UUID
	 * @param groupId the primary key of the group
	 * @return the matching games, or <code>null</code> if a matching games could not be found
	 */
	@Override
	public Games fetchGamesByUuidAndGroupId(String uuid, long groupId) {
		return gamesPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the games with the primary key.
	 *
	 * @param gamesId the primary key of the games
	 * @return the games
	 * @throws PortalException if a games with the primary key could not be found
	 */
	@Override
	public Games getGames(long gamesId) throws PortalException {
		return gamesPersistence.findByPrimaryKey(gamesId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(gamesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Games.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("gamesId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(gamesLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Games.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("gamesId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(gamesLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Games.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("gamesId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Games>() {

				@Override
				public void performAction(Games games) throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, games);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(Games.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return gamesPersistence.create(((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		if (_log.isWarnEnabled()) {
			_log.warn(
				"Implement GamesLocalServiceImpl#deleteGames(Games) to avoid orphaned data");
		}

		return gamesLocalService.deleteGames((Games)persistedModel);
	}

	@Override
	public BasePersistence<Games> getBasePersistence() {
		return gamesPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return gamesPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the gameses matching the UUID and company.
	 *
	 * @param uuid the UUID of the gameses
	 * @param companyId the primary key of the company
	 * @return the matching gameses, or an empty list if no matches were found
	 */
	@Override
	public List<Games> getGamesesByUuidAndCompanyId(
		String uuid, long companyId) {

		return gamesPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of gameses matching the UUID and company.
	 *
	 * @param uuid the UUID of the gameses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching gameses, or an empty list if no matches were found
	 */
	@Override
	public List<Games> getGamesesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Games> orderByComparator) {

		return gamesPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the games matching the UUID and group.
	 *
	 * @param uuid the games's UUID
	 * @param groupId the primary key of the group
	 * @return the matching games
	 * @throws PortalException if a matching games could not be found
	 */
	@Override
	public Games getGamesByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return gamesPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the gameses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.demo.crud.model.impl.GamesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gameses
	 * @param end the upper bound of the range of gameses (not inclusive)
	 * @return the range of gameses
	 */
	@Override
	public List<Games> getGameses(int start, int end) {
		return gamesPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of gameses.
	 *
	 * @return the number of gameses
	 */
	@Override
	public int getGamesesCount() {
		return gamesPersistence.countAll();
	}

	/**
	 * Updates the games in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GamesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param games the games
	 * @return the games that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Games updateGames(Games games) {
		return gamesPersistence.update(games);
	}

	@Deactivate
	protected void deactivate() {
		GamesLocalServiceUtil.setService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			GamesLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		gamesLocalService = (GamesLocalService)aopProxy;

		GamesLocalServiceUtil.setService(gamesLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return GamesLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Games.class;
	}

	protected String getModelClassName() {
		return Games.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = gamesPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	protected GamesLocalService gamesLocalService;

	@Reference
	protected GamesPersistence gamesPersistence;

	@Reference
	protected SportsPersistence sportsPersistence;

	@Reference
	protected SportsFinder sportsFinder;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		GamesLocalServiceBaseImpl.class);

}