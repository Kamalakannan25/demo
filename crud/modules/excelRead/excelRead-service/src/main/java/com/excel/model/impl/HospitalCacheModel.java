/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.model.impl;

import com.excel.model.Hospital;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Hospital in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HospitalCacheModel
	implements CacheModel<Hospital>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof HospitalCacheModel)) {
			return false;
		}

		HospitalCacheModel hospitalCacheModel = (HospitalCacheModel)object;

		if (hospitalId == hospitalCacheModel.hospitalId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, hospitalId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", hospitalId=");
		sb.append(hospitalId);
		sb.append(", hospitalName=");
		sb.append(hospitalName);
		sb.append(", hospitalAddress=");
		sb.append(hospitalAddress);
		sb.append(", hospitalDetails=");
		sb.append(hospitalDetails);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Hospital toEntityModel() {
		HospitalImpl hospitalImpl = new HospitalImpl();

		if (uuid == null) {
			hospitalImpl.setUuid("");
		}
		else {
			hospitalImpl.setUuid(uuid);
		}

		hospitalImpl.setHospitalId(hospitalId);

		if (hospitalName == null) {
			hospitalImpl.setHospitalName("");
		}
		else {
			hospitalImpl.setHospitalName(hospitalName);
		}

		if (hospitalAddress == null) {
			hospitalImpl.setHospitalAddress("");
		}
		else {
			hospitalImpl.setHospitalAddress(hospitalAddress);
		}

		if (hospitalDetails == null) {
			hospitalImpl.setHospitalDetails("");
		}
		else {
			hospitalImpl.setHospitalDetails(hospitalDetails);
		}

		hospitalImpl.resetOriginalValues();

		return hospitalImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		hospitalId = objectInput.readLong();
		hospitalName = objectInput.readUTF();
		hospitalAddress = objectInput.readUTF();
		hospitalDetails = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(hospitalId);

		if (hospitalName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hospitalName);
		}

		if (hospitalAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hospitalAddress);
		}

		if (hospitalDetails == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hospitalDetails);
		}
	}

	public String uuid;
	public long hospitalId;
	public String hospitalName;
	public String hospitalAddress;
	public String hospitalDetails;

}