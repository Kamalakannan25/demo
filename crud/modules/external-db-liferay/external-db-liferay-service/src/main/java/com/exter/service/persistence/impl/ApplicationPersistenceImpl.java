/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service.persistence.impl;

import com.exter.exception.NoSuchApplicationException;
import com.exter.model.Application;
import com.exter.model.ApplicationTable;
import com.exter.model.impl.ApplicationImpl;
import com.exter.model.impl.ApplicationModelImpl;
import com.exter.service.persistence.ApplicationPersistence;
import com.exter.service.persistence.ApplicationUtil;
import com.exter.service.persistence.impl.constants.APPLICATIONPersistenceConstants;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ApplicationPersistence.class)
public class ApplicationPersistenceImpl
	extends BasePersistenceImpl<Application> implements ApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ApplicationUtil</code> to access the application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching applications
	 */
	@Override
	public List<Application> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Application> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Application> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Application> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Application> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Application> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Application> list = null;

		if (useFinderCache) {
			list = (List<Application>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Application application : list) {
					if (!uuid.equals(application.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_APPLICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<Application>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application
	 * @throws NoSuchApplicationException if a matching application could not be found
	 */
	@Override
	public Application findByUuid_First(
			String uuid, OrderByComparator<Application> orderByComparator)
		throws NoSuchApplicationException {

		Application application = fetchByUuid_First(uuid, orderByComparator);

		if (application != null) {
			return application;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchApplicationException(sb.toString());
	}

	/**
	 * Returns the first application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching application, or <code>null</code> if a matching application could not be found
	 */
	@Override
	public Application fetchByUuid_First(
		String uuid, OrderByComparator<Application> orderByComparator) {

		List<Application> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application
	 * @throws NoSuchApplicationException if a matching application could not be found
	 */
	@Override
	public Application findByUuid_Last(
			String uuid, OrderByComparator<Application> orderByComparator)
		throws NoSuchApplicationException {

		Application application = fetchByUuid_Last(uuid, orderByComparator);

		if (application != null) {
			return application;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchApplicationException(sb.toString());
	}

	/**
	 * Returns the last application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching application, or <code>null</code> if a matching application could not be found
	 */
	@Override
	public Application fetchByUuid_Last(
		String uuid, OrderByComparator<Application> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Application> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the applications before and after the current application in the ordered set where uuid = &#63;.
	 *
	 * @param appId the primary key of the current application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next application
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	@Override
	public Application[] findByUuid_PrevAndNext(
			long appId, String uuid,
			OrderByComparator<Application> orderByComparator)
		throws NoSuchApplicationException {

		uuid = Objects.toString(uuid, "");

		Application application = findByPrimaryKey(appId);

		Session session = null;

		try {
			session = openSession();

			Application[] array = new ApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, application, uuid, orderByComparator, true);

			array[1] = application;

			array[2] = getByUuid_PrevAndNext(
				session, application, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Application getByUuid_PrevAndNext(
		Session session, Application application, String uuid,
		OrderByComparator<Application> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_APPLICATION_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(application)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Application> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Application application :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(application);
		}
	}

	/**
	 * Returns the number of applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPLICATION_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"application.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(application.uuid IS NULL OR application.uuid = '')";

	public ApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Application.class);

		setModelImplClass(ApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(ApplicationTable.INSTANCE);
	}

	/**
	 * Caches the application in the entity cache if it is enabled.
	 *
	 * @param application the application
	 */
	@Override
	public void cacheResult(Application application) {
		entityCache.putResult(
			ApplicationImpl.class, application.getPrimaryKey(), application);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the applications in the entity cache if it is enabled.
	 *
	 * @param applications the applications
	 */
	@Override
	public void cacheResult(List<Application> applications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (applications.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Application application : applications) {
			if (entityCache.getResult(
					ApplicationImpl.class, application.getPrimaryKey()) ==
						null) {

				cacheResult(application);
			}
		}
	}

	/**
	 * Clears the cache for all applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ApplicationImpl.class);

		finderCache.clearCache(ApplicationImpl.class);
	}

	/**
	 * Clears the cache for the application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Application application) {
		entityCache.removeResult(ApplicationImpl.class, application);
	}

	@Override
	public void clearCache(List<Application> applications) {
		for (Application application : applications) {
			entityCache.removeResult(ApplicationImpl.class, application);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ApplicationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new application with the primary key. Does not add the application to the database.
	 *
	 * @param appId the primary key for the new application
	 * @return the new application
	 */
	@Override
	public Application create(long appId) {
		Application application = new ApplicationImpl();

		application.setNew(true);
		application.setPrimaryKey(appId);

		String uuid = PortalUUIDUtil.generate();

		application.setUuid(uuid);

		return application;
	}

	/**
	 * Removes the application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appId the primary key of the application
	 * @return the application that was removed
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	@Override
	public Application remove(long appId) throws NoSuchApplicationException {
		return remove((Serializable)appId);
	}

	/**
	 * Removes the application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the application
	 * @return the application that was removed
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	@Override
	public Application remove(Serializable primaryKey)
		throws NoSuchApplicationException {

		Session session = null;

		try {
			session = openSession();

			Application application = (Application)session.get(
				ApplicationImpl.class, primaryKey);

			if (application == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(application);
		}
		catch (NoSuchApplicationException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Application removeImpl(Application application) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(application)) {
				application = (Application)session.get(
					ApplicationImpl.class, application.getPrimaryKeyObj());
			}

			if (application != null) {
				session.delete(application);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (application != null) {
			clearCache(application);
		}

		return application;
	}

	@Override
	public Application updateImpl(Application application) {
		boolean isNew = application.isNew();

		if (!(application instanceof ApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(application.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(application);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in application proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Application implementation " +
					application.getClass());
		}

		ApplicationModelImpl applicationModelImpl =
			(ApplicationModelImpl)application;

		if (Validator.isNull(application.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			application.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(application);
			}
			else {
				application = (Application)session.merge(application);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ApplicationImpl.class, applicationModelImpl, false, true);

		if (isNew) {
			application.setNew(false);
		}

		application.resetOriginalValues();

		return application;
	}

	/**
	 * Returns the application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the application
	 * @return the application
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	@Override
	public Application findByPrimaryKey(Serializable primaryKey)
		throws NoSuchApplicationException {

		Application application = fetchByPrimaryKey(primaryKey);

		if (application == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return application;
	}

	/**
	 * Returns the application with the primary key or throws a <code>NoSuchApplicationException</code> if it could not be found.
	 *
	 * @param appId the primary key of the application
	 * @return the application
	 * @throws NoSuchApplicationException if a application with the primary key could not be found
	 */
	@Override
	public Application findByPrimaryKey(long appId)
		throws NoSuchApplicationException {

		return findByPrimaryKey((Serializable)appId);
	}

	/**
	 * Returns the application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appId the primary key of the application
	 * @return the application, or <code>null</code> if a application with the primary key could not be found
	 */
	@Override
	public Application fetchByPrimaryKey(long appId) {
		return fetchByPrimaryKey((Serializable)appId);
	}

	/**
	 * Returns all the applications.
	 *
	 * @return the applications
	 */
	@Override
	public List<Application> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Application> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Application> findAll(
		int start, int end, OrderByComparator<Application> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Application> findAll(
		int start, int end, OrderByComparator<Application> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Application> list = null;

		if (useFinderCache) {
			list = (List<Application>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_APPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_APPLICATION;

				sql = sql.concat(ApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Application>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Application application : findAll()) {
			remove(application);
		}
	}

	/**
	 * Returns the number of applications.
	 *
	 * @return the number of applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_APPLICATION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "appId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_APPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the application persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		ApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ApplicationUtil.setPersistence(null);

		entityCache.removeCache(ApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_APPLICATION =
		"SELECT application FROM Application application";

	private static final String _SQL_SELECT_APPLICATION_WHERE =
		"SELECT application FROM Application application WHERE ";

	private static final String _SQL_COUNT_APPLICATION =
		"SELECT COUNT(application) FROM Application application";

	private static final String _SQL_COUNT_APPLICATION_WHERE =
		"SELECT COUNT(application) FROM Application application WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "application.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Application exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Application exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}