package com.example.demo.DAO;

public class GroupByTicketPrioriteImpl implements GroupByTicketPriorite{
	private String priorite;
	private int nb_de_ticket;
	
	public String getPriorite() {
		return priorite;
	}
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	public int getNb_de_ticket() {
		return nb_de_ticket;
	}
	public void setNb_de_ticket(int nb_de_ticket) {
		this.nb_de_ticket = nb_de_ticket;
	}
	

}
