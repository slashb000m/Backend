package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="configuration")
public class Configuration {
	
	@Id
    @GeneratedValue
	@Column(name="config_id")
	private int id;
	
	@Column(name="config_collaborateur")
	private String config_collaborateur;
	
	@Column(name="config_version")
	private String config_version; 
	
	@Column(name="config_epic")
	private String config_epic; 
	
	@Column(name="config_sprint")
	private int config_sprint; 
	
	@Column(name="config_statut")
	private String config_statut; 
	
	@Column(name="config_module")
	private String config_module; 
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date date_deb;

	@Column
	@Temporal(TemporalType.DATE)
	private Date date_fin;
	
	@Column(name = "config_int")
	private int config_int; 
	

}

