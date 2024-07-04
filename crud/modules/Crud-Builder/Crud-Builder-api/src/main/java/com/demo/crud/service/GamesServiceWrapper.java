/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GamesService}.
 *
 * @author Brian Wing Shun Chan
 * @see GamesService
 * @generated
 */
public class GamesServiceWrapper
	implements GamesService, ServiceWrapper<GamesService> {

	public GamesServiceWrapper() {
		this(null);
	}

	public GamesServiceWrapper(GamesService gamesService) {
		_gamesService = gamesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _gamesService.getOSGiServiceIdentifier();
	}

	@Override
	public GamesService getWrappedService() {
		return _gamesService;
	}

	@Override
	public void setWrappedService(GamesService gamesService) {
		_gamesService = gamesService;
	}

	private GamesService _gamesService;

}