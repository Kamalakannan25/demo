/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sports}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Sports
 * @generated
 */
public class SportsWrapper
	extends BaseModelWrapper<Sports> implements ModelWrapper<Sports>, Sports {

	public SportsWrapper(Sports sports) {
		super(sports);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sportsId", getSportsId());
		attributes.put("sportsName", getSportsName());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sportsId = (Long)attributes.get("sportsId");

		if (sportsId != null) {
			setSportsId(sportsId);
		}

		String sportsName = (String)attributes.get("sportsName");

		if (sportsName != null) {
			setSportsName(sportsName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public Sports cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the description of this sports.
	 *
	 * @return the description of this sports
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the primary key of this sports.
	 *
	 * @return the primary key of this sports
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sports ID of this sports.
	 *
	 * @return the sports ID of this sports
	 */
	@Override
	public long getSportsId() {
		return model.getSportsId();
	}

	/**
	 * Returns the sports name of this sports.
	 *
	 * @return the sports name of this sports
	 */
	@Override
	public String getSportsName() {
		return model.getSportsName();
	}

	/**
	 * Returns the uuid of this sports.
	 *
	 * @return the uuid of this sports
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
	 * Sets the description of this sports.
	 *
	 * @param description the description of this sports
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the primary key of this sports.
	 *
	 * @param primaryKey the primary key of this sports
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sports ID of this sports.
	 *
	 * @param sportsId the sports ID of this sports
	 */
	@Override
	public void setSportsId(long sportsId) {
		model.setSportsId(sportsId);
	}

	/**
	 * Sets the sports name of this sports.
	 *
	 * @param sportsName the sports name of this sports
	 */
	@Override
	public void setSportsName(String sportsName) {
		model.setSportsName(sportsName);
	}

	/**
	 * Sets the uuid of this sports.
	 *
	 * @param uuid the uuid of this sports
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
	protected SportsWrapper wrap(Sports sports) {
		return new SportsWrapper(sports);
	}

}