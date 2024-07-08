/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PlayersService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlayersService
 * @generated
 */
public class PlayersServiceWrapper
	implements PlayersService, ServiceWrapper<PlayersService> {

	public PlayersServiceWrapper() {
		this(null);
	}

	public PlayersServiceWrapper(PlayersService playersService) {
		_playersService = playersService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _playersService.getOSGiServiceIdentifier();
	}

	@Override
	public PlayersService getWrappedService() {
		return _playersService;
	}

	@Override
	public void setWrappedService(PlayersService playersService) {
		_playersService = playersService;
	}

	private PlayersService _playersService;

}