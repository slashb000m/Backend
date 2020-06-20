package com.example.demo.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigModuleImpl {
	
	

	@JsonProperty("config_id")
	private int id_config; 
	
	@JsonProperty("nom_module")
	private String Config_module;

	public int getId_config() {
		return id_config;
	}

	public void setId_config(int id_config) {
		this.id_config = id_config;
	}

	public String getConfig_module() {
		return Config_module;
	}

	public void setConfig_module(String config_module) {
		Config_module = config_module;
	}
	
	
	
	

}
