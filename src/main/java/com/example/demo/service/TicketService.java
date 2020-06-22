package com.example.demo.service;
import java.util.List;

import com.example.demo.DAO.Configuration;
import com.example.demo.DAO.GroupByProportionClosedReturned;
import com.example.demo.DAO.GroupByTicketPriorite;
import com.example.demo.DAO.GroupByTicketRepartition;
import com.example.demo.DAO.GroupByTicketResolution;
import com.example.demo.DAO.TicketClosedReturned;
import com.example.demo.DAO.TicketPriorite;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketResolutionTime;
import com.example.demo.DAO.getConfigChamps;
import com.example.demo.DAO.getConfigEpic;
import com.example.demo.DAO.getConfigModule;
import com.example.demo.DAO.getConfigStatut;
import com.example.demo.DAO.getConfigVersion;
import com.example.demo.DAO.getDashboard;





public interface TicketService  {
	
  public List<TicketRepartition> ShowTicketsByRepartition();
  public List<TicketClosedReturned> FindTicketProportionClosedReturned();
  public List<TicketResolutionTime> FindTicketByLogs();
  public List<TicketPriorite> FindTicketByVersion();
  
  /*group by */ 
  
  public List<GroupByTicketRepartition> CountNumberOfTicketsByCollaborateurs();
  public List<GroupByProportionClosedReturned> ContNumberOfClosedReturned();
	 public List<GroupByTicketResolution> ContNumberOfResolutionTime();
	 public List<GroupByTicketPriorite> ContNumberOfPriorite();
  
  // Get configuration state
	 
	 
	public Configuration getKpi1();
	public Configuration getKpi2();
	public Configuration getKpi3();
	public Configuration getKpi4();
	
	// Get Config champs 
	
	
	public List<getConfigChamps> getNom();
	public List<getConfigStatut>  getStatut();
	public List<getConfigModule>  getModule();
	public List<getConfigVersion>  getVersion();
	public List<getConfigEpic>  getEpic();
	
	// Get Dashboards
	
	public List<getDashboard> getDashboards();
	
	
	
	
	
  
	
}
