/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

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
		attributes.put("gameRules", getGameRules());
		attributes.put("gameMembers", getGameMembers());
		attributes.put("Description", getDescription());
		attributes.put("sportsId", getSportsId());
		attributes.put("playersId", getPlayersId());

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

		String gameRules = (String)attributes.get("gameRules");

		if (gameRules != null) {
			setGameRules(gameRules);
		}

		Integer gameMembers = (Integer)attributes.get("gameMembers");

		if (gameMembers != null) {
			setGameMembers(gameMembers);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		Long sportsId = (Long)attributes.get("sportsId");

		if (sportsId != null) {
			setSportsId(sportsId);
		}

		Long playersId = (Long)attributes.get("playersId");

		if (playersId != null) {
			setPlayersId(playersId);
		}
	}

	@Override
	public Games cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
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
	 * Returns the game members of this games.
	 *
	 * @return the game members of this games
	 */
	@Override
	public int getGameMembers() {
		return model.getGameMembers();
	}

	/**
	 * Returns the game rules of this games.
	 *
	 * @return the game rules of this games
	 */
	@Override
	public String getGameRules() {
		return model.getGameRules();
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
	 * Returns the players ID of this games.
	 *
	 * @return the players ID of this games
	 */
	@Override
	public long getPlayersId() {
		return model.getPlayersId();
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
	 * Returns the sports ID of this games.
	 *
	 * @return the sports ID of this games
	 */
	@Override
	public long getSportsId() {
		return model.getSportsId();
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
	 * Sets the description of this games.
	 *
	 * @param Description the description of this games
	 */
	@Override
	public void setDescription(String Description) {
		model.setDescription(Description);
	}

	/**
	 * Sets the game members of this games.
	 *
	 * @param gameMembers the game members of this games
	 */
	@Override
	public void setGameMembers(int gameMembers) {
		model.setGameMembers(gameMembers);
	}

	/**
	 * Sets the game rules of this games.
	 *
	 * @param gameRules the game rules of this games
	 */
	@Override
	public void setGameRules(String gameRules) {
		model.setGameRules(gameRules);
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
	 * Sets the players ID of this games.
	 *
	 * @param playersId the players ID of this games
	 */
	@Override
	public void setPlayersId(long playersId) {
		model.setPlayersId(playersId);
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
	 * Sets the sports ID of this games.
	 *
	 * @param sportsId the sports ID of this games
	 */
	@Override
	public void setSportsId(long sportsId) {
		model.setSportsId(sportsId);
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
	protected GamesWrapper wrap(Games games) {
		return new GamesWrapper(games);
	}

}