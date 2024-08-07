/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.model.impl;

import com.excel.model.Players;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Players in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PlayersCacheModel implements CacheModel<Players>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PlayersCacheModel)) {
			return false;
		}

		PlayersCacheModel playersCacheModel = (PlayersCacheModel)object;

		if (playersId == playersCacheModel.playersId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, playersId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", playersId=");
		sb.append(playersId);
		sb.append(", playersName=");
		sb.append(playersName);
		sb.append(", playersAge=");
		sb.append(playersAge);
		sb.append(", Description=");
		sb.append(Description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Players toEntityModel() {
		PlayersImpl playersImpl = new PlayersImpl();

		if (uuid == null) {
			playersImpl.setUuid("");
		}
		else {
			playersImpl.setUuid(uuid);
		}

		playersImpl.setPlayersId(playersId);

		if (playersName == null) {
			playersImpl.setPlayersName("");
		}
		else {
			playersImpl.setPlayersName(playersName);
		}

		playersImpl.setPlayersAge(playersAge);

		if (Description == null) {
			playersImpl.setDescription("");
		}
		else {
			playersImpl.setDescription(Description);
		}

		playersImpl.resetOriginalValues();

		return playersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		playersId = objectInput.readLong();
		playersName = objectInput.readUTF();

		playersAge = objectInput.readInt();
		Description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(playersId);

		if (playersName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(playersName);
		}

		objectOutput.writeInt(playersAge);

		if (Description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Description);
		}
	}

	public String uuid;
	public long playersId;
	public String playersName;
	public int playersAge;
	public String Description;

}