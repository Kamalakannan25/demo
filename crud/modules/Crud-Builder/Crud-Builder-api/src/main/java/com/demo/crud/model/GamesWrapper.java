/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Games}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Games
 * @generated
 */
public class GamesWrapper
	extends BaseModelWrapper<Games> implements Games, ModelWrapper<Games> {

	public GamesWrapper(Games games) {
		super(games);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("gamesId", getGamesId());
		attributes.put("gamessName", getGamessName());
		attributes.put("gamesAge", getGamesAge());
		attributes.put("Description", getDescription());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long gamesId = (Long)attributes.get("gamesId");

		if (gamesId != null) {
			setGamesId(gamesId);
		}

		String gamessName = (String)attributes.get("gamessName");

		if (gamessName != null) {
			setGamessName(gamessName);
		}

		Integer gamesAge = (Integer)attributes.get("gamesAge");

		if (gamesAge != null) {
			setGamesAge(gamesAge);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public Games cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this games.
	 *
	 * @return the company ID of this games
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this games.
	 *
	 * @return the create date of this games
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this games.
	 *
	 * @return the description of this games
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the games age of this games.
	 *
	 * @return the games age of this games
	 */
	@Override
	public int getGamesAge() {
		return model.getGamesAge();
	}

	/**
	 * Returns the games ID of this games.
	 *
	 * @return the games ID of this games
	 */
	@Override
	public long getGamesId() {
		return model.getGamesId();
	}

	/**
	 * Returns the gamess name of this games.
	 *
	 * @return the gamess name of this games
	 */
	@Override
	public String getGamessName() {
		return model.getGamessName();
	}

	/**
	 * Returns the group ID of this games.
	 *
	 * @return the group ID of this games
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this games.
	 *
	 * @return the modified date of this games
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this games.
	 *
	 * @return the primary key of this games
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this games.
	 *
	 * @return the user ID of this games
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this games.
	 *
	 * @return the user name of this games
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this games.
	 *
	 * @return the user uuid of this games
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this games.
	 *
	 * @return the uuid of this games
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
	 * Sets the company ID of this games.
	 *
	 * @param companyId the company ID of this games
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this games.
	 *
	 * @param createDate the create date of this games
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this games.
	 *
	 * @param Description the description of this games
	 */
	@Override
	public void setDescription(String Description) {
		model.setDescription(Description);
	}

	/**
	 * Sets the games age of this games.
	 *
	 * @param gamesAge the games age of this games
	 */
	@Override
	public void setGamesAge(int gamesAge) {
		model.setGamesAge(gamesAge);
	}

	/**
	 * Sets the games ID of this games.
	 *
	 * @param gamesId the games ID of this games
	 */
	@Override
	public void setGamesId(long gamesId) {
		model.setGamesId(gamesId);
	}

	/**
	 * Sets the gamess name of this games.
	 *
	 * @param gamessName the gamess name of this games
	 */
	@Override
	public void setGamessName(String gamessName) {
		model.setGamessName(gamessName);
	}

	/**
	 * Sets the group ID of this games.
	 *
	 * @param groupId the group ID of this games
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this games.
	 *
	 * @param modifiedDate the modified date of this games
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this games.
	 *
	 * @param primaryKey the primary key of this games
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this games.
	 *
	 * @param userId the user ID of this games
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this games.
	 *
	 * @param userName the user name of this games
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this games.
	 *
	 * @param userUuid the user uuid of this games
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this games.
	 *
	 * @param uuid the uuid of this games
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
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected GamesWrapper wrap(Games games) {
		return new GamesWrapper(games);
	}

}