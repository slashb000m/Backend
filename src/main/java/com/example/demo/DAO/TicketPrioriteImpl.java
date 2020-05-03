package com.example.demo.DAO;

import java.util.Date;

public class TicketPrioriteImpl {
	
	private String nom_produit;
	private String priorite;
	private Date date_creation;
	private String nom_ticket;
	
	
    //Getters and Setters 
	
	
	public String getNom_produit() {
		return nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	public String getPriorite() {
		return priorite;
	}
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public String getNom_ticket() {
		return nom_ticket;
	}
	public void setNom_ticket(String nom_ticket) {
		this.nom_ticket = nom_ticket;
	}
	

	
	
}
