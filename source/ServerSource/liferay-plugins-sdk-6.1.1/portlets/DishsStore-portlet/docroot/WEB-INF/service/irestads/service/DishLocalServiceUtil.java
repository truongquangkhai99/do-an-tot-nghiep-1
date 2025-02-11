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

package irestads.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the dish local service. This utility wraps {@link irestads.service.impl.DishLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Be
 * @see DishLocalService
 * @see irestads.service.base.DishLocalServiceBaseImpl
 * @see irestads.service.impl.DishLocalServiceImpl
 * @generated
 */
public class DishLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link irestads.service.impl.DishLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dish to the database. Also notifies the appropriate model listeners.
	*
	* @param dish the dish
	* @return the dish that was added
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.Dish addDish(irestads.model.Dish dish)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDish(dish);
	}

	/**
	* Creates a new dish with the primary key. Does not add the dish to the database.
	*
	* @param dishId the primary key for the new dish
	* @return the new dish
	*/
	public static irestads.model.Dish createDish(long dishId) {
		return getService().createDish(dishId);
	}

	/**
	* Deletes the dish with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param dishId the primary key of the dish
	* @return the dish that was removed
	* @throws PortalException if a dish with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.Dish deleteDish(long dishId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDish(dishId);
	}

	/**
	* Deletes the dish from the database. Also notifies the appropriate model listeners.
	*
	* @param dish the dish
	* @return the dish that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.Dish deleteDish(irestads.model.Dish dish)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteDish(dish);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static irestads.model.Dish fetchDish(long dishId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchDish(dishId);
	}

	/**
	* Returns the dish with the primary key.
	*
	* @param dishId the primary key of the dish
	* @return the dish
	* @throws PortalException if a dish with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.Dish getDish(long dishId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDish(dishId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the dishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of dishs
	* @param end the upper bound of the range of dishs (not inclusive)
	* @return the range of dishs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<irestads.model.Dish> getDishs(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDishs(start, end);
	}

	/**
	* Returns the number of dishs.
	*
	* @return the number of dishs
	* @throws SystemException if a system exception occurred
	*/
	public static int getDishsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDishsCount();
	}

	/**
	* Updates the dish in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dish the dish
	* @return the dish that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.Dish updateDish(irestads.model.Dish dish)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDish(dish);
	}

	/**
	* Updates the dish in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dish the dish
	* @param merge whether to merge the dish with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the dish that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.Dish updateDish(irestads.model.Dish dish,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDish(dish, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static irestads.model.Dish createDish(java.lang.String dishName,
		java.lang.String decription, java.lang.String avatarImg,
		java.lang.String detailImg, java.lang.String detail, int referPrice,
		java.lang.String avatarBaseCode, java.lang.String detailBaseCode,
		int numOfDiner, long categoryId) {
		return getService()
				   .createDish(dishName, decription, avatarImg, detailImg,
			detail, referPrice, avatarBaseCode, detailBaseCode, numOfDiner,
			categoryId);
	}

	public static irestads.model.Dish createDish(irestads.model.Dish dishAdd) {
		return getService().createDish(dishAdd);
	}

	public static java.util.List<irestads.model.Dish> findDishNotInMenu() {
		return getService().findDishNotInMenu();
	}

	public static java.util.List<irestads.model.Dish> getAllDishs() {
		return getService().getAllDishs();
	}

	public static java.util.List<irestads.model.Dish> getDishsByCategory(
		long categoryId) {
		return getService().getDishsByCategory(categoryId);
	}

	public static irestads.model.Dish findDishsById(long dishId) {
		return getService().findDishsById(dishId);
	}

	public static java.util.List<irestads.model.Dish> findDishsByReferPrice(
		int referPrice) {
		return getService().findDishsByReferPrice(referPrice);
	}

	public static java.util.List<irestads.model.Dish> findDishsByCategoryName(
		java.lang.String categoryName) {
		return getService().findDishsByCategoryName(categoryName);
	}

	public static java.util.List<irestads.model.Dish> findDishsByName(
		java.lang.String dishName) {
		return getService().findDishsByName(dishName);
	}

	public static java.util.List<irestads.model.Dish> findDishsByDecription(
		java.lang.String decription) {
		return getService().findDishsByDecription(decription);
	}

	public static java.util.List<irestads.model.Dish> findDishsByAvatarImg(
		java.lang.String avatarImg) {
		return getService().findDishsByAvatarImg(avatarImg);
	}

	public static java.util.List<irestads.model.Dish> findDishsByDetailImg(
		java.lang.String detailImg) {
		return getService().findDishsByDetailImg(detailImg);
	}

	public static java.util.List<irestads.model.Dish> findDishsByDetail(
		java.lang.String detail) {
		return getService().findDishsByDetail(detail);
	}

	public static java.util.List<irestads.model.Dish> findDishsBySomeField(
		long dishId, int referPrice, java.lang.String dishName,
		java.lang.String decription, java.lang.String avatarImg,
		java.lang.String detailImg, java.lang.String detail) {
		return getService()
				   .findDishsBySomeField(dishId, referPrice, dishName,
			decription, avatarImg, detailImg, detail);
	}

	public static boolean isDeleteDish(long dishId) {
		return getService().isDeleteDish(dishId);
	}

	public static void clearService() {
		_service = null;
	}

	public static DishLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					DishLocalService.class.getName());

			if (invokableLocalService instanceof DishLocalService) {
				_service = (DishLocalService)invokableLocalService;
			}
			else {
				_service = new DishLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(DishLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(DishLocalService service) {
	}

	private static DishLocalService _service;
}