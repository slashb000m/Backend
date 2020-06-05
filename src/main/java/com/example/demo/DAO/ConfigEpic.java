package com.example.demo.DAO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public interface ConfigEpic {

	public void setId_config(int id_config);
	public void setConfig(String config);
	public int getId_config();
	public String getConfig();

}