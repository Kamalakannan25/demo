/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Players service. Represents a row in the &quot;Sports_Players&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PlayersModel
 * @generated
 */
@ImplementationClassName("com.demo.crud.model.impl.PlayersImpl")
@ProviderType
public interface Players extends PersistedModel, PlayersModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.demo.crud.model.impl.PlayersImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Players, Long> PLAYERS_ID_ACCESSOR =
		new Accessor<Players, Long>() {

			@Override
			public Long get(Players players) {
				return players.getPlayersId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Players> getTypeClass() {
				return Players.class;
			}

		};

}