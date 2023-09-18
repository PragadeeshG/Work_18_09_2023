package com.test1;

public class NavigationStructure {
	private Integer Id;
	private Integer pfld;
	private String displayName;
	private Integer level;
	private String activity_id;
	private Integer sequence;
	private String pageName;
	private String creation_date;
	private String entityState;
	private String modifiedDate;
	private String userComments;

	public NavigationStructure() {

	}

	public NavigationStructure(Integer id, Integer pfld, String displayName, Integer level, String activity_id,
			Integer sequence, String pageName, String creation_date, String entityState, String modifiedDate,
			String userComments) {
		super();
		Id = id;
		this.pfld = pfld;
		this.displayName = displayName;
		this.level = level;
		this.activity_id = activity_id;
		this.sequence = sequence;
		this.pageName = pageName;
		this.creation_date = creation_date;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
		this.userComments = userComments;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getPfld() {
		return pfld;
	}

	public void setPfld(Integer pfld) {
		this.pfld = pfld;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
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

	public String getUserComments() {
		return userComments;
	}

	public void setUserComments(String userComments) {
		this.userComments = userComments;
	}

}
