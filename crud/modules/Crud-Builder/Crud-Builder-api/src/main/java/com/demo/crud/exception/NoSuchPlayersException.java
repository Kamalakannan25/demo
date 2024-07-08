/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.demo.crud.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchPlayersException extends NoSuchModelException {

	public NoSuchPlayersException() {
	}

	public NoSuchPlayersException(String msg) {
		super(msg);
	}

	public NoSuchPlayersException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchPlayersException(Throwable throwable) {
		super(throwable);
	}

}