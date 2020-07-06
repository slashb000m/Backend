package com.example.demo.service;

import com.example.demo.DAO.ConfigDate;
import com.example.demo.DAO.ConfigDateFinImpl;
import com.example.demo.DAO.ConfigDateImpl;
import com.example.demo.DAO.ConfigEpicImpl;
import com.example.demo.DAO.ConfigInt;
import com.example.demo.DAO.ConfigIntImpl;
import com.example.demo.DAO.ConfigModuleImpl;
import com.example.demo.DAO.ConfigStatutImpl;
import com.example.demo.DAO.ConfigString;
import com.example.demo.DAO.ConfigStringImpl;
import com.example.demo.DAO.ConfigVersionImpl;
import com.example.demo.DAO.Configuration;
import com.example.demo.DAO.DashboardIdImpl;
import com.example.demo.DAO.DashboardNomImpl;
import com.example.demo.DAO.getDashboardImpl;


public interface ConfigurationService {
	
	
	public void saveOrUpdateNomCollab(ConfigStringImpl nom);
	public void saveOrUpdateVersion(ConfigVersionImpl version);
	public void saveOrUpdateStatut(ConfigStatutImpl statut);
	public void saveOrUpdateEpic(ConfigEpicImpl epic);
	public void saveOrUpdateModule(ConfigModuleImpl epic);
	public void saveOrUpdateSprint(ConfigIntImpl sprint);
	public void saveOrUpdateDateDeb(ConfigDateImpl datedeb);
	public void saveOrUpdateDateFin(ConfigDateFinImpl datefin);
	
	// delete dashboard 
	
	public void DeleteDashboard(DashboardIdImpl dashboard_id);
	public void DeleteRapports(DashboardIdImpl dashboard_id);
	

	// create dashboard 
	
	public void createDashboard(DashboardNomImpl nom_dashboard);
	public void createRapport1(DashboardNomImpl nom_dashboard);
	public void createRapport2(DashboardNomImpl nom_dashboard);
	public void createRapport3(DashboardNomImpl nom_dashboard);
	public void createRapport4(DashboardNomImpl nom_dashboard);
	
	
	// delete dashboard 
	
	public void ConsultDashboard(DashboardIdImpl dashboard_id);
	
	
	
	


	

	

}
