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

import irestads.model.Dish;
import irestads.model.DishTable;
import irestads.model.OrderLine;
import irestads.service.DishLocalServiceUtil;
import irestads.service.OrderLineLocalServiceUtil;
import irestads.service.base.DishServiceBaseImpl;
import irestads.service.persistence.DishFinderUtil;

import java.util.List;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the dish remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link iRestads.service.DishService} interface.
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author Be
 * @see iRestads.service.base.DishServiceBaseImpl
 * @see iRestads.service.DishServiceUtil
 */
public class DishServiceImpl extends DishServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * iRestads.service.DishServiceUtil} to access the dish remote service.
	 */

	//
	public Dish createDish(String dishName, String decription,
			String avatarImg, String detailImg, String detail, int referPrice,
			String avatarBaseCode, String detailBaseCode,int numOfDiner, long categoryId) {


		return DishLocalServiceUtil.createDish(dishName, decription, avatarImg,
				detailImg, detail, referPrice, avatarBaseCode, detailBaseCode,
				 numOfDiner,categoryId);
	}

	public Dish createDish(Dish d) {
		return DishLocalServiceUtil.createDish(d);
	}

	public List<Dish> findDishNotInMenu() {
		return DishLocalServiceUtil.findDishNotInMenu();
	}

	public List<Dish> getAllDishs() {
		return DishLocalServiceUtil.getAllDishs();
	}

	public List<Dish> getDishsByCategory(long categoryId) {
		return DishLocalServiceUtil.getDishsByCategory(categoryId);
	}

	public Dish updateDish(Dish dish) {
		try {
			return DishLocalServiceUtil.updateDish(dish);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Dish deleteDish(Dish dish) {
		try {
			return DishLocalServiceUtil.deleteDish(dish);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Dish findDishsById(long dishId) {
		return DishLocalServiceUtil.findDishsById(dishId);
	}

	public List<Dish> findDishsByReferPrice(int referPrice) {
		return DishLocalServiceUtil.findDishsByReferPrice(referPrice);
	}

	public List<Dish> findDishsByName(String dishName) {
		return DishLocalServiceUtil.findDishsByName(dishName);
	}

	public List<Dish> findDishsByDecription(String decription) {
		return DishLocalServiceUtil.findDishsByDecription(decription);
	}

	public List<Dish> findDishsByAvatarImg(String avatarImg) {
		return DishLocalServiceUtil.findDishsByAvatarImg(avatarImg);
	}

	public List<Dish> findDishsByDetailImg(String detailImg) {
		return DishLocalServiceUtil.findDishsByDetailImg(detailImg);
	}

	public List<Dish> findDishsByDetail(String detail) {
		return DishLocalServiceUtil.findDishsByDetail(detail);
	}

	public List<Dish> findDishsByCategoryName(String categoryName) {
		return DishLocalServiceUtil.findDishsByCategoryName(categoryName);
	}

	public List<Dish> findDishsBySomeField(long dishId, int referPrice,
			String dishName, String decription, String avatarImg,
			String detailImg, String detail) {
		return DishLocalServiceUtil.findDishsBySomeField(dishId, referPrice,
				dishName, decription, avatarImg, detailImg, detail);
	}

	public boolean isDeleteDish(long dishId) {
		return DishLocalServiceUtil.isDeleteDish(dishId);
	}
	

}