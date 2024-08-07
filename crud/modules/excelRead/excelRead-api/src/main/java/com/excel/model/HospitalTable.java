/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;excel_Hospital&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Hospital
 * @generated
 */
public class HospitalTable extends BaseTable<HospitalTable> {

	public static final HospitalTable INSTANCE = new HospitalTable();

	public final Column<HospitalTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HospitalTable, Long> hospitalId = createColumn(
		"hospitalId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<HospitalTable, String> hospitalName = createColumn(
		"hospitalName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HospitalTable, String> hospitalAddress = createColumn(
		"hospitalAddress", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<HospitalTable, String> hospitalDetails = createColumn(
		"hospitalDetails", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private HospitalTable() {
		super("excel_Hospital", HospitalTable::new);
	}

}