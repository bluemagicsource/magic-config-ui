package org.bluemagic.ui.domain;

import org.bluemagic.config.api.tag.Tag;

public class TagInfo {
	
	private Tag tag;
	
	private String color;
	
	private String backgroundColor;
	
	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
}
