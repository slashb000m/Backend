package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="log")
public class Log {
	
	@Id
    @GeneratedValue
	@Column(name="log_id")
	private int id;
	
	@Column(name="nom")
	private String nom; 
	
	@Column(name="temps")
	private int minutes_passes ;
	
	@ManyToOne
	private SousTicket SousTicket; 
	
	@ManyToOne
	private Ticket Ticket; 
	
	
	
	

}