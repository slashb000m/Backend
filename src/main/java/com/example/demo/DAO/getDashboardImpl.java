package com.example.demo.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class getDashboardImpl implements getDashboard {
	
	private int id;
	
	@JsonProperty("nom_dashboard")
	private String nom_dashboard;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_dashboard() {
		return nom_dashboard;
	}
	public void setNom_dashboard(String nom_dashboard) {
		this.nom_dashboard = nom_dashboard;
	}
	

}
