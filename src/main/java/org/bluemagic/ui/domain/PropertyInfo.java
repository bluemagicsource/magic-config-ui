package org.bluemagic.ui.domain;

import java.net.URI;
import java.util.Collection;
import java.util.Map.Entry;

public class PropertyInfo {
	
	private Entry<URI,Object> property;
	
	private Collection<TagInfo> tags;

	public Collection<TagInfo> getTags() {
		return tags;
	}

	public void setTags(Collection<TagInfo> tags) {
		this.tags = tags;
	}

	public Entry<URI,Object> getProperty() {
		return property;
	}

	public void setProperty(Entry<URI,Object> property) {
		this.property = property;
	}
}
