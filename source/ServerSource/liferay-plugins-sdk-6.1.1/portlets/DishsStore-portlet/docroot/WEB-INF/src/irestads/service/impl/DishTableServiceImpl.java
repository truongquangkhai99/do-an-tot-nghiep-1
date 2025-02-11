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

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import irestads.model.DishTable;
import irestads.service.DishLocalServiceUtil;
import irestads.service.DishTableLocalServiceUtil;
import irestads.service.base.DishTableServiceBaseImpl;

/**
 * The implementation of the dish table remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link irestads.service.DishTableService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Be
 * @see irestads.service.base.DishTableServiceBaseImpl
 * @see irestads.service.DishTableServiceUtil
 */
public class DishTableServiceImpl extends DishTableServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link irestads.service.DishTableServiceUtil} to access the dish table remote service.
	 */
	public List<DishTable> getAllDishTables(){
		return DishTableLocalServiceUtil.getAllDishTables();
	}
	public DishTable updateDishTable(DishTable dt) {
		try {
			return DishTableLocalServiceUtil.updateDishTable(dt);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public DishTable updateTableStatus(String idTable, boolean value, long orderId) {
		return DishTableLocalServiceUtil.updateTableStatus(idTable, value,orderId);
	}
}