package com.example.demo.DAO;

import java.util.Date;

public class TicketClosedReturnedImpl implements TicketClosedReturned 
{
	private String nom_epic;
	private int numero_sprint;
	private int id_statut;
    private Date date_creation;
    private String first_name;
    private String last_name;
    private String nom_produit;
    private String nom_version;
    
    
	public String getNom_epic() {
		return nom_epic;
	}
	public void setNom_epic(String nom_epic) {
		this.nom_epic = nom_epic;
	}
	public int getNumero_sprint() {
		return numero_sprint;
	}
	public void setNumero_sprint(int numero_sprint) {
		this.numero_sprint = numero_sprint;
	}
	public int getId_statut() {
		return id_statut;
	}
	public void setId_statut(int id_statut) {
		this.id_statut = id_statut;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getNom_produit() {
		return nom_produit;
	}
	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}
	public String getNom_version() {
		return nom_version;
	}
	public void setNom_version(String nom_version) {
		this.nom_version = nom_version;
	}
    
	


}
