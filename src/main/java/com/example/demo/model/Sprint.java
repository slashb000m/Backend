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
@Table(name="sprint")
public class Sprint {
	
	@Id
	@GeneratedValue
	@Column(name="sprint_id")
	private int id;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="description")
	private String desc;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date date_debut;

	@Column
	@Temporal(TemporalType.DATE)
	private Date date_fin;

}
