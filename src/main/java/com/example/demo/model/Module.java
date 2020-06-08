package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="module")
public class Module {
	
	
	@Id
    @GeneratedValue
	@Column(name="module_id")
	private int id;
	
	@Column(name="nom")
	private String desc; 
	
	
	

}
