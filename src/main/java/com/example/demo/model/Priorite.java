package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="priorite")
public class Priorite {
	
	@Id
    @GeneratedValue
	@Column(name="priorite_id")
	private int id;
	
	@Column(name="descrption")
	private String desc; 
	
	
	


}
