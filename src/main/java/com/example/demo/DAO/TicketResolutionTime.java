package com.example.demo.DAO;

import java.util.Date;

public interface TicketResolutionTime {
	Date getDate_maj();
	int getComplexite();
	String getFirst_name();
	String getLast_name() ;
	double getTemps_de_resolution();
	Date getDate_creation();
	String getNom_ticket();
	String getNom_log() ;
	String getNom_epic();
	String getNom_version();
	int getNumero_sprint();
	String getNom_module();
	
}
