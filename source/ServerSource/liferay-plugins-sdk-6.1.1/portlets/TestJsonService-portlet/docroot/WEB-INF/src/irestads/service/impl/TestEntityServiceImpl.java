/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package irestads.service.impl;

import com.liferay.portal.kernel.jsonwebservice.JSONWebService;

import irestads.service.TestEntityLocalServiceUtil;
import irestads.service.base.TestEntityServiceBaseImpl;

/**
 * The implementation of the test entity remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link irestads.service.TestEntityService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author ADMIN
 * @see irestads.service.base.TestEntityServiceBaseImpl
 * @see irestads.service.TestEntityServiceUtil
 */
public class TestEntityServiceImpl extends TestEntityServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link irestads.service.TestEntityServiceUtil} to access the test entity remote service.
	 */
	public String getHelloString(){
		return TestEntityLocalServiceUtil.getHelloString();
	}
	@JSONWebService(method="POST")
	public String getHelloString2(){
		return "Hello Guys";
	}
}