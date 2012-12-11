package org.bluemagic.ui.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.bluemagic.config.api.property.LocatedProperty;
import org.bluemagic.config.api.tag.SingleTag;
import org.bluemagic.ui.domain.PropertyDetail;
import org.bluemagic.ui.domain.PropertyInfo;
import org.bluemagic.ui.domain.TagDetail;
import org.bluemagic.ui.domain.TagInfo;
import org.bluemagic.ui.domain.TagInfo.Obligation;
import org.bluemagic.ui.domain.TagInfo.Visibility;

public class MagicDisplayServiceImpl implements MagicDisplayService {

	public List<PropertyInfo> allPropertyInfo() {
		
		List<PropertyInfo> propertyInfoList = new ArrayList<PropertyInfo>();
		
		PropertyInfo info;
		TagInfo tagInfo;
		Collection<TagInfo> tags;
		
		try {
			info = new PropertyInfo();
			info.setProperty(new LocatedProperty(new URI("abc"), new URI("abc"), "123", this.getClass()));
			tagInfo = new TagInfo();
			tagInfo.setTag(new SingleTag("science"));
			tagInfo.setColor("red");
			tagInfo.setBackgroundColor("silver");
			tagInfo.setObligation(Obligation.MANDATORY);
			tagInfo.setVisibility(Visibility.PUBLIC);
			tags = new ArrayList<TagInfo>();
			tags.add(tagInfo);
			info.setTags(tags);
			
			propertyInfoList.add(info);
			info = new PropertyInfo();
			info.setProperty(new LocatedProperty(new URI("blue"), new URI("blue"), "lamp-post", this.getClass()));
			tagInfo = new TagInfo();
			tagInfo.setTag(new SingleTag("appliance"));
			tagInfo.setColor("white");
			tagInfo.setBackgroundColor("blue");
			tagInfo.setObligation(Obligation.OPTIONAL);
			tagInfo.setVisibility(Visibility.PUBLIC);
			tags = new ArrayList<TagInfo>();
			tags.add(tagInfo);
			info.setTags(tags);
			propertyInfoList.add(info);
			
		} catch (URISyntaxException use) {
			use.printStackTrace();
		}
		return propertyInfoList;
	}

	public TagDetail tagDetail(String tag) {

		TagDetail detail = new TagDetail();
		detail.setTag(new SingleTag(tag));
		detail.setColor("white");
		detail.setBackgroundColor("blue");
		detail.setObligation(Obligation.OPTIONAL);
		detail.setVisibility(Visibility.PUBLIC);
		detail.setOwner("@jackrod");
		detail.setCreated(new Date());
		detail.setOccurrences(201);
		
		return detail;
	}

	public PropertyDetail propertyDetail(String key) {
		
		PropertyDetail detail = new PropertyDetail();
		
		try {
			detail.setProperty(new LocatedProperty(new URI("blue"), new URI("blue"), "lamp-post", this.getClass()));
		} catch (URISyntaxException use) {
			use.printStackTrace();
		}
		TagInfo tagInfo = new TagInfo();
		tagInfo.setTag(new SingleTag("science"));
		tagInfo.setColor("red");
		tagInfo.setBackgroundColor("silver");
		tagInfo.setObligation(Obligation.MANDATORY);
		tagInfo.setVisibility(Visibility.PUBLIC);
		List<TagInfo> tags = new ArrayList<TagInfo>();
		tags.add(tagInfo);
			
		detail.setTags(tags);
		detail.setOwner("@jackrod");
		detail.setCreated(new Date());
			
		return detail;
	}
}
