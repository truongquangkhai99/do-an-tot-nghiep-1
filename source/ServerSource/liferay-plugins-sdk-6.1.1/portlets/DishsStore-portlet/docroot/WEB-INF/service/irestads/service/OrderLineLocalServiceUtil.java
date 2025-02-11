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
 * The utility for the order line local service. This utility wraps {@link irestads.service.impl.OrderLineLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Be
 * @see OrderLineLocalService
 * @see irestads.service.base.OrderLineLocalServiceBaseImpl
 * @see irestads.service.impl.OrderLineLocalServiceImpl
 * @generated
 */
public class OrderLineLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link irestads.service.impl.OrderLineLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the order line to the database. Also notifies the appropriate model listeners.
	*
	* @param orderLine the order line
	* @return the order line that was added
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.OrderLine addOrderLine(
		irestads.model.OrderLine orderLine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addOrderLine(orderLine);
	}

	/**
	* Creates a new order line with the primary key. Does not add the order line to the database.
	*
	* @param orderLineId the primary key for the new order line
	* @return the new order line
	*/
	public static irestads.model.OrderLine createOrderLine(long orderLineId) {
		return getService().createOrderLine(orderLineId);
	}

	/**
	* Deletes the order line with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderLineId the primary key of the order line
	* @return the order line that was removed
	* @throws PortalException if a order line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.OrderLine deleteOrderLine(long orderLineId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOrderLine(orderLineId);
	}

	/**
	* Deletes the order line from the database. Also notifies the appropriate model listeners.
	*
	* @param orderLine the order line
	* @return the order line that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.OrderLine deleteOrderLine(
		irestads.model.OrderLine orderLine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteOrderLine(orderLine);
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

	public static irestads.model.OrderLine fetchOrderLine(long orderLineId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchOrderLine(orderLineId);
	}

	/**
	* Returns the order line with the primary key.
	*
	* @param orderLineId the primary key of the order line
	* @return the order line
	* @throws PortalException if a order line with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.OrderLine getOrderLine(long orderLineId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrderLine(orderLineId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the order lines.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of order lines
	* @param end the upper bound of the range of order lines (not inclusive)
	* @return the range of order lines
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<irestads.model.OrderLine> getOrderLines(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrderLines(start, end);
	}

	/**
	* Returns the number of order lines.
	*
	* @return the number of order lines
	* @throws SystemException if a system exception occurred
	*/
	public static int getOrderLinesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getOrderLinesCount();
	}

	/**
	* Updates the order line in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param orderLine the order line
	* @return the order line that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.OrderLine updateOrderLine(
		irestads.model.OrderLine orderLine)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOrderLine(orderLine);
	}

	/**
	* Updates the order line in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param orderLine the order line
	* @param merge whether to merge the order line with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the order line that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static irestads.model.OrderLine updateOrderLine(
		irestads.model.OrderLine orderLine, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateOrderLine(orderLine, merge);
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

	public static irestads.model.OrderLine createOrderLine(
		java.lang.Long orderLineId, int numOfDish, int statusDish, long dishId,
		long orderId, long orderDate) {
		return getService()
				   .createOrderLine(orderLineId, numOfDish, statusDish, dishId,
			orderId, orderDate);
	}

	public static irestads.model.OrderLine updateOrderLine(long orderLineId,
		int numOfFinishDish, int status) {
		return getService().updateOrderLine(orderLineId, numOfFinishDish, status);
	}

	public static boolean deleteOrderLineById(long orderLineId) {
		return getService().deleteOrderLineById(orderLineId);
	}

	public static java.util.List<irestads.model.OrderLine> getOrderLineByOrder(
		long orderId) {
		return getService().getOrderLineByOrder(orderId);
	}

	public static irestads.model.OrderLine synchStatusOrderLine(
		irestads.model.OrderLine ol) {
		return getService().synchStatusOrderLine(ol);
	}

	public static int getCharge(irestads.model.OrderLine orderLine) {
		return getService().getCharge(orderLine);
	}

	public static void clearService() {
		_service = null;
	}

	public static OrderLineLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					OrderLineLocalService.class.getName());

			if (invokableLocalService instanceof OrderLineLocalService) {
				_service = (OrderLineLocalService)invokableLocalService;
			}
			else {
				_service = new OrderLineLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(OrderLineLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(OrderLineLocalService service) {
	}

	private static OrderLineLocalService _service;
}