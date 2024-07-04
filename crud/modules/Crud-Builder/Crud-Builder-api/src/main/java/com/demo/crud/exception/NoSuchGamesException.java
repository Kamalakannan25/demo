/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.demo.crud.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchGamesException extends NoSuchModelException {

	public NoSuchGamesException() {
	}

	public NoSuchGamesException(String msg) {
		super(msg);
	}

	public NoSuchGamesException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchGamesException(Throwable throwable) {
		super(throwable);
	}

}