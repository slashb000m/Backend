package com.example.demo.DAO;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize
public interface DashboardId {
	public void setId(int id);
	public int getId() ;
}
