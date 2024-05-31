/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SportsService}.
 *
 * @author Brian Wing Shun Chan
 * @see SportsService
 * @generated
 */
public class SportsServiceWrapper
	implements ServiceWrapper<SportsService>, SportsService {

	public SportsServiceWrapper() {
		this(null);
	}

	public SportsServiceWrapper(SportsService sportsService) {
		_sportsService = sportsService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sportsService.getOSGiServiceIdentifier();
	}

	@Override
	public SportsService getWrappedService() {
		return _sportsService;
	}

	@Override
	public void setWrappedService(SportsService sportsService) {
		_sportsService = sportsService;
	}

	private SportsService _sportsService;

}