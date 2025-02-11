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

import irestads.service.DishTableServiceUtil;

import java.rmi.RemoteException;

/**
 * <p>
 * This class provides a SOAP utility for the
 * {@link irestads.service.DishTableServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 * </p>
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link irestads.model.DishTableSoap}.
 * If the method in the service utility returns a
 * {@link irestads.model.DishTable}, that is translated to a
 * {@link irestads.model.DishTableSoap}. Methods that SOAP cannot
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
 * @see       DishTableServiceHttp
 * @see       irestads.model.DishTableSoap
 * @see       irestads.service.DishTableServiceUtil
 * @generated
 */
public class DishTableServiceSoap {
	public static irestads.model.DishTableSoap[] getAllDishTables()
		throws RemoteException {
		try {
			java.util.List<irestads.model.DishTable> returnValue = DishTableServiceUtil.getAllDishTables();

			return irestads.model.DishTableSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishTableSoap updateDishTable(
		irestads.model.DishTableSoap dt) throws RemoteException {
		try {
			irestads.model.DishTable returnValue = DishTableServiceUtil.updateDishTable(irestads.model.impl.DishTableModelImpl.toModel(
						dt));

			return irestads.model.DishTableSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static irestads.model.DishTableSoap updateTableStatus(
		java.lang.String idTable, boolean value, long orderId)
		throws RemoteException {
		try {
			irestads.model.DishTable returnValue = DishTableServiceUtil.updateTableStatus(idTable,
					value, orderId);

			return irestads.model.DishTableSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DishTableServiceSoap.class);
}