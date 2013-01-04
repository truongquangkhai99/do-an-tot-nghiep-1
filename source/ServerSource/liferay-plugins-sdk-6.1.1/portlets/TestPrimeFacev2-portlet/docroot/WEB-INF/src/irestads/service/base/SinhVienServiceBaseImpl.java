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

package irestads.service.base;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import irestads.model.SinhVien;

import irestads.service.LopLocalService;
import irestads.service.LopService;
import irestads.service.SinhVienLocalService;
import irestads.service.SinhVienService;

import irestads.service.persistence.LopPersistence;
import irestads.service.persistence.SinhVienPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the sinh vien remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link irestads.service.impl.SinhVienServiceImpl}.
 * </p>
 *
 * @author ADMIN
 * @see irestads.service.impl.SinhVienServiceImpl
 * @see irestads.service.SinhVienServiceUtil
 * @generated
 */
public abstract class SinhVienServiceBaseImpl extends BaseServiceImpl
	implements SinhVienService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link irestads.service.SinhVienServiceUtil} to access the sinh vien remote service.
	 */

	/**
	 * Returns the lop local service.
	 *
	 * @return the lop local service
	 */
	public LopLocalService getLopLocalService() {
		return lopLocalService;
	}

	/**
	 * Sets the lop local service.
	 *
	 * @param lopLocalService the lop local service
	 */
	public void setLopLocalService(LopLocalService lopLocalService) {
		this.lopLocalService = lopLocalService;
	}

	/**
	 * Returns the lop remote service.
	 *
	 * @return the lop remote service
	 */
	public LopService getLopService() {
		return lopService;
	}

	/**
	 * Sets the lop remote service.
	 *
	 * @param lopService the lop remote service
	 */
	public void setLopService(LopService lopService) {
		this.lopService = lopService;
	}

	/**
	 * Returns the lop persistence.
	 *
	 * @return the lop persistence
	 */
	public LopPersistence getLopPersistence() {
		return lopPersistence;
	}

	/**
	 * Sets the lop persistence.
	 *
	 * @param lopPersistence the lop persistence
	 */
	public void setLopPersistence(LopPersistence lopPersistence) {
		this.lopPersistence = lopPersistence;
	}

	/**
	 * Returns the sinh vien local service.
	 *
	 * @return the sinh vien local service
	 */
	public SinhVienLocalService getSinhVienLocalService() {
		return sinhVienLocalService;
	}

	/**
	 * Sets the sinh vien local service.
	 *
	 * @param sinhVienLocalService the sinh vien local service
	 */
	public void setSinhVienLocalService(
		SinhVienLocalService sinhVienLocalService) {
		this.sinhVienLocalService = sinhVienLocalService;
	}

	/**
	 * Returns the sinh vien remote service.
	 *
	 * @return the sinh vien remote service
	 */
	public SinhVienService getSinhVienService() {
		return sinhVienService;
	}

	/**
	 * Sets the sinh vien remote service.
	 *
	 * @param sinhVienService the sinh vien remote service
	 */
	public void setSinhVienService(SinhVienService sinhVienService) {
		this.sinhVienService = sinhVienService;
	}

	/**
	 * Returns the sinh vien persistence.
	 *
	 * @return the sinh vien persistence
	 */
	public SinhVienPersistence getSinhVienPersistence() {
		return sinhVienPersistence;
	}

	/**
	 * Sets the sinh vien persistence.
	 *
	 * @param sinhVienPersistence the sinh vien persistence
	 */
	public void setSinhVienPersistence(SinhVienPersistence sinhVienPersistence) {
		this.sinhVienPersistence = sinhVienPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return SinhVien.class;
	}

	protected String getModelClassName() {
		return SinhVien.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = sinhVienPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = LopLocalService.class)
	protected LopLocalService lopLocalService;
	@BeanReference(type = LopService.class)
	protected LopService lopService;
	@BeanReference(type = LopPersistence.class)
	protected LopPersistence lopPersistence;
	@BeanReference(type = SinhVienLocalService.class)
	protected SinhVienLocalService sinhVienLocalService;
	@BeanReference(type = SinhVienService.class)
	protected SinhVienService sinhVienService;
	@BeanReference(type = SinhVienPersistence.class)
	protected SinhVienPersistence sinhVienPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private SinhVienServiceClpInvoker _clpInvoker = new SinhVienServiceClpInvoker();
}