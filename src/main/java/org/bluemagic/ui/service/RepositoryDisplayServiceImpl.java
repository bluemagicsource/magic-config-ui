package org.bluemagic.ui.service;

import java.util.List;

import org.bluemagic.config.api.Repository;
import org.bluemagic.ui.domain.PropertyDetail;
import org.bluemagic.ui.domain.PropertyInfo;
import org.bluemagic.ui.domain.TagDetail;

public class RepositoryDisplayServiceImpl implements MagicDisplayService {
	
	private Repository repository;

	@Override
	public List<PropertyInfo> allPropertyInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagDetail tagDetail(String tag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PropertyDetail propertyDetail(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	public Repository getRepository() {
		return repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}
}
