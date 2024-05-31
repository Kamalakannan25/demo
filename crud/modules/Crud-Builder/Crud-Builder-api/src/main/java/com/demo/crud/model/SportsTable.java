/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Sports_Sports&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Sports
 * @generated
 */
public class SportsTable extends BaseTable<SportsTable> {

	public static final SportsTable INSTANCE = new SportsTable();

	public final Column<SportsTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SportsTable, Long> sportsId = createColumn(
		"sportsId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<SportsTable, String> sportsName = createColumn(
		"sportsName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<SportsTable, String> description = createColumn(
		"description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private SportsTable() {
		super("Sports_Sports", SportsTable::new);
	}

}