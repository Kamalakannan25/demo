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
 * This class is a wrapper for {@link Players}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Players
 * @generated
 */
public class PlayersWrapper
	extends BaseModelWrapper<Players>
	implements ModelWrapper<Players>, Players {

	public PlayersWrapper(Players players) {
		super(players);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("playersId", getPlayersId());
		attributes.put("playersName", getPlayersName());
		attributes.put("playersAge", getPlayersAge());
		attributes.put("Description", getDescription());
		attributes.put("sportsId", getSportsId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long playersId = (Long)attributes.get("playersId");

		if (playersId != null) {
			setPlayersId(playersId);
		}

		String playersName = (String)attributes.get("playersName");

		if (playersName != null) {
			setPlayersName(playersName);
		}

		Integer playersAge = (Integer)attributes.get("playersAge");

		if (playersAge != null) {
			setPlayersAge(playersAge);
		}

		String Description = (String)attributes.get("Description");

		if (Description != null) {
			setDescription(Description);
		}

		Long sportsId = (Long)attributes.get("sportsId");

		if (sportsId != null) {
			setSportsId(sportsId);
		}
	}

	@Override
	public Players cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the description of this players.
	 *
	 * @return the description of this players
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the players age of this players.
	 *
	 * @return the players age of this players
	 */
	@Override
	public int getPlayersAge() {
		return model.getPlayersAge();
	}

	/**
	 * Returns the players ID of this players.
	 *
	 * @return the players ID of this players
	 */
	@Override
	public long getPlayersId() {
		return model.getPlayersId();
	}

	/**
	 * Returns the players name of this players.
	 *
	 * @return the players name of this players
	 */
	@Override
	public String getPlayersName() {
		return model.getPlayersName();
	}

	/**
	 * Returns the primary key of this players.
	 *
	 * @return the primary key of this players
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sports ID of this players.
	 *
	 * @return the sports ID of this players
	 */
	@Override
	public long getSportsId() {
		return model.getSportsId();
	}

	/**
	 * Returns the uuid of this players.
	 *
	 * @return the uuid of this players
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
	 * Sets the description of this players.
	 *
	 * @param Description the description of this players
	 */
	@Override
	public void setDescription(String Description) {
		model.setDescription(Description);
	}

	/**
	 * Sets the players age of this players.
	 *
	 * @param playersAge the players age of this players
	 */
	@Override
	public void setPlayersAge(int playersAge) {
		model.setPlayersAge(playersAge);
	}

	/**
	 * Sets the players ID of this players.
	 *
	 * @param playersId the players ID of this players
	 */
	@Override
	public void setPlayersId(long playersId) {
		model.setPlayersId(playersId);
	}

	/**
	 * Sets the players name of this players.
	 *
	 * @param playersName the players name of this players
	 */
	@Override
	public void setPlayersName(String playersName) {
		model.setPlayersName(playersName);
	}

	/**
	 * Sets the primary key of this players.
	 *
	 * @param primaryKey the primary key of this players
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sports ID of this players.
	 *
	 * @param sportsId the sports ID of this players
	 */
	@Override
	public void setSportsId(long sportsId) {
		model.setSportsId(sportsId);
	}

	/**
	 * Sets the uuid of this players.
	 *
	 * @param uuid the uuid of this players
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
	protected PlayersWrapper wrap(Players players) {
		return new PlayersWrapper(players);
	}

}