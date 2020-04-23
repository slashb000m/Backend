package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Data
@Entity
@Table(name="epic")
public class Epic {
	
	@Id
    @GeneratedValue
	@Column(name="epic_id")
	private int id;
	
	@Column(name="nom")
	private String nom; 
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date date_creation;
	
	
	

}
