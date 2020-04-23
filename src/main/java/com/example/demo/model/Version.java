package com.example.demo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="version")
public class Version {
	@Id 
	@GeneratedValue
	@Column(name = "version_id")
	private int id;
	
	@Column(name = "nom_version")
	private String version;
	
	@ManyToOne
    private Produit produit;

}
