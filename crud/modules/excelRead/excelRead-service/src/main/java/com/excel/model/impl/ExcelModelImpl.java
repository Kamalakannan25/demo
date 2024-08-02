/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.model.impl;

import com.excel.model.Excel;
import com.excel.model.ExcelModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
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
 * The base model implementation for the Excel service. Represents a row in the &quot;excel_Excel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ExcelModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExcelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExcelImpl
 * @generated
 */
@JSON(strict = true)
public class ExcelModelImpl extends BaseModelImpl<Excel> implements ExcelModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a excel model instance should use the <code>Excel</code> interface instead.
	 */
	public static final String TABLE_NAME = "excel_Excel";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"excelId", Types.BIGINT},
		{"name", Types.VARCHAR}, {"address", Types.VARCHAR},
		{"phoneNumber", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("excelId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("address", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phoneNumber", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table excel_Excel (uuid_ VARCHAR(75) null,excelId LONG not null primary key,name VARCHAR(75) null,address VARCHAR(75) null,phoneNumber LONG)";

	public static final String TABLE_SQL_DROP = "drop table excel_Excel";

	public static final String ORDER_BY_JPQL = " ORDER BY excel.excelId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY excel_Excel.excelId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long PHONENUMBER_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long EXCELID_COLUMN_BITMASK = 4L;

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

	public ExcelModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _excelId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setExcelId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _excelId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Excel.class;
	}

	@Override
	public String getModelClassName() {
		return Excel.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Excel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Excel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Excel, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Excel)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Excel, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Excel, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Excel)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Excel, Object>> getAttributeGetterFunctions() {
		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Excel, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map<String, Function<Excel, Object>>
			_attributeGetterFunctions;

		static {
			Map<String, Function<Excel, Object>> attributeGetterFunctions =
				new LinkedHashMap<String, Function<Excel, Object>>();

			attributeGetterFunctions.put("uuid", Excel::getUuid);
			attributeGetterFunctions.put("excelId", Excel::getExcelId);
			attributeGetterFunctions.put("name", Excel::getName);
			attributeGetterFunctions.put("address", Excel::getAddress);
			attributeGetterFunctions.put("phoneNumber", Excel::getPhoneNumber);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map<String, BiConsumer<Excel, Object>>
			_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<Excel, ?>> attributeSetterBiConsumers =
				new LinkedHashMap<String, BiConsumer<Excel, ?>>();

			attributeSetterBiConsumers.put(
				"uuid", (BiConsumer<Excel, String>)Excel::setUuid);
			attributeSetterBiConsumers.put(
				"excelId", (BiConsumer<Excel, Long>)Excel::setExcelId);
			attributeSetterBiConsumers.put(
				"name", (BiConsumer<Excel, String>)Excel::setName);
			attributeSetterBiConsumers.put(
				"address", (BiConsumer<Excel, String>)Excel::setAddress);
			attributeSetterBiConsumers.put(
				"phoneNumber", (BiConsumer<Excel, Long>)Excel::setPhoneNumber);

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
	public long getExcelId() {
		return _excelId;
	}

	@Override
	public void setExcelId(long excelId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_excelId = excelId;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return "";
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_name = name;
	}

	@JSON
	@Override
	public String getAddress() {
		if (_address == null) {
			return "";
		}
		else {
			return _address;
		}
	}

	@Override
	public void setAddress(String address) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_address = address;
	}

	@JSON
	@Override
	public long getPhoneNumber() {
		return _phoneNumber;
	}

	@Override
	public void setPhoneNumber(long phoneNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_phoneNumber = phoneNumber;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalPhoneNumber() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("phoneNumber"));
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
			0, Excel.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Excel toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Excel>
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
		ExcelImpl excelImpl = new ExcelImpl();

		excelImpl.setUuid(getUuid());
		excelImpl.setExcelId(getExcelId());
		excelImpl.setName(getName());
		excelImpl.setAddress(getAddress());
		excelImpl.setPhoneNumber(getPhoneNumber());

		excelImpl.resetOriginalValues();

		return excelImpl;
	}

	@Override
	public Excel cloneWithOriginalValues() {
		ExcelImpl excelImpl = new ExcelImpl();

		excelImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		excelImpl.setExcelId(this.<Long>getColumnOriginalValue("excelId"));
		excelImpl.setName(this.<String>getColumnOriginalValue("name"));
		excelImpl.setAddress(this.<String>getColumnOriginalValue("address"));
		excelImpl.setPhoneNumber(
			this.<Long>getColumnOriginalValue("phoneNumber"));

		return excelImpl;
	}

	@Override
	public int compareTo(Excel excel) {
		long primaryKey = excel.getPrimaryKey();

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

		if (!(object instanceof Excel)) {
			return false;
		}

		Excel excel = (Excel)object;

		long primaryKey = excel.getPrimaryKey();

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
	public CacheModel<Excel> toCacheModel() {
		ExcelCacheModel excelCacheModel = new ExcelCacheModel();

		excelCacheModel.uuid = getUuid();

		String uuid = excelCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			excelCacheModel.uuid = null;
		}

		excelCacheModel.excelId = getExcelId();

		excelCacheModel.name = getName();

		String name = excelCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			excelCacheModel.name = null;
		}

		excelCacheModel.address = getAddress();

		String address = excelCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			excelCacheModel.address = null;
		}

		excelCacheModel.phoneNumber = getPhoneNumber();

		return excelCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Excel, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Excel, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Excel, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Excel)this);

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

		private static final Function<InvocationHandler, Excel>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Excel.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _excelId;
	private String _name;
	private String _address;
	private long _phoneNumber;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Excel, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Excel)this);
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
		_columnOriginalValues.put("excelId", _excelId);
		_columnOriginalValues.put("name", _name);
		_columnOriginalValues.put("address", _address);
		_columnOriginalValues.put("phoneNumber", _phoneNumber);
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

		columnBitmasks.put("excelId", 2L);

		columnBitmasks.put("name", 4L);

		columnBitmasks.put("address", 8L);

		columnBitmasks.put("phoneNumber", 16L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Excel _escapedModel;

}