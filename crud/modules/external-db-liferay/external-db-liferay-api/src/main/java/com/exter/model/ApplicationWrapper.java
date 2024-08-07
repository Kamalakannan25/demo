/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Application}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Application
 * @generated
 */
public class ApplicationWrapper
	extends BaseModelWrapper<Application>
	implements Application, ModelWrapper<Application> {

	public ApplicationWrapper(Application application) {
		super(application);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("appId", getAppId());
		attributes.put("appName", getAppName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long appId = (Long)attributes.get("appId");

		if (appId != null) {
			setAppId(appId);
		}

		String appName = (String)attributes.get("appName");

		if (appName != null) {
			setAppName(appName);
		}
	}

	@Override
	public Application cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the app ID of this application.
	 *
	 * @return the app ID of this application
	 */
	@Override
	public long getAppId() {
		return model.getAppId();
	}

	/**
	 * Returns the app name of this application.
	 *
	 * @return the app name of this application
	 */
	@Override
	public String getAppName() {
		return model.getAppName();
	}

	/**
	 * Returns the primary key of this application.
	 *
	 * @return the primary key of this application
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the uuid of this application.
	 *
	 * @return the uuid of this application
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
	 * Sets the app ID of this application.
	 *
	 * @param appId the app ID of this application
	 */
	@Override
	public void setAppId(long appId) {
		model.setAppId(appId);
	}

	/**
	 * Sets the app name of this application.
	 *
	 * @param appName the app name of this application
	 */
	@Override
	public void setAppName(String appName) {
		model.setAppName(appName);
	}

	/**
	 * Sets the primary key of this application.
	 *
	 * @param primaryKey the primary key of this application
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the uuid of this application.
	 *
	 * @param uuid the uuid of this application
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
	protected ApplicationWrapper wrap(Application application) {
		return new ApplicationWrapper(application);
	}

}