package com.example.demo.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigIntImpl implements ConfigInt  {
	
	@JsonProperty("config_id")
	private int id_config; 
	
	@JsonProperty("numero_sprint")
	private int Config;
	
	
	public int getId_config() {
		return id_config;
	}
	public void setId_config(int id_config) {
		this.id_config = id_config;
	}
	public int getConfig() {
		return Config;
	}
	public void setConfig(int config) {
		Config = config;
	}


}
