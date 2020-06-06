package com.example.demo.DAO;

import java.util.Date;

public class ConfigurationImpl implements Configuration {


private int id;
private String config_collaborateur;
private String config_version; 
private String config_epic; 
private int config_sprint; 
private String config_statut; 
private Date date_deb;
private Date date_fin;
private int config_int;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getConfig_collaborateur() {
	return config_collaborateur;
}
public void setConfig_collaborateur(String config_collaborateur) {
	this.config_collaborateur = config_collaborateur;
}
public String getConfig_version() {
	return config_version;
}
public void setConfig_version(String config_version) {
	this.config_version = config_version;
}
public String getConfig_epic() {
	return config_epic;
}
public void setConfig_epic(String config_epic) {
	this.config_epic = config_epic;
}
public int getConfig_sprint() {
	return config_sprint;
}
public void setConfig_sprint(int config_sprint) {
	this.config_sprint = config_sprint;
}
public String getConfig_statut() {
	return config_statut;
}
public void setConfig_statut(String config_statut) {
	this.config_statut = config_statut;
}
public Date getDate_deb() {
	return date_deb;
}
public void setDate_deb(Date date_deb) {
	this.date_deb = date_deb;
}
public Date getDate_fin() {
	return date_fin;
}
public void setDate_fin(Date date_fin) {
	this.date_fin = date_fin;
}
public int getConfig_int() {
	return config_int;
}
public void setConfig_int(int config_int) {
	this.config_int = config_int;
} 


}
