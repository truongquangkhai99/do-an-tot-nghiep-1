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

import irestads.model.OrderLine;
import irestads.service.OrderLineLocalServiceUtil;
import irestads.service.base.OrderLineServiceBaseImpl;

/**
 * The implementation of the order line remote service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link irestads.service.OrderLineService} interface.
 * 
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 * 
 * @author Be
 * @see irestads.service.base.OrderLineServiceBaseImpl
 * @see irestads.service.OrderLineServiceUtil
 */
public class OrderLineServiceImpl extends OrderLineServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * irestads.service.OrderLineServiceUtil} to access the order line remote
	 * service.
	 */
	public OrderLine createOrderLine(Long orderLineId, int numOfDish,
			int statusDish, long dishId, long orderId, long orderDate) {
		return OrderLineLocalServiceUtil.createOrderLine(orderLineId,
				numOfDish, statusDish, dishId, orderId, orderDate);
	}

	public boolean deleteOrderLineById(long orderLineId) {
		return OrderLineLocalServiceUtil.deleteOrderLineById(orderLineId);
	}

	public List<OrderLine> getOrderLineByOrder(long orderId) {
		List<OrderLine> orderLines = OrderLineLocalServiceUtil
				.getOrderLineByOrder(orderId);
		return orderLines;
	}

	public OrderLine updateOrderLine(long orderLineId, int numOfFinishDish,
			int status) {
		return OrderLineLocalServiceUtil.updateOrderLine(orderLineId,
				numOfFinishDish, status);
	}
	public OrderLine synchStatusOrderLine(OrderLine ol){
		return OrderLineLocalServiceUtil.synchStatusOrderLine(ol);
	}
	public int getCharge(OrderLine orderLine){
		return OrderLineLocalServiceUtil.getCharge(orderLine);
		
	}

}