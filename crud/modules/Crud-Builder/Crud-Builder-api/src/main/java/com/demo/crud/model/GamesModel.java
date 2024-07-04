/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Games service. Represents a row in the &quot;Sports_Games&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.demo.crud.model.impl.GamesModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.demo.crud.model.impl.GamesImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Games
 * @generated
 */
@ProviderType
public interface GamesModel
	extends BaseModel<Games>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a games model instance should use the {@link Games} interface instead.
	 */

	/**
	 * Returns the primary key of this games.
	 *
	 * @return the primary key of this games
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this games.
	 *
	 * @param primaryKey the primary key of this games
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this games.
	 *
	 * @return the uuid of this games
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this games.
	 *
	 * @param uuid the uuid of this games
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the games ID of this games.
	 *
	 * @return the games ID of this games
	 */
	public long getGamesId();

	/**
	 * Sets the games ID of this games.
	 *
	 * @param gamesId the games ID of this games
	 */
	public void setGamesId(long gamesId);

	/**
	 * Returns the gamess name of this games.
	 *
	 * @return the gamess name of this games
	 */
	@AutoEscape
	public String getGamessName();

	/**
	 * Sets the gamess name of this games.
	 *
	 * @param gamessName the gamess name of this games
	 */
	public void setGamessName(String gamessName);

	/**
	 * Returns the games age of this games.
	 *
	 * @return the games age of this games
	 */
	public int getGamesAge();

	/**
	 * Sets the games age of this games.
	 *
	 * @param gamesAge the games age of this games
	 */
	public void setGamesAge(int gamesAge);

	/**
	 * Returns the description of this games.
	 *
	 * @return the description of this games
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this games.
	 *
	 * @param Description the description of this games
	 */
	public void setDescription(String Description);

	/**
	 * Returns the group ID of this games.
	 *
	 * @return the group ID of this games
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this games.
	 *
	 * @param groupId the group ID of this games
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this games.
	 *
	 * @return the company ID of this games
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this games.
	 *
	 * @param companyId the company ID of this games
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this games.
	 *
	 * @return the user ID of this games
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this games.
	 *
	 * @param userId the user ID of this games
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this games.
	 *
	 * @return the user uuid of this games
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this games.
	 *
	 * @param userUuid the user uuid of this games
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this games.
	 *
	 * @return the user name of this games
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this games.
	 *
	 * @param userName the user name of this games
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this games.
	 *
	 * @return the create date of this games
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this games.
	 *
	 * @param createDate the create date of this games
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this games.
	 *
	 * @return the modified date of this games
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this games.
	 *
	 * @param modifiedDate the modified date of this games
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public Games cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}