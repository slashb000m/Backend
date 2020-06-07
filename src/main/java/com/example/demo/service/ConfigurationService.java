package com.example.demo.service;

import com.example.demo.DAO.ConfigDate;
import com.example.demo.DAO.ConfigDateFinImpl;
import com.example.demo.DAO.ConfigDateImpl;
import com.example.demo.DAO.ConfigEpicImpl;
import com.example.demo.DAO.ConfigInt;
import com.example.demo.DAO.ConfigIntImpl;
import com.example.demo.DAO.ConfigStatutImpl;
import com.example.demo.DAO.ConfigString;
import com.example.demo.DAO.ConfigStringImpl;
import com.example.demo.DAO.ConfigVersionImpl;
import com.example.demo.DAO.Configuration;


public interface ConfigurationService {
	
	
	public void saveOrUpdateNomCollab(ConfigStringImpl nom);
	public void saveOrUpdateVersion(ConfigVersionImpl version);
	public void saveOrUpdateStatut(ConfigStatutImpl statut);
	public void saveOrUpdateEpic(ConfigEpicImpl epic);
	public void saveOrUpdateSprint(ConfigIntImpl sprint);
	public void saveOrUpdateDateDeb(ConfigDateImpl datedeb);
	public void saveOrUpdateDateFin(ConfigDateFinImpl datefin);
	
	


	

	

}
