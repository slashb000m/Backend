package com.example.demo.service;
import java.util.List;

import com.example.demo.DAO.TicketPriorite;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketResolutionTime;





public interface TicketService  {
	
  public List<TicketRepartition> ShowTicketsByRepartition();
  public List<TicketRepartition> FindTicketProportionClosedReturned();
  public List<TicketResolutionTime> FindTicketByLogs();
  public List<TicketPriorite> FindTicketByVersion();
  
	
}
