package com.example.demo.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DashboardIdImpl implements DashboardId {
	
	@JsonProperty("dashboard_id")
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	} 
	
	

}
