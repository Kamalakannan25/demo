/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.external.db.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Emp}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Emp
 * @generated
 */
public class EmpWrapper
	extends BaseModelWrapper<Emp> implements Emp, ModelWrapper<Emp> {

	public EmpWrapper(Emp emp) {
		super(emp);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("eId", getEId());
		attributes.put("eName", getEName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long eId = (Long)attributes.get("eId");

		if (eId != null) {
			setEId(eId);
		}

		String eName = (String)attributes.get("eName");

		if (eName != null) {
			setEName(eName);
		}
	}

	@Override
	public Emp cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the e ID of this emp.
	 *
	 * @return the e ID of this emp
	 */
	@Override
	public long getEId() {
		return model.getEId();
	}

	/**
	 * Returns the e name of this emp.
	 *
	 * @return the e name of this emp
	 */
	@Override
	public String getEName() {
		return model.getEName();
	}

	/**
	 * Returns the primary key of this emp.
	 *
	 * @return the primary key of this emp
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this emp.
	 *
	 * @return the uuid of this emp
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the e ID of this emp.
	 *
	 * @param eId the e ID of this emp
	 */
	@Override
	public void setEId(long eId) {
		model.setEId(eId);
	}

	/**
	 * Sets the e name of this emp.
	 *
	 * @param eName the e name of this emp
	 */
	@Override
	public void setEName(String eName) {
		model.setEName(eName);
	}

	/**
	 * Sets the primary key of this emp.
	 *
	 * @param primaryKey the primary key of this emp
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this emp.
	 *
	 * @param uuid the uuid of this emp
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected EmpWrapper wrap(Emp emp) {
		return new EmpWrapper(emp);
	}

}