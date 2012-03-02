package org.bluemagic.config.ui.vo;

/**
 * Contains all the attributes that make up a tag.  Each tag should have 
 * two colors associated with it that are used to display on the UI.
 */
public class PropertyTag {

	private String tagValue;
	private String backgroundColor;
	private String textColor;
	
	public String getTagValue() {
		return tagValue;
	}
	
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}
	
	public String getBackgroundColor() {
		return backgroundColor;
	}
	
	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	
	public String getTextColor() {
		return textColor;
	}
	
	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}
	
	
}
