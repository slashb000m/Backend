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
@Table(name="configuration")
public class Configuration {
	
	@Id
    @GeneratedValue
	@Column(name="config_id")
	private int id;
	
	@Column(name="config_string1")
	private String config_string1; 
	
	@Column(name="config_string2")
	private String config_string2; 

	@Column
	@Temporal(TemporalType.DATE)
	private Date date_deb;

	@Column
	@Temporal(TemporalType.DATE)
	private Date date_fin;
	
	@Column(name = "config_int")
	private int config_int; 
	

}
