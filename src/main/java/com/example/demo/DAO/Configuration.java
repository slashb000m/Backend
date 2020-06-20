package com.example.demo.DAO;

import java.util.Date;

public interface Configuration 
{
	String getNom_collab();
	String getVersion();
	String getEpic();
	int getSprint();
	String getStatut();
	Date getDate_deb(); 
	Date getDate_fin(); 
	String getNom_module();
}
