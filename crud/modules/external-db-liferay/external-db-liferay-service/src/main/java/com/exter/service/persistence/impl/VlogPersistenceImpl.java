/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service.persistence.impl;

import com.exter.exception.NoSuchVlogException;
import com.exter.model.Vlog;
import com.exter.model.VlogTable;
import com.exter.model.impl.VlogImpl;
import com.exter.model.impl.VlogModelImpl;
import com.exter.service.persistence.VlogPersistence;
import com.exter.service.persistence.VlogUtil;
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
 * The persistence implementation for the vlog service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = VlogPersistence.class)
public class VlogPersistenceImpl
	extends BasePersistenceImpl<Vlog> implements VlogPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>VlogUtil</code> to access the vlog persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		VlogImpl.class.getName();

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
	 * Returns all the vlogs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vlogs
	 */
	@Override
	public List<Vlog> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vlogs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @return the range of matching vlogs
	 */
	@Override
	public List<Vlog> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the vlogs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vlogs
	 */
	@Override
	public List<Vlog> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Vlog> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vlogs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vlogs
	 */
	@Override
	public List<Vlog> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Vlog> orderByComparator, boolean useFinderCache) {

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

		List<Vlog> list = null;

		if (useFinderCache) {
			list = (List<Vlog>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Vlog vlog : list) {
					if (!uuid.equals(vlog.getUuid())) {
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

			sb.append(_SQL_SELECT_VLOG_WHERE);

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
				sb.append(VlogModelImpl.ORDER_BY_JPQL);
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

				list = (List<Vlog>)QueryUtil.list(
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
	 * Returns the first vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vlog
	 * @throws NoSuchVlogException if a matching vlog could not be found
	 */
	@Override
	public Vlog findByUuid_First(
			String uuid, OrderByComparator<Vlog> orderByComparator)
		throws NoSuchVlogException {

		Vlog vlog = fetchByUuid_First(uuid, orderByComparator);

		if (vlog != null) {
			return vlog;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchVlogException(sb.toString());
	}

	/**
	 * Returns the first vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vlog, or <code>null</code> if a matching vlog could not be found
	 */
	@Override
	public Vlog fetchByUuid_First(
		String uuid, OrderByComparator<Vlog> orderByComparator) {

		List<Vlog> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vlog
	 * @throws NoSuchVlogException if a matching vlog could not be found
	 */
	@Override
	public Vlog findByUuid_Last(
			String uuid, OrderByComparator<Vlog> orderByComparator)
		throws NoSuchVlogException {

		Vlog vlog = fetchByUuid_Last(uuid, orderByComparator);

		if (vlog != null) {
			return vlog;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchVlogException(sb.toString());
	}

	/**
	 * Returns the last vlog in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vlog, or <code>null</code> if a matching vlog could not be found
	 */
	@Override
	public Vlog fetchByUuid_Last(
		String uuid, OrderByComparator<Vlog> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Vlog> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the vlogs before and after the current vlog in the ordered set where uuid = &#63;.
	 *
	 * @param vlogId the primary key of the current vlog
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vlog
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	@Override
	public Vlog[] findByUuid_PrevAndNext(
			long vlogId, String uuid, OrderByComparator<Vlog> orderByComparator)
		throws NoSuchVlogException {

		uuid = Objects.toString(uuid, "");

		Vlog vlog = findByPrimaryKey(vlogId);

		Session session = null;

		try {
			session = openSession();

			Vlog[] array = new VlogImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, vlog, uuid, orderByComparator, true);

			array[1] = vlog;

			array[2] = getByUuid_PrevAndNext(
				session, vlog, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Vlog getByUuid_PrevAndNext(
		Session session, Vlog vlog, String uuid,
		OrderByComparator<Vlog> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_VLOG_WHERE);

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
			sb.append(VlogModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(vlog)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Vlog> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the vlogs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Vlog vlog :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(vlog);
		}
	}

	/**
	 * Returns the number of vlogs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vlogs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_VLOG_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_2 = "vlog.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(vlog.uuid IS NULL OR vlog.uuid = '')";

	public VlogPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(Vlog.class);

		setModelImplClass(VlogImpl.class);
		setModelPKClass(long.class);

		setTable(VlogTable.INSTANCE);
	}

	/**
	 * Caches the vlog in the entity cache if it is enabled.
	 *
	 * @param vlog the vlog
	 */
	@Override
	public void cacheResult(Vlog vlog) {
		entityCache.putResult(VlogImpl.class, vlog.getPrimaryKey(), vlog);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the vlogs in the entity cache if it is enabled.
	 *
	 * @param vlogs the vlogs
	 */
	@Override
	public void cacheResult(List<Vlog> vlogs) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (vlogs.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Vlog vlog : vlogs) {
			if (entityCache.getResult(VlogImpl.class, vlog.getPrimaryKey()) ==
					null) {

				cacheResult(vlog);
			}
		}
	}

	/**
	 * Clears the cache for all vlogs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(VlogImpl.class);

		finderCache.clearCache(VlogImpl.class);
	}

	/**
	 * Clears the cache for the vlog.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Vlog vlog) {
		entityCache.removeResult(VlogImpl.class, vlog);
	}

	@Override
	public void clearCache(List<Vlog> vlogs) {
		for (Vlog vlog : vlogs) {
			entityCache.removeResult(VlogImpl.class, vlog);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(VlogImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(VlogImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new vlog with the primary key. Does not add the vlog to the database.
	 *
	 * @param vlogId the primary key for the new vlog
	 * @return the new vlog
	 */
	@Override
	public Vlog create(long vlogId) {
		Vlog vlog = new VlogImpl();

		vlog.setNew(true);
		vlog.setPrimaryKey(vlogId);

		String uuid = PortalUUIDUtil.generate();

		vlog.setUuid(uuid);

		return vlog;
	}

	/**
	 * Removes the vlog with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog that was removed
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	@Override
	public Vlog remove(long vlogId) throws NoSuchVlogException {
		return remove((Serializable)vlogId);
	}

	/**
	 * Removes the vlog with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the vlog
	 * @return the vlog that was removed
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	@Override
	public Vlog remove(Serializable primaryKey) throws NoSuchVlogException {
		Session session = null;

		try {
			session = openSession();

			Vlog vlog = (Vlog)session.get(VlogImpl.class, primaryKey);

			if (vlog == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchVlogException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(vlog);
		}
		catch (NoSuchVlogException noSuchEntityException) {
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
	protected Vlog removeImpl(Vlog vlog) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(vlog)) {
				vlog = (Vlog)session.get(
					VlogImpl.class, vlog.getPrimaryKeyObj());
			}

			if (vlog != null) {
				session.delete(vlog);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (vlog != null) {
			clearCache(vlog);
		}

		return vlog;
	}

	@Override
	public Vlog updateImpl(Vlog vlog) {
		boolean isNew = vlog.isNew();

		if (!(vlog instanceof VlogModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(vlog.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(vlog);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in vlog proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Vlog implementation " +
					vlog.getClass());
		}

		VlogModelImpl vlogModelImpl = (VlogModelImpl)vlog;

		if (Validator.isNull(vlog.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			vlog.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(vlog);
			}
			else {
				vlog = (Vlog)session.merge(vlog);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(VlogImpl.class, vlogModelImpl, false, true);

		if (isNew) {
			vlog.setNew(false);
		}

		vlog.resetOriginalValues();

		return vlog;
	}

	/**
	 * Returns the vlog with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the vlog
	 * @return the vlog
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	@Override
	public Vlog findByPrimaryKey(Serializable primaryKey)
		throws NoSuchVlogException {

		Vlog vlog = fetchByPrimaryKey(primaryKey);

		if (vlog == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchVlogException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return vlog;
	}

	/**
	 * Returns the vlog with the primary key or throws a <code>NoSuchVlogException</code> if it could not be found.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog
	 * @throws NoSuchVlogException if a vlog with the primary key could not be found
	 */
	@Override
	public Vlog findByPrimaryKey(long vlogId) throws NoSuchVlogException {
		return findByPrimaryKey((Serializable)vlogId);
	}

	/**
	 * Returns the vlog with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vlogId the primary key of the vlog
	 * @return the vlog, or <code>null</code> if a vlog with the primary key could not be found
	 */
	@Override
	public Vlog fetchByPrimaryKey(long vlogId) {
		return fetchByPrimaryKey((Serializable)vlogId);
	}

	/**
	 * Returns all the vlogs.
	 *
	 * @return the vlogs
	 */
	@Override
	public List<Vlog> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the vlogs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @return the range of vlogs
	 */
	@Override
	public List<Vlog> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the vlogs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vlogs
	 */
	@Override
	public List<Vlog> findAll(
		int start, int end, OrderByComparator<Vlog> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the vlogs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VlogModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vlogs
	 * @param end the upper bound of the range of vlogs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of vlogs
	 */
	@Override
	public List<Vlog> findAll(
		int start, int end, OrderByComparator<Vlog> orderByComparator,
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

		List<Vlog> list = null;

		if (useFinderCache) {
			list = (List<Vlog>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VLOG);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VLOG;

				sql = sql.concat(VlogModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Vlog>)QueryUtil.list(
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
	 * Removes all the vlogs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Vlog vlog : findAll()) {
			remove(vlog);
		}
	}

	/**
	 * Returns the number of vlogs.
	 *
	 * @return the number of vlogs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_VLOG);

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
		return "vlogId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VLOG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return VlogModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the vlog persistence.
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

		VlogUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		VlogUtil.setPersistence(null);

		entityCache.removeCache(VlogImpl.class.getName());
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

	private static final String _SQL_SELECT_VLOG = "SELECT vlog FROM Vlog vlog";

	private static final String _SQL_SELECT_VLOG_WHERE =
		"SELECT vlog FROM Vlog vlog WHERE ";

	private static final String _SQL_COUNT_VLOG =
		"SELECT COUNT(vlog) FROM Vlog vlog";

	private static final String _SQL_COUNT_VLOG_WHERE =
		"SELECT COUNT(vlog) FROM Vlog vlog WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "vlog.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Vlog exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Vlog exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		VlogPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}