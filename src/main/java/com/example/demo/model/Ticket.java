package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Data
@Entity
@Table(name="ticket")
public class Ticket {
	
	
    @Id
    @GeneratedValue
	@Column(name = "ticket_id ")
	private int ticket_id; 
	
	@Column(name = "nom")
	private String nom; 
	
	@Column(name = "titre")
	private String titre; 
	
	
	@Column(name = "type")
	private String type; 
	
	@Column(name = "complexite")
	private int complexite; 

	@Column
	@Temporal(TemporalType.DATE)
	private Date date_creation;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date date_maj;
	
	@ManyToOne
	private Version versionSource;
	
	@ManyToOne
	private Version versionCible;
	
	@ManyToOne
	private User assigne_A; 
	
	@ManyToOne
	private User cree_par; 
	
	@ManyToOne
	private Statut statut; 
	
	@ManyToOne
	private Client client; 

	
	@ManyToOne
	private Priorite priorite; 
	
	@ManyToOne 
	private Epic epic;
	
	
	@ManyToMany 
	private List<Sprint> sprints;

		

		

	
	
	
	
	
	
	
	 
	 
	


}
	