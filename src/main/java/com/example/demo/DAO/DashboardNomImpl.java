package com.example.demo.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DashboardNomImpl implements DashboardNom {
	

	@JsonProperty("nom_dashboard")
	private String nom_dashboard;

	public String getNom_dashboard() {
		return nom_dashboard;
	}

	public void setNom_dashboard(String nom_dashboard) {
		this.nom_dashboard = nom_dashboard;
	}
	
	

}
