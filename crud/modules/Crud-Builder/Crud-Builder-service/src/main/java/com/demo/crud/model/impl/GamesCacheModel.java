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
		StringBundler sb = new StringBundler(15);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", gamesId=");
		sb.append(gamesId);
		sb.append(", gameRules=");
		sb.append(gameRules);
		sb.append(", gameMembers=");
		sb.append(gameMembers);
		sb.append(", Description=");
		sb.append(Description);
		sb.append(", sportsId=");
		sb.append(sportsId);
		sb.append(", playersId=");
		sb.append(playersId);
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

		if (gameRules == null) {
			gamesImpl.setGameRules("");
		}
		else {
			gamesImpl.setGameRules(gameRules);
		}

		gamesImpl.setGameMembers(gameMembers);

		if (Description == null) {
			gamesImpl.setDescription("");
		}
		else {
			gamesImpl.setDescription(Description);
		}

		gamesImpl.setSportsId(sportsId);
		gamesImpl.setPlayersId(playersId);

		gamesImpl.resetOriginalValues();

		return gamesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		gamesId = objectInput.readLong();
		gameRules = objectInput.readUTF();

		gameMembers = objectInput.readInt();
		Description = objectInput.readUTF();

		sportsId = objectInput.readLong();

		playersId = objectInput.readLong();
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

		if (gameRules == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(gameRules);
		}

		objectOutput.writeInt(gameMembers);

		if (Description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(Description);
		}

		objectOutput.writeLong(sportsId);

		objectOutput.writeLong(playersId);
	}

	public String uuid;
	public long gamesId;
	public String gameRules;
	public int gameMembers;
	public String Description;
	public long sportsId;
	public long playersId;

}