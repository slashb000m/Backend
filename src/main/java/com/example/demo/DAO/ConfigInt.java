package com.example.demo.DAO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public interface ConfigInt {
	
	public void setId_config(int id_config);
	public void setConfig(int config); 
	public int getConfig();
	public int getId_config();
	
	
	

}
