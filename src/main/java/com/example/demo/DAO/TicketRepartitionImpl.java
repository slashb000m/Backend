package com.example.demo.DAO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties
public class TicketRepartitionImpl implements TicketRepartition{
    public String statut;
	public Date date_creation;
    public String first_name;
    public String last_name;
    public String nom_produit;
    public String nom_version;
    public String nom_ticket;
    public String nom_client;
    public int numero_sprint;
    public String nom_epic;
    public String titre;
    
    
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
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
	public String getNom_client() {
		return nom_client;
	}
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	public String getNom_ticket() {
		return nom_ticket;
	}
	public void setNom_ticket(String nom_ticket) {
		this.nom_ticket = nom_ticket;
	}

	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
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
    
    //Getters and setters 
    
    

   
    
    


}

