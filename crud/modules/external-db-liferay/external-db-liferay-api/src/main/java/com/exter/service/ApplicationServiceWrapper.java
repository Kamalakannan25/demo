/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ApplicationService}.
 *
 * @author Brian Wing Shun Chan
 * @see ApplicationService
 * @generated
 */
public class ApplicationServiceWrapper
	implements ApplicationService, ServiceWrapper<ApplicationService> {

	public ApplicationServiceWrapper() {
		this(null);
	}

	public ApplicationServiceWrapper(ApplicationService applicationService) {
		_applicationService = applicationService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _applicationService.getOSGiServiceIdentifier();
	}

	@Override
	public ApplicationService getWrappedService() {
		return _applicationService;
	}

	@Override
	public void setWrappedService(ApplicationService applicationService) {
		_applicationService = applicationService;
	}

	private ApplicationService _applicationService;

}