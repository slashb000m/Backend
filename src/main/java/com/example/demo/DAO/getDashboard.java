package com.example.demo.DAO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public interface getDashboard {
	
	public int getId();
	public String getNom_dashboard();

}
