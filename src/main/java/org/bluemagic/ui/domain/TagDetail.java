package org.bluemagic.ui.domain;

import java.util.Date;

public class TagDetail extends TagInfo {
	
	private Date created;
	
	private String owner;
	
	private long occurrences;

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getOccurrences() {
		return occurrences;
	}

	public void setOccurrences(long occurrences) {
		this.occurrences = occurrences;
	}
}
