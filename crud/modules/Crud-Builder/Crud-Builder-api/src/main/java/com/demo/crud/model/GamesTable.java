/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Sports_Games&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Games
 * @generated
 */
public class GamesTable extends BaseTable<GamesTable> {

	public static final GamesTable INSTANCE = new GamesTable();

	public final Column<GamesTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GamesTable, Long> gamesId = createColumn(
		"gamesId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<GamesTable, String> gameRules = createColumn(
		"gameRules", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GamesTable, Integer> gameMembers = createColumn(
		"gameMembers", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<GamesTable, String> Description = createColumn(
		"Description", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<GamesTable, Long> sportsId = createColumn(
		"sportsId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<GamesTable, Long> playersId = createColumn(
		"playersId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private GamesTable() {
		super("Sports_Games", GamesTable::new);
	}

}