/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.external.db.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;emp&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Emp
 * @generated
 */
public class EmpTable extends BaseTable<EmpTable> {

	public static final EmpTable INSTANCE = new EmpTable();

	public final Column<EmpTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<EmpTable, Long> eId = createColumn(
		"eId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<EmpTable, String> eName = createColumn(
		"eName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private EmpTable() {
		super("emp", EmpTable::new);
	}

}