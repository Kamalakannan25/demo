/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Hospital}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Hospital
 * @generated
 */
public class HospitalWrapper
	extends BaseModelWrapper<Hospital>
	implements Hospital, ModelWrapper<Hospital> {

	public HospitalWrapper(Hospital hospital) {
		super(hospital);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("hospitalId", getHospitalId());
		attributes.put("hospitalName", getHospitalName());
		attributes.put("hospitalAddress", getHospitalAddress());
		attributes.put("hospitalDetails", getHospitalDetails());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long hospitalId = (Long)attributes.get("hospitalId");

		if (hospitalId != null) {
			setHospitalId(hospitalId);
		}

		String hospitalName = (String)attributes.get("hospitalName");

		if (hospitalName != null) {
			setHospitalName(hospitalName);
		}

		String hospitalAddress = (String)attributes.get("hospitalAddress");

		if (hospitalAddress != null) {
			setHospitalAddress(hospitalAddress);
		}

		String hospitalDetails = (String)attributes.get("hospitalDetails");

		if (hospitalDetails != null) {
			setHospitalDetails(hospitalDetails);
		}
	}

	@Override
	public Hospital cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the hospital address of this hospital.
	 *
	 * @return the hospital address of this hospital
	 */
	@Override
	public String getHospitalAddress() {
		return model.getHospitalAddress();
	}

	/**
	 * Returns the hospital details of this hospital.
	 *
	 * @return the hospital details of this hospital
	 */
	@Override
	public String getHospitalDetails() {
		return model.getHospitalDetails();
	}

	/**
	 * Returns the hospital ID of this hospital.
	 *
	 * @return the hospital ID of this hospital
	 */
	@Override
	public long getHospitalId() {
		return model.getHospitalId();
	}

	/**
	 * Returns the hospital name of this hospital.
	 *
	 * @return the hospital name of this hospital
	 */
	@Override
	public String getHospitalName() {
		return model.getHospitalName();
	}

	/**
	 * Returns the primary key of this hospital.
	 *
	 * @return the primary key of this hospital
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this hospital.
	 *
	 * @return the uuid of this hospital
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
	 * Sets the hospital address of this hospital.
	 *
	 * @param hospitalAddress the hospital address of this hospital
	 */
	@Override
	public void setHospitalAddress(String hospitalAddress) {
		model.setHospitalAddress(hospitalAddress);
	}

	/**
	 * Sets the hospital details of this hospital.
	 *
	 * @param hospitalDetails the hospital details of this hospital
	 */
	@Override
	public void setHospitalDetails(String hospitalDetails) {
		model.setHospitalDetails(hospitalDetails);
	}

	/**
	 * Sets the hospital ID of this hospital.
	 *
	 * @param hospitalId the hospital ID of this hospital
	 */
	@Override
	public void setHospitalId(long hospitalId) {
		model.setHospitalId(hospitalId);
	}

	/**
	 * Sets the hospital name of this hospital.
	 *
	 * @param hospitalName the hospital name of this hospital
	 */
	@Override
	public void setHospitalName(String hospitalName) {
		model.setHospitalName(hospitalName);
	}

	/**
	 * Sets the primary key of this hospital.
	 *
	 * @param primaryKey the primary key of this hospital
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this hospital.
	 *
	 * @param uuid the uuid of this hospital
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
	protected HospitalWrapper wrap(Hospital hospital) {
		return new HospitalWrapper(hospital);
	}

}