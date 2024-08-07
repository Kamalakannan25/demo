/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.model.impl;

import com.exter.model.Application;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Application in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ApplicationCacheModel
	implements CacheModel<Application>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ApplicationCacheModel)) {
			return false;
		}

		ApplicationCacheModel applicationCacheModel =
			(ApplicationCacheModel)object;

		if (appId == applicationCacheModel.appId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, appId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", appId=");
		sb.append(appId);
		sb.append(", appName=");
		sb.append(appName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Application toEntityModel() {
		ApplicationImpl applicationImpl = new ApplicationImpl();

		if (uuid == null) {
			applicationImpl.setUuid("");
		}
		else {
			applicationImpl.setUuid(uuid);
		}

		applicationImpl.setAppId(appId);

		if (appName == null) {
			applicationImpl.setAppName("");
		}
		else {
			applicationImpl.setAppName(appName);
		}

		applicationImpl.resetOriginalValues();

		return applicationImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		appId = objectInput.readLong();
		appName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(appId);

		if (appName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appName);
		}
	}

	public String uuid;
	public long appId;
	public String appName;

}