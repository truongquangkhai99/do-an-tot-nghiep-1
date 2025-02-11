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

package irestads.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import irestads.service.DishServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link irestads.service.DishServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link irestads.model.DishSoap}.
 * If the method in the service utility returns a
 * {@link irestads.model.Dish}, that is translated to a
 * {@link irestads.model.DishSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at
 * http://localhost:8080/api/secure/axis. Set the property
 * <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author    Be
 * @see       DishServiceHttp
 * @see       irestads.model.DishSoap
 * @see       irestads.service.DishServiceUtil
 * @generated
 */
public class DishServiceSoap {
	public static irestads.model.DishSoap createDish(
		java.lang.String dishName, java.lang.String decription,
		java.lang.String avatarImg, java.lang.String detailImg,
		java.lang.String detail, int referPrice,
		java.lang.String avatarBaseCode, java.lang.String detailBaseCode,
		int numOfDiner, long categoryId) throws RemoteException {
		try {
			irestads.model.Dish returnValue = DishServiceUtil.createDish(dishName,
					decription, avatarImg, detailImg, detail, referPrice,
					avatarBaseCode, detailBaseCode, numOfDiner, categoryId);

			return irestads.model.DishSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap createDish(irestads.model.DishSoap d)
		throws RemoteException {
		try {
			irestads.model.Dish returnValue = DishServiceUtil.createDish(irestads.model.impl.DishModelImpl.toModel(
						d));

			return irestads.model.DishSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishNotInMenu()
		throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishNotInMenu();

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] getAllDishs()
		throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.getAllDishs();

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] getDishsByCategory(long categoryId)
		throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.getDishsByCategory(categoryId);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap updateDish(
		irestads.model.DishSoap dish) throws RemoteException {
		try {
			irestads.model.Dish returnValue = DishServiceUtil.updateDish(irestads.model.impl.DishModelImpl.toModel(
						dish));

			return irestads.model.DishSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap deleteDish(
		irestads.model.DishSoap dish) throws RemoteException {
		try {
			irestads.model.Dish returnValue = DishServiceUtil.deleteDish(irestads.model.impl.DishModelImpl.toModel(
						dish));

			return irestads.model.DishSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap findDishsById(long dishId)
		throws RemoteException {
		try {
			irestads.model.Dish returnValue = DishServiceUtil.findDishsById(dishId);

			return irestads.model.DishSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsByReferPrice(
		int referPrice) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsByReferPrice(referPrice);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsByName(
		java.lang.String dishName) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsByName(dishName);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsByDecription(
		java.lang.String decription) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsByDecription(decription);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsByAvatarImg(
		java.lang.String avatarImg) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsByAvatarImg(avatarImg);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsByDetailImg(
		java.lang.String detailImg) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsByDetailImg(detailImg);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsByDetail(
		java.lang.String detail) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsByDetail(detail);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsByCategoryName(
		java.lang.String categoryName) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsByCategoryName(categoryName);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishSoap[] findDishsBySomeField(long dishId,
		int referPrice, java.lang.String dishName, java.lang.String decription,
		java.lang.String avatarImg, java.lang.String detailImg,
		java.lang.String detail) throws RemoteException {
		try {
			java.util.List<irestads.model.Dish> returnValue = DishServiceUtil.findDishsBySomeField(dishId,
					referPrice, dishName, decription, avatarImg, detailImg,
					detail);

			return irestads.model.DishSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static boolean isDeleteDish(long dishId) throws RemoteException {
		try {
			boolean returnValue = DishServiceUtil.isDeleteDish(dishId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DishServiceSoap.class);
}