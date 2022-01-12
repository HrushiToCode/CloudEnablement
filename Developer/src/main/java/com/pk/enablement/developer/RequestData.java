package com.pk.enablement.developer;

public class RequestData {
	
	public String resourceName;
	
	public String resourceType;
	
	public String region;
	
	public String location;
	
	public int nodes;
	
	public int cores;
	
	public int ram;
	
	public String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNodes() {
		return nodes;
	}

	public void setNodes(int nodes) {
		this.nodes = nodes;
	}

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}
	
}
