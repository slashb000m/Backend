package com.example.demo.DAO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public interface ConfigModule {
	
	String getConfig_module();
	public int getId_config();
	public void setId_config(int id_config);
	public String setConfig_module() ;
	

}
