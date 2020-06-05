package com.example.demo.DAO;

import java.util.Date;

public class ConfigDateImpl implements ConfigDate {
	
	private int id_config; 
	private Date Config;
	
	
	public int getId_config() {
		return id_config;
	}
	public void setId_config(int id_config) {
		this.id_config = id_config;
	}
	public Date getConfig() {
		return Config;
	}
	public void setConfig(Date config) {
		Config = config;
	}
	

}
