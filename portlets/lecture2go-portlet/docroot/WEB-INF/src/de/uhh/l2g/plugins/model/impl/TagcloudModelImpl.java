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

import de.uhh.l2g.plugins.model.Tagcloud;
import de.uhh.l2g.plugins.model.TagcloudModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Tagcloud service. Represents a row in the &quot;LG_Tagcloud&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link de.uhh.l2g.plugins.model.TagcloudModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TagcloudImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see TagcloudImpl
 * @see de.uhh.l2g.plugins.model.Tagcloud
 * @see de.uhh.l2g.plugins.model.TagcloudModel
 * @generated
 */
public class TagcloudModelImpl extends BaseModelImpl<Tagcloud>
	implements TagcloudModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tagcloud model instance should use the {@link de.uhh.l2g.plugins.model.Tagcloud} interface instead.
	 */
	public static final String TABLE_NAME = "LG_Tagcloud";
	public static final Object[][] TABLE_COLUMNS = {
			{ "tagcloudId", Types.BIGINT },
			{ "objectClassType", Types.VARCHAR },
			{ "objectId", Types.BIGINT },
			{ "tags", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table LG_Tagcloud (tagcloudId LONG not null primary key,objectClassType VARCHAR(75) null,objectId LONG,tags STRING null)";
	public static final String TABLE_SQL_DROP = "drop table LG_Tagcloud";
	public static final String ORDER_BY_JPQL = " ORDER BY tagcloud.tagcloudId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY LG_Tagcloud.tagcloudId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.de.uhh.l2g.plugins.model.Tagcloud"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.de.uhh.l2g.plugins.model.Tagcloud"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.de.uhh.l2g.plugins.model.Tagcloud"),
			true);
	public static long OBJECTCLASSTYPE_COLUMN_BITMASK = 1L;
	public static long OBJECTID_COLUMN_BITMASK = 2L;
	public static long TAGCLOUDID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.de.uhh.l2g.plugins.model.Tagcloud"));

	public TagcloudModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tagcloudId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTagcloudId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tagcloudId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Tagcloud.class;
	}

	@Override
	public String getModelClassName() {
		return Tagcloud.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tagcloudId", getTagcloudId());
		attributes.put("objectClassType", getObjectClassType());
		attributes.put("objectId", getObjectId());
		attributes.put("tags", getTags());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tagcloudId = (Long)attributes.get("tagcloudId");

		if (tagcloudId != null) {
			setTagcloudId(tagcloudId);
		}

		String objectClassType = (String)attributes.get("objectClassType");

		if (objectClassType != null) {
			setObjectClassType(objectClassType);
		}

		Long objectId = (Long)attributes.get("objectId");

		if (objectId != null) {
			setObjectId(objectId);
		}

		String tags = (String)attributes.get("tags");

		if (tags != null) {
			setTags(tags);
		}
	}

	@Override
	public long getTagcloudId() {
		return _tagcloudId;
	}

	@Override
	public void setTagcloudId(long tagcloudId) {
		_tagcloudId = tagcloudId;
	}

	@Override
	public String getObjectClassType() {
		if (_objectClassType == null) {
			return StringPool.BLANK;
		}
		else {
			return _objectClassType;
		}
	}

	@Override
	public void setObjectClassType(String objectClassType) {
		_columnBitmask |= OBJECTCLASSTYPE_COLUMN_BITMASK;

		if (_originalObjectClassType == null) {
			_originalObjectClassType = _objectClassType;
		}

		_objectClassType = objectClassType;
	}

	public String getOriginalObjectClassType() {
		return GetterUtil.getString(_originalObjectClassType);
	}

	@Override
	public long getObjectId() {
		return _objectId;
	}

	@Override
	public void setObjectId(long objectId) {
		_columnBitmask |= OBJECTID_COLUMN_BITMASK;

		if (!_setOriginalObjectId) {
			_setOriginalObjectId = true;

			_originalObjectId = _objectId;
		}

		_objectId = objectId;
	}

	public long getOriginalObjectId() {
		return _originalObjectId;
	}

	@Override
	public String getTags() {
		if (_tags == null) {
			return StringPool.BLANK;
		}
		else {
			return _tags;
		}
	}

	@Override
	public void setTags(String tags) {
		_tags = tags;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Tagcloud.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Tagcloud toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Tagcloud)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TagcloudImpl tagcloudImpl = new TagcloudImpl();

		tagcloudImpl.setTagcloudId(getTagcloudId());
		tagcloudImpl.setObjectClassType(getObjectClassType());
		tagcloudImpl.setObjectId(getObjectId());
		tagcloudImpl.setTags(getTags());

		tagcloudImpl.resetOriginalValues();

		return tagcloudImpl;
	}

	@Override
	public int compareTo(Tagcloud tagcloud) {
		long primaryKey = tagcloud.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Tagcloud)) {
			return false;
		}

		Tagcloud tagcloud = (Tagcloud)obj;

		long primaryKey = tagcloud.getPrimaryKey();

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
		TagcloudModelImpl tagcloudModelImpl = this;

		tagcloudModelImpl._originalObjectClassType = tagcloudModelImpl._objectClassType;

		tagcloudModelImpl._originalObjectId = tagcloudModelImpl._objectId;

		tagcloudModelImpl._setOriginalObjectId = false;

		tagcloudModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Tagcloud> toCacheModel() {
		TagcloudCacheModel tagcloudCacheModel = new TagcloudCacheModel();

		tagcloudCacheModel.tagcloudId = getTagcloudId();

		tagcloudCacheModel.objectClassType = getObjectClassType();

		String objectClassType = tagcloudCacheModel.objectClassType;

		if ((objectClassType != null) && (objectClassType.length() == 0)) {
			tagcloudCacheModel.objectClassType = null;
		}

		tagcloudCacheModel.objectId = getObjectId();

		tagcloudCacheModel.tags = getTags();

		String tags = tagcloudCacheModel.tags;

		if ((tags != null) && (tags.length() == 0)) {
			tagcloudCacheModel.tags = null;
		}

		return tagcloudCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{tagcloudId=");
		sb.append(getTagcloudId());
		sb.append(", objectClassType=");
		sb.append(getObjectClassType());
		sb.append(", objectId=");
		sb.append(getObjectId());
		sb.append(", tags=");
		sb.append(getTags());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("de.uhh.l2g.plugins.model.Tagcloud");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>tagcloudId</column-name><column-value><![CDATA[");
		sb.append(getTagcloudId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objectClassType</column-name><column-value><![CDATA[");
		sb.append(getObjectClassType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>objectId</column-name><column-value><![CDATA[");
		sb.append(getObjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tags</column-name><column-value><![CDATA[");
		sb.append(getTags());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Tagcloud.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Tagcloud.class
		};
	private long _tagcloudId;
	private String _objectClassType;
	private String _originalObjectClassType;
	private long _objectId;
	private long _originalObjectId;
	private boolean _setOriginalObjectId;
	private String _tags;
	private long _columnBitmask;
	private Tagcloud _escapedModel;
}