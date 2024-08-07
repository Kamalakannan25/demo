/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.model.impl;

import com.exter.model.Vlog;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Vlog in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VlogCacheModel implements CacheModel<Vlog>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof VlogCacheModel)) {
			return false;
		}

		VlogCacheModel vlogCacheModel = (VlogCacheModel)object;

		if (vlogId == vlogCacheModel.vlogId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vlogId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", vlogId=");
		sb.append(vlogId);
		sb.append(", vlogName=");
		sb.append(vlogName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Vlog toEntityModel() {
		VlogImpl vlogImpl = new VlogImpl();

		if (uuid == null) {
			vlogImpl.setUuid("");
		}
		else {
			vlogImpl.setUuid(uuid);
		}

		vlogImpl.setVlogId(vlogId);

		if (vlogName == null) {
			vlogImpl.setVlogName("");
		}
		else {
			vlogImpl.setVlogName(vlogName);
		}

		vlogImpl.resetOriginalValues();

		return vlogImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		vlogId = objectInput.readLong();
		vlogName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(vlogId);

		if (vlogName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(vlogName);
		}
	}

	public String uuid;
	public long vlogId;
	public String vlogName;

}