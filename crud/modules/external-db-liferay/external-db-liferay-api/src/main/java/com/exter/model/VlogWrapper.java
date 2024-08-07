/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Vlog}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vlog
 * @generated
 */
public class VlogWrapper
	extends BaseModelWrapper<Vlog> implements ModelWrapper<Vlog>, Vlog {

	public VlogWrapper(Vlog vlog) {
		super(vlog);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("vlogId", getVlogId());
		attributes.put("vlogName", getVlogName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long vlogId = (Long)attributes.get("vlogId");

		if (vlogId != null) {
			setVlogId(vlogId);
		}

		String vlogName = (String)attributes.get("vlogName");

		if (vlogName != null) {
			setVlogName(vlogName);
		}
	}

	@Override
	public Vlog cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the primary key of this vlog.
	 *
	 * @return the primary key of this vlog
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this vlog.
	 *
	 * @return the uuid of this vlog
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the vlog ID of this vlog.
	 *
	 * @return the vlog ID of this vlog
	 */
	@Override
	public long getVlogId() {
		return model.getVlogId();
	}

	/**
	 * Returns the vlog name of this vlog.
	 *
	 * @return the vlog name of this vlog
	 */
	@Override
	public String getVlogName() {
		return model.getVlogName();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the primary key of this vlog.
	 *
	 * @param primaryKey the primary key of this vlog
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this vlog.
	 *
	 * @param uuid the uuid of this vlog
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the vlog ID of this vlog.
	 *
	 * @param vlogId the vlog ID of this vlog
	 */
	@Override
	public void setVlogId(long vlogId) {
		model.setVlogId(vlogId);
	}

	/**
	 * Sets the vlog name of this vlog.
	 *
	 * @param vlogName the vlog name of this vlog
	 */
	@Override
	public void setVlogName(String vlogName) {
		model.setVlogName(vlogName);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected VlogWrapper wrap(Vlog vlog) {
		return new VlogWrapper(vlog);
	}

}