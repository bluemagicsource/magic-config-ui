package org.bluemagic.ui.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.bluemagic.config.api.property.LocatedProperty;
import org.bluemagic.config.api.tag.SingleTag;
import org.bluemagic.config.api.tag.Tag;
import org.bluemagic.ui.domain.PropertyDetail;
import org.bluemagic.ui.domain.PropertyInfo;
import org.bluemagic.ui.domain.TagDetail;
import org.bluemagic.ui.domain.TagInfo;

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
			tags = new ArrayList<TagInfo>();
			tags.add(tagInfo);
			info.setTags(tags);
			
			propertyInfoList.add(info);
			info = new PropertyInfo();
			info.setProperty(new LocatedProperty(new URI("blue"), new URI("blue"), "lamp-post", this.getClass()));
			tagInfo = new TagInfo();
			SingleTag tag = new SingleTag("appliance");
			tag.setObligation(Tag.Obligation.OPTIONAL);
			tagInfo.setTag(tag);
			tagInfo.setColor("white");
			tagInfo.setBackgroundColor("blue");
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
		SingleTag tag2 = new SingleTag(tag);
		tag2.setObligation(Tag.Obligation.OPTIONAL);
		detail.setTag(tag2);
		detail.setColor("white");
		detail.setBackgroundColor("blue");
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
		List<TagInfo> tags = new ArrayList<TagInfo>();
		tags.add(tagInfo);
			
		detail.setTags(tags);
		detail.setOwner("@jackrod");
		detail.setCreated(new Date());
			
		return detail;
	}
}
