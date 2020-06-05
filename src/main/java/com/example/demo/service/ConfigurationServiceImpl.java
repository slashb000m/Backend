package com.example.demo.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.ConfigDate;
import com.example.demo.DAO.ConfigEpicImpl;
import com.example.demo.DAO.ConfigInt;
import com.example.demo.DAO.ConfigStatut;
import com.example.demo.DAO.ConfigStatutImpl;
import com.example.demo.DAO.ConfigString;
import com.example.demo.DAO.ConfigStringImpl;
import com.example.demo.DAO.ConfigVersionImpl;
import com.example.demo.repository.ConfigRepository;

@Service
public class ConfigurationServiceImpl implements ConfigurationService 
{
	
	
@Autowired 
ConfigRepository configRepository;



@Override
public void saveOrUpdateNomCollab(ConfigStringImpl config) {
	
	int id= config.getId_config();
	String nom= config.getConfig();
	
	
	configRepository.saveNomCollab(id,nom);
	
}

@Override
public void saveOrUpdateVersion(ConfigVersionImpl version){

	int id= version.getId_config();
	String nom= version.getConfig();
	
	
	configRepository.saveVersion(id,nom);
	
	
}



@Override
public void saveOrUpdateStatut(ConfigStatutImpl statut)
{

	int id= statut.getId_config();
	String nom= statut.getConfig();
	
	
	configRepository.saveStatut(id,nom);
	
}







}
