package com.example.demo.service;
import java.util.List;

import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketRepartitionImpl;





public interface TicketService  {
	
  public List<TicketRepartition> ShowticketsByRepartition();
  public List<TicketRepartition> FindTicketProportionClosedReturned();
  
	
}
