package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {
	
	@Id 
	@GeneratedValue
	@Column(name = "produit_id")
	private int id;
	
	@Column(name = "nom")
	private String nom;
	
	@OneToMany(mappedBy="produit")
    private List<User> equipe;
	
	@OneToMany(mappedBy="produit")
    private List<Version> versions;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<User> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<User> equipe) {
		this.equipe = equipe;
	}

}
