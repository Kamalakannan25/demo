/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.external.db.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchEmpException extends NoSuchModelException {

	public NoSuchEmpException() {
	}

	public NoSuchEmpException(String msg) {
		super(msg);
	}

	public NoSuchEmpException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchEmpException(Throwable throwable) {
		super(throwable);
	}

}