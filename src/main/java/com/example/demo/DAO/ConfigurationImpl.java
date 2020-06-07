package com.example.demo.DAO;

import java.util.Date;

public class ConfigurationImpl implements Configuration {



private String nom_collab;
private String version; 
private String epic; 
private int sprint; 
private String statut; 
private Date date_deb;
private Date date_fin;

public String getNom_collab() {
	return nom_collab;
}
public void setNom_collab(String nom_collab) {
	this.nom_collab = nom_collab;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public String getEpic() {
	return epic;
}
public void setEpic(String epic) {
	this.epic = epic;
}
public int getSprint() {
	return sprint;
}
public void setSprint(int sprint) {
	this.sprint = sprint;
}
public String getStatut() {
	return statut;
}
public void setStatut(String statut) {
	this.statut = statut;
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


}
