/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.external.db.model.impl;

import com.external.db.model.Emp;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Emp in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmpCacheModel implements CacheModel<Emp>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EmpCacheModel)) {
			return false;
		}

		EmpCacheModel empCacheModel = (EmpCacheModel)object;

		if (eId == empCacheModel.eId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", eId=");
		sb.append(eId);
		sb.append(", eName=");
		sb.append(eName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Emp toEntityModel() {
		EmpImpl empImpl = new EmpImpl();

		if (uuid == null) {
			empImpl.setUuid("");
		}
		else {
			empImpl.setUuid(uuid);
		}

		empImpl.setEId(eId);

		if (eName == null) {
			empImpl.setEName("");
		}
		else {
			empImpl.setEName(eName);
		}

		empImpl.resetOriginalValues();

		return empImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		eId = objectInput.readLong();
		eName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(eId);

		if (eName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(eName);
		}
	}

	public String uuid;
	public long eId;
	public String eName;

}