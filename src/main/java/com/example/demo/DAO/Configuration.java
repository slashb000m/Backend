package com.example.demo.DAO;

import java.util.Date;

public interface Configuration 
{
	String getConfig_collaborateur();
	String getConfig_version();
	String getConfig_epic();
	int getConfig_sprint();
	String getConfig_statut();
	Date getDate_deb(); 
	Date getDate_fin();
	int getConfig_int();
}
