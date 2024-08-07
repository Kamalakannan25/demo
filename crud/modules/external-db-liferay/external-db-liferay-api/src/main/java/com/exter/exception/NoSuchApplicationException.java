/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.exter.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchApplicationException extends NoSuchModelException {

	public NoSuchApplicationException() {
	}

	public NoSuchApplicationException(String msg) {
		super(msg);
	}

	public NoSuchApplicationException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchApplicationException(Throwable throwable) {
		super(throwable);
	}

}