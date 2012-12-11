package org.bluemagic.ui.domain;

import java.util.Date;

public class PropertyDetail extends PropertyInfo {

	private String owner;
	
	private Date created;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
