package com.example.demo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties
public interface TicketRepartition {
	
	public Date date_creation();
    public String first_name();
    public String last_name();
    public String nom_produit();
    public String nom_version();


	

}
