package org.bluemagic.ui.service;

import java.util.List;

import org.bluemagic.ui.domain.PropertyDetail;
import org.bluemagic.ui.domain.PropertyInfo;
import org.bluemagic.ui.domain.TagDetail;

public interface MagicDisplayService {

	public List<PropertyInfo> allPropertyInfo();
	
	public TagDetail tagDetail(String tag);
	
	public PropertyDetail propertyDetail(String key);
}
