package com.example.demo.DAO;

public class GroupByTicketResolutionImpl implements GroupByTicketResolution{
	
	private String last_name; 
	private int nb_de_ticket;
	
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getNb_de_ticket() {
		return nb_de_ticket;
	}
	public void setNb_de_ticket(int nb_de_ticket) {
		this.nb_de_ticket = nb_de_ticket;
	}

}
