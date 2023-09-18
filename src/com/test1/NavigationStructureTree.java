package com.test1;

public class NavigationStructureTree {
	private Integer structureId;
	private String navld;
	private String name;
	private String treeSize;
	private String nodeName;
	private Integer nodeId;
	private Integer nodeLevel;
	private Integer parentId;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public NavigationStructureTree() {

	}

	public NavigationStructureTree(Integer structureId, String navld, String name, String treeSize, String nodeName,
			Integer nodeId, Integer nodeLevel, Integer parentId, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.structureId = structureId;
		this.navld = navld;
		this.name = name;
		this.treeSize = treeSize;
		this.nodeName = nodeName;
		this.nodeId = nodeId;
		this.nodeLevel = nodeLevel;
		this.parentId = parentId;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getStructureId() {
		return structureId;
	}

	public void setStructureId(Integer structureId) {
		this.structureId = structureId;
	}

	public String getNavld() {
		return navld;
	}

	public void setNavld(String navld) {
		this.navld = navld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTreeSize() {
		return treeSize;
	}

	public void setTreeSize(String treeSize) {
		this.treeSize = treeSize;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Integer getNodeId() {
		return nodeId;
	}

	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}

	public Integer getNodeLevel() {
		return nodeLevel;
	}

	public void setNodeLevel(Integer nodeLevel) {
		this.nodeLevel = nodeLevel;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
