/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.demo.crud.service.impl;

import com.demo.crud.model.Players;
import com.demo.crud.service.base.PlayersLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.demo.crud.model.Players",
	service = AopService.class
)
public class PlayersLocalServiceImpl extends PlayersLocalServiceBaseImpl {
	
	public List<Players> getSportsAndPlayersNames(String playersName){
		return playersFinder.getSportsAndPlayersNames(playersName);
	}

	
}