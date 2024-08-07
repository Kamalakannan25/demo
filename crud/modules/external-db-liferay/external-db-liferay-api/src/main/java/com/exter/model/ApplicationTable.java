/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;application&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Application
 * @generated
 */
public class ApplicationTable extends BaseTable<ApplicationTable> {

	public static final ApplicationTable INSTANCE = new ApplicationTable();

	public final Column<ApplicationTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ApplicationTable, Long> appId = createColumn(
		"appId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ApplicationTable, String> appName = createColumn(
		"appName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ApplicationTable() {
		super("application", ApplicationTable::new);
	}

}