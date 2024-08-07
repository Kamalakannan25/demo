/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.external.db.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Emp service. Represents a row in the &quot;emp&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.external.db.model.impl.EmpModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.external.db.model.impl.EmpImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Emp
 * @generated
 */
@ProviderType
public interface EmpModel extends BaseModel<Emp> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp model instance should use the {@link Emp} interface instead.
	 */

	/**
	 * Returns the primary key of this emp.
	 *
	 * @return the primary key of this emp
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp.
	 *
	 * @param primaryKey the primary key of this emp
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this emp.
	 *
	 * @return the uuid of this emp
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this emp.
	 *
	 * @param uuid the uuid of this emp
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the e ID of this emp.
	 *
	 * @return the e ID of this emp
	 */
	public long getEId();

	/**
	 * Sets the e ID of this emp.
	 *
	 * @param eId the e ID of this emp
	 */
	public void setEId(long eId);

	/**
	 * Returns the e name of this emp.
	 *
	 * @return the e name of this emp
	 */
	@AutoEscape
	public String getEName();

	/**
	 * Sets the e name of this emp.
	 *
	 * @param eName the e name of this emp
	 */
	public void setEName(String eName);

	@Override
	public Emp cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}