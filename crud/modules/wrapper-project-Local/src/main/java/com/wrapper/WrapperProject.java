package com.wrapper;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author Suchismita
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class WrapperProject extends UserLocalServiceWrapper {

	public WrapperProject() {
		super(null);
	}
	
	public int getUsersCount() {
		return super.getUsersCount();
	}
}