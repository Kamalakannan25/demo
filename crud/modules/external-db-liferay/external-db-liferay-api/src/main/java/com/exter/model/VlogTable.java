/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.exter.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;vlog&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Vlog
 * @generated
 */
public class VlogTable extends BaseTable<VlogTable> {

	public static final VlogTable INSTANCE = new VlogTable();

	public final Column<VlogTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<VlogTable, Long> vlogId = createColumn(
		"vlogId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<VlogTable, String> vlogName = createColumn(
		"vlogName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private VlogTable() {
		super("vlog", VlogTable::new);
	}

}