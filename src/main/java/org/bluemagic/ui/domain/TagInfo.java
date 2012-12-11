package org.bluemagic.ui.domain;

import org.bluemagic.config.api.tag.Tag;

public class TagInfo {
	
	public enum Visibility { PUBLIC,PRIVATE };
	
	public enum Obligation { MANDATORY,OPTIONAL };

	private Tag tag;
	
	private String color;
	
	private String backgroundColor;
	
	private Visibility visibility;
	
	private Obligation obligation; 
	
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

	public Visibility getVisibility() {
		return visibility;
	}

	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}

	public Obligation getObligation() {
		return obligation;
	}

	public void setObligation(Obligation obligation) {
		this.obligation = obligation;
	}
}
