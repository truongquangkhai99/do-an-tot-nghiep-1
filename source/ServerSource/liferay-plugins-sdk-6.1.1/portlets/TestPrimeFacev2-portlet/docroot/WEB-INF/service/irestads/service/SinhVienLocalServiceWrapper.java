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
 * This class is a wrapper for {@link SinhVienLocalService}.
 * </p>
 *
 * @author    ADMIN
 * @see       SinhVienLocalService
 * @generated
 */
public class SinhVienLocalServiceWrapper implements SinhVienLocalService,
	ServiceWrapper<SinhVienLocalService> {
	public SinhVienLocalServiceWrapper(
		SinhVienLocalService sinhVienLocalService) {
		_sinhVienLocalService = sinhVienLocalService;
	}

	/**
	* Adds the sinh vien to the database. Also notifies the appropriate model listeners.
	*
	* @param sinhVien the sinh vien
	* @return the sinh vien that was added
	* @throws SystemException if a system exception occurred
	*/
	public irestads.model.SinhVien addSinhVien(irestads.model.SinhVien sinhVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.addSinhVien(sinhVien);
	}

	/**
	* Creates a new sinh vien with the primary key. Does not add the sinh vien to the database.
	*
	* @param sinhVienId the primary key for the new sinh vien
	* @return the new sinh vien
	*/
	public irestads.model.SinhVien createSinhVien(long sinhVienId) {
		return _sinhVienLocalService.createSinhVien(sinhVienId);
	}

	/**
	* Deletes the sinh vien with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sinhVienId the primary key of the sinh vien
	* @return the sinh vien that was removed
	* @throws PortalException if a sinh vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public irestads.model.SinhVien deleteSinhVien(long sinhVienId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.deleteSinhVien(sinhVienId);
	}

	/**
	* Deletes the sinh vien from the database. Also notifies the appropriate model listeners.
	*
	* @param sinhVien the sinh vien
	* @return the sinh vien that was removed
	* @throws SystemException if a system exception occurred
	*/
	public irestads.model.SinhVien deleteSinhVien(
		irestads.model.SinhVien sinhVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.deleteSinhVien(sinhVien);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sinhVienLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.dynamicQueryCount(dynamicQuery);
	}

	public irestads.model.SinhVien fetchSinhVien(long sinhVienId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.fetchSinhVien(sinhVienId);
	}

	/**
	* Returns the sinh vien with the primary key.
	*
	* @param sinhVienId the primary key of the sinh vien
	* @return the sinh vien
	* @throws PortalException if a sinh vien with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public irestads.model.SinhVien getSinhVien(long sinhVienId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.getSinhVien(sinhVienId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the sinh viens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of sinh viens
	* @param end the upper bound of the range of sinh viens (not inclusive)
	* @return the range of sinh viens
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<irestads.model.SinhVien> getSinhViens(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.getSinhViens(start, end);
	}

	/**
	* Returns the number of sinh viens.
	*
	* @return the number of sinh viens
	* @throws SystemException if a system exception occurred
	*/
	public int getSinhViensCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.getSinhViensCount();
	}

	/**
	* Updates the sinh vien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sinhVien the sinh vien
	* @return the sinh vien that was updated
	* @throws SystemException if a system exception occurred
	*/
	public irestads.model.SinhVien updateSinhVien(
		irestads.model.SinhVien sinhVien)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.updateSinhVien(sinhVien);
	}

	/**
	* Updates the sinh vien in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sinhVien the sinh vien
	* @param merge whether to merge the sinh vien with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the sinh vien that was updated
	* @throws SystemException if a system exception occurred
	*/
	public irestads.model.SinhVien updateSinhVien(
		irestads.model.SinhVien sinhVien, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sinhVienLocalService.updateSinhVien(sinhVien, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _sinhVienLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sinhVienLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sinhVienLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public java.util.List<irestads.model.SinhVien> getSinhVienByLop(long lopId) {
		return _sinhVienLocalService.getSinhVienByLop(lopId);
	}

	public java.util.List<irestads.model.SinhVien> getAllSinhVien() {
		return _sinhVienLocalService.getAllSinhVien();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public SinhVienLocalService getWrappedSinhVienLocalService() {
		return _sinhVienLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedSinhVienLocalService(
		SinhVienLocalService sinhVienLocalService) {
		_sinhVienLocalService = sinhVienLocalService;
	}

	public SinhVienLocalService getWrappedService() {
		return _sinhVienLocalService;
	}

	public void setWrappedService(SinhVienLocalService sinhVienLocalService) {
		_sinhVienLocalService = sinhVienLocalService;
	}

	private SinhVienLocalService _sinhVienLocalService;
}