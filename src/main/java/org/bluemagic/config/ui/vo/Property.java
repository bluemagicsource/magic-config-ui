package org.bluemagic.config.ui.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains all the attributes that make up an individual property.  This is by 
 * no means an exhaustive list.  As new requirements come up, we will see this class 
 * grow in size.  However, there should be little to no logic in this class.
 */
public class Property {

	/**
	 * The name of the property without the tags.
	 */
	private String baseName;
	
	/**
	 * The property name plus it's associated tags appended on.  A convenient piece of information,
	 * used when building URL links in the JSP's.
	 */
	private String fullName;
	
	/**
	 * The value associated with this particular property.
	 */
	private String value;
	
	/**
	 * The tags associated with this property.
	 */
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
		if (tags == null) {
			return new ArrayList<PropertyTag>();
		}
		
		return tags;
	}
	
	public void setTags(List<PropertyTag> tags) {
		this.tags = tags;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
