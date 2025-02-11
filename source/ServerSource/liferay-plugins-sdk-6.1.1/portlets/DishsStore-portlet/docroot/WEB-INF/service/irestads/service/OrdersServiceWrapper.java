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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link OrdersService}.
 * </p>
 *
 * @author    Be
 * @see       OrdersService
 * @generated
 */
public class OrdersServiceWrapper implements OrdersService,
	ServiceWrapper<OrdersService> {
	public OrdersServiceWrapper(OrdersService ordersService) {
		_ordersService = ordersService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _ordersService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_ordersService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ordersService.invokeMethod(name, parameterTypes, arguments);
	}

	public irestads.model.Orders findOrderById(long orderId) {
		return _ordersService.findOrderById(orderId);
	}

	public irestads.model.Orders createOrders(long orderId, int charge,
		int isPayment, int numOfDinner, java.lang.String dishTableId,
		long createdDate) {
		return _ordersService.createOrders(orderId, charge, isPayment,
			numOfDinner, dishTableId, createdDate);
	}

	public boolean deleteOrderById(long orderId) {
		return _ordersService.deleteOrderById(orderId);
	}

	public boolean setWaitingStatus(long orderId) {
		return _ordersService.setWaitingStatus(orderId);
	}

	public irestads.model.Orders updateOrder(irestads.model.Orders o) {
		return _ordersService.updateOrder(o);
	}

	public irestads.model.Orders payment(long orderId) {
		return _ordersService.payment(orderId);
	}

	public int calCharge(long orderId) {
		return _ordersService.calCharge(orderId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public OrdersService getWrappedOrdersService() {
		return _ordersService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedOrdersService(OrdersService ordersService) {
		_ordersService = ordersService;
	}

	public OrdersService getWrappedService() {
		return _ordersService;
	}

	public void setWrappedService(OrdersService ordersService) {
		_ordersService = ordersService;
	}

	private OrdersService _ordersService;
}