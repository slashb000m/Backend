package com.example.demo.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigEpicImpl implements ConfigEpic 
{

	@JsonProperty("config_id")
	private int id_config; 
	@JsonProperty("nom_epic")
	private String Config;
	
	
	public int getId_config() {
		return id_config;
	}
	public void setId_config(int id_config) {
		this.id_config = id_config;
	}
	public String getConfig() {
		return Config;
	}
	public void setConfig(String config) {
		Config = config;
	}
}
