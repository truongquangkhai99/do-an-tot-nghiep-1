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
 * This class is a wrapper for {@link OrderLineService}.
 * </p>
 *
 * @author    Be
 * @see       OrderLineService
 * @generated
 */
public class OrderLineServiceWrapper implements OrderLineService,
	ServiceWrapper<OrderLineService> {
	public OrderLineServiceWrapper(OrderLineService orderLineService) {
		_orderLineService = orderLineService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _orderLineService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_orderLineService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _orderLineService.invokeMethod(name, parameterTypes, arguments);
	}

	public irestads.model.OrderLine createOrderLine(
		java.lang.Long orderLineId, int numOfDish, int statusDish, long dishId,
		long orderId, long orderDate) {
		return _orderLineService.createOrderLine(orderLineId, numOfDish,
			statusDish, dishId, orderId, orderDate);
	}

	public boolean deleteOrderLineById(long orderLineId) {
		return _orderLineService.deleteOrderLineById(orderLineId);
	}

	public java.util.List<irestads.model.OrderLine> getOrderLineByOrder(
		long orderId) {
		return _orderLineService.getOrderLineByOrder(orderId);
	}

	public irestads.model.OrderLine updateOrderLine(long orderLineId,
		int numOfFinishDish, int status) {
		return _orderLineService.updateOrderLine(orderLineId, numOfFinishDish,
			status);
	}

	public irestads.model.OrderLine synchStatusOrderLine(
		irestads.model.OrderLine ol) {
		return _orderLineService.synchStatusOrderLine(ol);
	}

	public int getCharge(irestads.model.OrderLine orderLine) {
		return _orderLineService.getCharge(orderLine);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public OrderLineService getWrappedOrderLineService() {
		return _orderLineService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedOrderLineService(OrderLineService orderLineService) {
		_orderLineService = orderLineService;
	}

	public OrderLineService getWrappedService() {
		return _orderLineService;
	}

	public void setWrappedService(OrderLineService orderLineService) {
		_orderLineService = orderLineService;
	}

	private OrderLineService _orderLineService;
}