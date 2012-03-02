package org.bluemagic.config.ui.vo;

import java.util.List;

/**
 * Contains all the attributes that make up an individual property.  This is by 
 * no means an exhaustive list.  As new requirements come up, we will see this class 
 * grow in size.  However, there should be little to no logic in this class.
 */
public class Property {

	private String baseName;
	private String value;
	private List<PropertyTag> tags;
	
	public String getBaseName() {
		return baseName;
	}
	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<PropertyTag> getTags() {
		return tags;
	}
	public void setTags(List<PropertyTag> tags) {
		this.tags = tags;
	}
}
