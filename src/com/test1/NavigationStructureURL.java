package com.test1;

public class NavigationStructureURL {
	private Integer id;
	private String pageName;
	private String pageURL;
	private String pageType;
	private String creation_date;
	private String entityState;
	private String modifiedDate;

	public NavigationStructureURL() {

	}

	public NavigationStructureURL(Integer id, String pageName, String pageURL, String pageType, String creation_date,
			String entityState, String modifiedDate) {
		super();
		this.id = id;
		this.pageName = pageName;
		this.pageURL = pageURL;
		this.pageType = pageType;
		this.creation_date = creation_date;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageURL() {
		return pageURL;
	}

	public void setPageURL(String pageURL) {
		this.pageURL = pageURL;
	}

	public String getPageType() {
		return pageType;
	}

	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(String creation_date) {
		this.creation_date = creation_date;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
