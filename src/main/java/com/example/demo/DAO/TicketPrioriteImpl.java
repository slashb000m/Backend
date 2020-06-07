package com.example.demo.DAO;

import java.util.Date;

public class TicketPrioriteImpl {
	
	private String nom_produit;
	private String priorite;
	private Date date_creation;
	private String nom_ticket;
	private int numero_sprint; 
	private String nom_epic; 
	private String nom_version; 
	
	
	
    //Getters and Setters 
	
	
	public String getNom_version() {
		return nom_version;
	}
	public void setNom_version(String nom_version) {
		this.nom_version = nom_version;
	}
	public int getNumero_sprint() {
		return numero_sprint;
	}
	public void setNumero_sprint(int numero_sprint) {
		this.numero_sprint = numero_sprint;
	}
	public String getNom_epic() {
		return nom_epic;
	}
	public void setNom_epic(String nom_epic) {
		this.nom_epic = nom_epic;
	}
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
