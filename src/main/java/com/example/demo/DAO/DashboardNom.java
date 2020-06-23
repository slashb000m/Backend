package com.example.demo.DAO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public interface DashboardNom {
	public String getNom_dashboard();
	public void setNom_dashboard(String nom_dashboard);
}
