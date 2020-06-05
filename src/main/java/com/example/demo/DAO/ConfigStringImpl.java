package com.example.demo.DAO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConfigStringImpl implements ConfigString
{
	@JsonProperty("config_id")
	private int id_config; 
	@JsonProperty("nom_collab")
	private String Config;
	
	public ConfigStringImpl()
	{}
	
	
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
