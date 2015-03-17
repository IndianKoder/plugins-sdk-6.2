/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package de.uhh.l2g.plugins.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import de.uhh.l2g.plugins.model.Creator;
import de.uhh.l2g.plugins.model.CreatorModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Creator service. Represents a row in the &quot;LG_Creator&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.CreatorModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CreatorImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see CreatorImpl
 * @see de.uhh.l2g.plugins.model.Creator
 * @see de.uhh.l2g.plugins.model.CreatorModel
 * @generated
 */
public class CreatorModelImpl extends BaseModelImpl<Creator>
	implements CreatorModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a creator model instance should use the {@link de.uhh.l2g.plugins.model.Creator} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Creator";
	public static final Object[][] TABLE_COLUMNS = {
			{ "creatorId", Types.BIGINT },
			{ "firstName", Types.VARCHAR },
			{ "lastName", Types.VARCHAR },
			{ "middleName", Types.VARCHAR },
			{ "jobTitle", Types.VARCHAR },
			{ "gender", Types.VARCHAR },
			{ "fullName", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Creator (creatorId LONG not null primary key,firstName VARCHAR(75) null,lastName VARCHAR(75) null,middleName VARCHAR(75) null,jobTitle VARCHAR(75) null,gender VARCHAR(75) null,fullName VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table LG_Creator";
	public static final String ORDER_BY_JPQL = " ORDER BY creator.lastName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Creator.lastName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Creator"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Creator"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Creator"),
			true);
	public static long FIRSTNAME_COLUMN_BITMASK = 1L;
	public static long FULLNAME_COLUMN_BITMASK = 2L;
	public static long LASTNAME_COLUMN_BITMASK = 4L;
	public static long MIDDLENAME_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Creator"));

	public CreatorModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _creatorId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCreatorId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _creatorId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Creator.class;
	}

	@Override
	public String getModelClassName() {
		return Creator.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("creatorId", getCreatorId());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("middleName", getMiddleName());
		attributes.put("jobTitle", getJobTitle());
		attributes.put("gender", getGender());
		attributes.put("fullName", getFullName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creatorId = (Long)attributes.get("creatorId");

		if (creatorId != null) {
			setCreatorId(creatorId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String jobTitle = (String)attributes.get("jobTitle");

		if (jobTitle != null) {
			setJobTitle(jobTitle);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}
	}

	@Override
	public long getCreatorId() {
		return _creatorId;
	}

	@Override
	public void setCreatorId(long creatorId) {
		_creatorId = creatorId;
	}

	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		_columnBitmask |= FIRSTNAME_COLUMN_BITMASK;

		if (_originalFirstName == null) {
			_originalFirstName = _firstName;
		}

		_firstName = firstName;
	}

	public String getOriginalFirstName() {
		return GetterUtil.getString(_originalFirstName);
	}

	@Override
	public String getLastName() {
		if (_lastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_columnBitmask = -1L;

		if (_originalLastName == null) {
			_originalLastName = _lastName;
		}

		_lastName = lastName;
	}

	public String getOriginalLastName() {
		return GetterUtil.getString(_originalLastName);
	}

	@Override
	public String getMiddleName() {
		if (_middleName == null) {
			return StringPool.BLANK;
		}
		else {
			return _middleName;
		}
	}

	@Override
	public void setMiddleName(String middleName) {
		_columnBitmask |= MIDDLENAME_COLUMN_BITMASK;

		if (_originalMiddleName == null) {
			_originalMiddleName = _middleName;
		}

		_middleName = middleName;
	}

	public String getOriginalMiddleName() {
		return GetterUtil.getString(_originalMiddleName);
	}

	@Override
	public String getJobTitle() {
		if (_jobTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _jobTitle;
		}
	}

	@Override
	public void setJobTitle(String jobTitle) {
		_jobTitle = jobTitle;
	}

	@Override
	public String getGender() {
		if (_gender == null) {
			return StringPool.BLANK;
		}
		else {
			return _gender;
		}
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;
	}

	@Override
	public String getFullName() {
		if (_fullName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fullName;
		}
	}

	@Override
	public void setFullName(String fullName) {
		_columnBitmask |= FULLNAME_COLUMN_BITMASK;

		if (_originalFullName == null) {
			_originalFullName = _fullName;
		}

		_fullName = fullName;
	}

	public String getOriginalFullName() {
		return GetterUtil.getString(_originalFullName);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Creator.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Creator toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Creator)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CreatorImpl creatorImpl = new CreatorImpl();

		creatorImpl.setCreatorId(getCreatorId());
		creatorImpl.setFirstName(getFirstName());
		creatorImpl.setLastName(getLastName());
		creatorImpl.setMiddleName(getMiddleName());
		creatorImpl.setJobTitle(getJobTitle());
		creatorImpl.setGender(getGender());
		creatorImpl.setFullName(getFullName());

		creatorImpl.resetOriginalValues();

		return creatorImpl;
	}

	@Override
	public int compareTo(Creator creator) {
		int value = 0;

		value = getLastName().compareTo(creator.getLastName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Creator)) {
			return false;
		}

		Creator creator = (Creator)obj;

		long primaryKey = creator.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		CreatorModelImpl creatorModelImpl = this;

		creatorModelImpl._originalFirstName = creatorModelImpl._firstName;

		creatorModelImpl._originalLastName = creatorModelImpl._lastName;

		creatorModelImpl._originalMiddleName = creatorModelImpl._middleName;

		creatorModelImpl._originalFullName = creatorModelImpl._fullName;

		creatorModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Creator> toCacheModel() {
		CreatorCacheModel creatorCacheModel = new CreatorCacheModel();

		creatorCacheModel.creatorId = getCreatorId();

		creatorCacheModel.firstName = getFirstName();

		String firstName = creatorCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			creatorCacheModel.firstName = null;
		}

		creatorCacheModel.lastName = getLastName();

		String lastName = creatorCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			creatorCacheModel.lastName = null;
		}

		creatorCacheModel.middleName = getMiddleName();

		String middleName = creatorCacheModel.middleName;

		if ((middleName != null) && (middleName.length() == 0)) {
			creatorCacheModel.middleName = null;
		}

		creatorCacheModel.jobTitle = getJobTitle();

		String jobTitle = creatorCacheModel.jobTitle;

		if ((jobTitle != null) && (jobTitle.length() == 0)) {
			creatorCacheModel.jobTitle = null;
		}

		creatorCacheModel.gender = getGender();

		String gender = creatorCacheModel.gender;

		if ((gender != null) && (gender.length() == 0)) {
			creatorCacheModel.gender = null;
		}

		creatorCacheModel.fullName = getFullName();

		String fullName = creatorCacheModel.fullName;

		if ((fullName != null) && (fullName.length() == 0)) {
			creatorCacheModel.fullName = null;
		}

		return creatorCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{creatorId=");
		sb.append(getCreatorId());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", middleName=");
		sb.append(getMiddleName());
		sb.append(", jobTitle=");
		sb.append(getJobTitle());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Creator");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>creatorId</column-name><column-value><![CDATA[");
		sb.append(getCreatorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>middleName</column-name><column-value><![CDATA[");
		sb.append(getMiddleName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>jobTitle</column-name><column-value><![CDATA[");
		sb.append(getJobTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Creator.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Creator.class
		};
	private long _creatorId;
	private String _firstName;
	private String _originalFirstName;
	private String _lastName;
	private String _originalLastName;
	private String _middleName;
	private String _originalMiddleName;
	private String _jobTitle;
	private String _gender;
	private String _fullName;
	private String _originalFullName;
	private long _columnBitmask;
	private Creator _escapedModel;
}