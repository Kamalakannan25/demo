/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.model.impl;

import com.excel.model.Hospital;
import com.excel.model.HospitalModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Hospital service. Represents a row in the &quot;excel_Hospital&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>HospitalModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HospitalImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HospitalImpl
 * @generated
 */
@JSON(strict = true)
public class HospitalModelImpl
	extends BaseModelImpl<Hospital> implements HospitalModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a hospital model instance should use the <code>Hospital</code> interface instead.
	 */
	public static final String TABLE_NAME = "excel_Hospital";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"hospitalId", Types.BIGINT},
		{"hospitalName", Types.VARCHAR}, {"hospitalAddress", Types.VARCHAR},
		{"hospitalDetails", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hospitalId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("hospitalName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hospitalAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hospitalDetails", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table excel_Hospital (uuid_ VARCHAR(75) null,hospitalId LONG not null primary key,hospitalName VARCHAR(75) null,hospitalAddress VARCHAR(75) null,hospitalDetails VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table excel_Hospital";

	public static final String ORDER_BY_JPQL =
		" ORDER BY hospital.hospitalId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY excel_Hospital.hospitalId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long HOSPITALID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public HospitalModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _hospitalId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setHospitalId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _hospitalId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Hospital.class;
	}

	@Override
	public String getModelClassName() {
		return Hospital.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Hospital, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Hospital, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Hospital, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Hospital)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Hospital, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Hospital, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Hospital)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Hospital, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Hospital, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Hospital, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Hospital, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Hospital, Object>>();

			attributeGetterFunctions.put("uuid", Hospital::getUuid);
			attributeGetterFunctions.put("hospitalId", Hospital::getHospitalId);
			attributeGetterFunctions.put(
				"hospitalName", Hospital::getHospitalName);
			attributeGetterFunctions.put(
				"hospitalAddress", Hospital::getHospitalAddress);
			attributeGetterFunctions.put(
				"hospitalDetails", Hospital::getHospitalDetails);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Hospital, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Hospital, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Hospital, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Hospital, String>)Hospital::setUuid);
			attributeSetterBiConsumers.put(
				"hospitalId",
				(BiConsumer<Hospital, Long>)Hospital::setHospitalId);
			attributeSetterBiConsumers.put(
				"hospitalName",
				(BiConsumer<Hospital, String>)Hospital::setHospitalName);
			attributeSetterBiConsumers.put(
				"hospitalAddress",
				(BiConsumer<Hospital, String>)Hospital::setHospitalAddress);
			attributeSetterBiConsumers.put(
				"hospitalDetails",
				(BiConsumer<Hospital, String>)Hospital::setHospitalDetails);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getHospitalId() {
		return _hospitalId;
	}

	@Override
	public void setHospitalId(long hospitalId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hospitalId = hospitalId;
	}

	@JSON
	@Override
	public String getHospitalName() {
		if (_hospitalName == null) {
			return "";
		}
		else {
			return _hospitalName;
		}
	}

	@Override
	public void setHospitalName(String hospitalName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hospitalName = hospitalName;
	}

	@JSON
	@Override
	public String getHospitalAddress() {
		if (_hospitalAddress == null) {
			return "";
		}
		else {
			return _hospitalAddress;
		}
	}

	@Override
	public void setHospitalAddress(String hospitalAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hospitalAddress = hospitalAddress;
	}

	@JSON
	@Override
	public String getHospitalDetails() {
		if (_hospitalDetails == null) {
			return "";
		}
		else {
			return _hospitalDetails;
		}
	}

	@Override
	public void setHospitalDetails(String hospitalDetails) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_hospitalDetails = hospitalDetails;
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, Hospital.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Hospital toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Hospital>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		HospitalImpl hospitalImpl = new HospitalImpl();

		hospitalImpl.setUuid(getUuid());
		hospitalImpl.setHospitalId(getHospitalId());
		hospitalImpl.setHospitalName(getHospitalName());
		hospitalImpl.setHospitalAddress(getHospitalAddress());
		hospitalImpl.setHospitalDetails(getHospitalDetails());

		hospitalImpl.resetOriginalValues();

		return hospitalImpl;
	}

	@Override
	public Hospital cloneWithOriginalValues() {
		HospitalImpl hospitalImpl = new HospitalImpl();

		hospitalImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		hospitalImpl.setHospitalId(
			this.<Long>getColumnOriginalValue("hospitalId"));
		hospitalImpl.setHospitalName(
			this.<String>getColumnOriginalValue("hospitalName"));
		hospitalImpl.setHospitalAddress(
			this.<String>getColumnOriginalValue("hospitalAddress"));
		hospitalImpl.setHospitalDetails(
			this.<String>getColumnOriginalValue("hospitalDetails"));

		return hospitalImpl;
	}

	@Override
	public int compareTo(Hospital hospital) {
		long primaryKey = hospital.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Hospital)) {
			return false;
		}

		Hospital hospital = (Hospital)object;

		long primaryKey = hospital.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Hospital> toCacheModel() {
		HospitalCacheModel hospitalCacheModel = new HospitalCacheModel();

		hospitalCacheModel.uuid = getUuid();

		String uuid = hospitalCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			hospitalCacheModel.uuid = null;
		}

		hospitalCacheModel.hospitalId = getHospitalId();

		hospitalCacheModel.hospitalName = getHospitalName();

		String hospitalName = hospitalCacheModel.hospitalName;

		if ((hospitalName != null) && (hospitalName.length() == 0)) {
			hospitalCacheModel.hospitalName = null;
		}

		hospitalCacheModel.hospitalAddress = getHospitalAddress();

		String hospitalAddress = hospitalCacheModel.hospitalAddress;

		if ((hospitalAddress != null) && (hospitalAddress.length() == 0)) {
			hospitalCacheModel.hospitalAddress = null;
		}

		hospitalCacheModel.hospitalDetails = getHospitalDetails();

		String hospitalDetails = hospitalCacheModel.hospitalDetails;

		if ((hospitalDetails != null) && (hospitalDetails.length() == 0)) {
			hospitalCacheModel.hospitalDetails = null;
		}

		return hospitalCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Hospital, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Hospital, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Hospital, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Hospital)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Hospital>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Hospital.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _hospitalId;
	private String _hospitalName;
	private String _hospitalAddress;
	private String _hospitalDetails;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Hospital, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Hospital)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("hospitalId", _hospitalId);
		_columnOriginalValues.put("hospitalName", _hospitalName);
		_columnOriginalValues.put("hospitalAddress", _hospitalAddress);
		_columnOriginalValues.put("hospitalDetails", _hospitalDetails);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("hospitalId", 2L);

		columnBitmasks.put("hospitalName", 4L);

		columnBitmasks.put("hospitalAddress", 8L);

		columnBitmasks.put("hospitalDetails", 16L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Hospital _escapedModel;

}