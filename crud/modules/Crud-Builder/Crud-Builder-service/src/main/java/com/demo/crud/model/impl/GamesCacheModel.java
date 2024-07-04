/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model.impl;

import com.demo.crud.model.Games;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Games in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class GamesCacheModel implements CacheModel<Games>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof GamesCacheModel)) {
			return false;
		}

		GamesCacheModel gamesCacheModel = (GamesCacheModel)object;

		if (gamesId == gamesCacheModel.gamesId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, gamesId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", gamesId=");
		sb.append(gamesId);
		sb.append(", gamessName=");
		sb.append(gamessName);
		sb.append(", gamesAge=");
		sb.append(gamesAge);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Games toEntityModel() {
		GamesImpl gamesImpl = new GamesImpl();

		if (uuid == null) {
			gamesImpl.setUuid("");
		}
		else {
			gamesImpl.setUuid(uuid);
		}

		gamesImpl.setGamesId(gamesId);

		if (gamessName == null) {
			gamesImpl.setGamessName("");
		}
		else {
			gamesImpl.setGamessName(gamessName);
		}

		gamesImpl.setGamesAge(gamesAge);

		if (Description == null) {
			gamesImpl.setDescription("");
		}
		else {
			gamesImpl.setDescription(Description);
		}

		gamesImpl.setGroupId(groupId);
		gamesImpl.setCompanyId(companyId);
		gamesImpl.setUserId(userId);

		if (userName == null) {
			gamesImpl.setUserName("");
		}
		else {
			gamesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			gamesImpl.setCreateDate(null);
		}
		else {
			gamesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			gamesImpl.setModifiedDate(null);
		}
		else {
			gamesImpl.setModifiedDate(new Date(modifiedDate));
		}

		gamesImpl.resetOriginalValues();

		return gamesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		gamesId = objectInput.readLong();
		gamessName = objectInput.readUTF();

		gamesAge = objectInput.readInt();
		Description = objectInput.readUTF();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(gamesId);

		if (gamessName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gamessName);
		}

		objectOutput.writeInt(gamesAge);

		if (Description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Description);
		}

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long gamesId;
	public String gamessName;
	public int gamesAge;
	public String Description;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}