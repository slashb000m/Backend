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

import lombok.Data;
@Data
@Entity
@Table(name="sous_ticket")
public class SousTicket {
	
	@Id
    @GeneratedValue
	@Column(name="sousTicket_id")
	private int id;
	
	@Column(name="nom")
	private String nom; 
	
	@Column(name="Description")
	private String desc; 
	
	@ManyToOne
	private Ticket ticketSource;
	
	
	
	
	
	

}
