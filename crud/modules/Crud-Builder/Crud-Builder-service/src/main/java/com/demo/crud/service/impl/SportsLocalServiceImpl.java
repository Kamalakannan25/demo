/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.demo.crud.service.impl;

import com.demo.crud.model.Sports;
import com.demo.crud.service.base.SportsLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.demo.crud.model.Sports",
	service = AopService.class
)
public class SportsLocalServiceImpl extends SportsLocalServiceBaseImpl {

	public List<Sports> findBySportsName(String sportsName) {
		return sportsPersistence.findBysportsName(sportsName);
	}
	
	public List<Sports> getSportsTabByName(String sportsName){
		return sportsFinder.getSportsTabByName(sportsName);
	}

}