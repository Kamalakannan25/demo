/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.exter.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchVlogException extends NoSuchModelException {

	public NoSuchVlogException() {
	}

	public NoSuchVlogException(String msg) {
		super(msg);
	}

	public NoSuchVlogException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchVlogException(Throwable throwable) {
		super(throwable);
	}

}