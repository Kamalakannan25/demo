/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.excel.model.impl;

import com.excel.model.Excel;
import com.excel.service.ExcelLocalServiceUtil;

/**
 * The extended model base implementation for the Excel service. Represents a row in the &quot;excel_Excel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ExcelImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExcelImpl
 * @see Excel
 * @generated
 */
public abstract class ExcelBaseImpl extends ExcelModelImpl implements Excel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a excel model instance should use the <code>Excel</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			ExcelLocalServiceUtil.addExcel(this);
		}
		else {
			ExcelLocalServiceUtil.updateExcel(this);
		}
	}

}