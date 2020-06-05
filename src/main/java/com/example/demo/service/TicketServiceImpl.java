package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.GroupByProportionClosedReturned;
import com.example.demo.DAO.GroupByTicketPriorite;
import com.example.demo.DAO.GroupByTicketRepartition;
import com.example.demo.DAO.GroupByTicketResolution;
import com.example.demo.DAO.TicketPriorite;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketResolutionTime;
import com.example.demo.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService 
{
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public List<TicketRepartition> ShowTicketsByRepartition()
	 {
		 return  ticketRepository.FindTicketByConfig();
	 }
	
	 public List<TicketRepartition> FindTicketProportionClosedReturned()
	 {	 
		 return ticketRepository.FindTicketClosedAndReturned(); 

	 }
	 
	 public List<TicketResolutionTime> FindTicketByLogs()
	 {
		 return ticketRepository.FindTicketWithTime();
	 }
	 
	 public List<TicketPriorite> FindTicketByVersion()
	 {
		 return ticketRepository.FindTicketWithPriorite();
	 }
	 
	 
	 
	 /* group by 
	  * 
	  * 
	  */
	 
	 public List<GroupByTicketRepartition> CountNumberOfTicketsByCollaborateurs()
		{
			return ticketRepository.GroupByNumberOfTickets();
		}
	 
	 public List<GroupByProportionClosedReturned> ContNumberOfClosedReturned()
		{
			return ticketRepository.GroupByTicketRepartition();
		}
	 
	 public List<GroupByTicketResolution> ContNumberOfResolutionTime()
		{
			return ticketRepository.GroupByResolutionTime();
		}
	 
	 public List<GroupByTicketPriorite> ContNumberOfPriorite()
		{
			return ticketRepository.GroupByTicketPriority();
		}
	 
	 
	 
	 
	 
	
	

}
