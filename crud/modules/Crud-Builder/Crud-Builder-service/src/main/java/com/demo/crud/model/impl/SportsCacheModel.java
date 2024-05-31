/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model.impl;

import com.demo.crud.model.Sports;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Sports in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SportsCacheModel implements CacheModel<Sports>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SportsCacheModel)) {
			return false;
		}

		SportsCacheModel sportsCacheModel = (SportsCacheModel)object;

		if (sportsId == sportsCacheModel.sportsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sportsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sportsId=");
		sb.append(sportsId);
		sb.append(", sportsName=");
		sb.append(sportsName);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sports toEntityModel() {
		SportsImpl sportsImpl = new SportsImpl();

		if (uuid == null) {
			sportsImpl.setUuid("");
		}
		else {
			sportsImpl.setUuid(uuid);
		}

		sportsImpl.setSportsId(sportsId);

		if (sportsName == null) {
			sportsImpl.setSportsName("");
		}
		else {
			sportsImpl.setSportsName(sportsName);
		}

		if (description == null) {
			sportsImpl.setDescription("");
		}
		else {
			sportsImpl.setDescription(description);
		}

		sportsImpl.resetOriginalValues();

		return sportsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sportsId = objectInput.readLong();
		sportsName = objectInput.readUTF();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sportsId);

		if (sportsName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sportsName);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public String uuid;
	public long sportsId;
	public String sportsName;
	public String description;

}