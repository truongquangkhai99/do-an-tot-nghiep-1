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
 * This class is a wrapper for {@link UVersionService}.
 * </p>
 *
 * @author    Be
 * @see       UVersionService
 * @generated
 */
public class UVersionServiceWrapper implements UVersionService,
	ServiceWrapper<UVersionService> {
	public UVersionServiceWrapper(UVersionService uVersionService) {
		_uVersionService = uVersionService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _uVersionService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_uVersionService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _uVersionService.invokeMethod(name, parameterTypes, arguments);
	}

	public irestads.model.UVersion createVersion(irestads.model.UVersion v) {
		return _uVersionService.createVersion(v);
	}

	public irestads.model.UVersion createVersion(long idObj,
		java.lang.String nameObj, java.lang.String type) {
		return _uVersionService.createVersion(idObj, nameObj, type);
	}

	public java.util.List<irestads.model.UVersion> findNextVersions(
		long uversionId) {
		return _uVersionService.findNextVersions(uversionId);
	}

	public void checkDelete(java.lang.String objName, long idObj) {
		_uVersionService.checkDelete(objName, idObj);
	}

	public java.util.List<irestads.model.UVersion> findBylogIdAndName(
		java.lang.String typename, long logId) {
		return _uVersionService.findBylogIdAndName(typename, logId);
	}

	public void deleteVersion(long versionId) {
		_uVersionService.deleteVersion(versionId);
	}

	public irestads.model.UVersion updateVersion(
		irestads.model.UVersion newUversion) {
		return _uVersionService.updateVersion(newUversion);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public UVersionService getWrappedUVersionService() {
		return _uVersionService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedUVersionService(UVersionService uVersionService) {
		_uVersionService = uVersionService;
	}

	public UVersionService getWrappedService() {
		return _uVersionService;
	}

	public void setWrappedService(UVersionService uVersionService) {
		_uVersionService = uVersionService;
	}

	private UVersionService _uVersionService;
}