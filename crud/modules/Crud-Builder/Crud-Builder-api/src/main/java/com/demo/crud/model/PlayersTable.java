/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Sports_Players&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Players
 * @generated
 */
public class PlayersTable extends BaseTable<PlayersTable> {

	public static final PlayersTable INSTANCE = new PlayersTable();

	public final Column<PlayersTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlayersTable, Long> playersId = createColumn(
		"playersId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PlayersTable, String> playersName = createColumn(
		"playersName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlayersTable, Integer> playersAge = createColumn(
		"playersAge", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<PlayersTable, String> Description = createColumn(
		"Description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlayersTable, Long> sportsId = createColumn(
		"sportsId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private PlayersTable() {
		super("Sports_Players", PlayersTable::new);
	}

}