package com.example.demo.DAO;

import java.util.Date;

public class TicketResolutionTimeImpl implements TicketResolutionTime {
	
	private Date date_maj;
	private int complexite;
	private String first_name;
	private String last_name;
	private int temps_de_resolution;
	private Date date_creation;
	
	//Getters and Setters
	public Date getDate_maj() {
		return date_maj;
	}
	public void setDate_maj(Date date_maj) {
		this.date_maj = date_maj;
	}
	public int getComplexite() {
		return complexite;
	}
	public void setComplexite(int complexite) {
		this.complexite = complexite;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getTemps_de_resolution() {
		return temps_de_resolution;
	}
	public void setTemps_de_resolution(int temps_de_resolution) {
		this.temps_de_resolution = temps_de_resolution;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	
	
	

}
