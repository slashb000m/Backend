package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="statut")
public class Statut {
	
	@Id
    @GeneratedValue
	@Column(name="statut_id")
	private int id;
	
	@Column(name="descrption")
	private String desc; 
	
	
	


}
