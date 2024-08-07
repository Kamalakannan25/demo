/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Vlog service. Represents a row in the &quot;vlog&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see VlogModel
 * @generated
 */
@ImplementationClassName("com.exter.model.impl.VlogImpl")
@ProviderType
public interface Vlog extends PersistedModel, VlogModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.exter.model.impl.VlogImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Vlog, Long> VLOG_ID_ACCESSOR =
		new Accessor<Vlog, Long>() {

			@Override
			public Long get(Vlog vlog) {
				return vlog.getVlogId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Vlog> getTypeClass() {
				return Vlog.class;
			}

		};

}