package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService 
{
	
	@Autowired
	TicketRepository ticketRepository;
	
	@Override
	public List<TicketRepartition> ShowticketsByRepartition()
	 {
		 return    ticketRepository.FindTicketByConfig();
	 }
	
	 public List<TicketRepartition> FindTicketProportionClosedReturned()
	 {	 
		 return ticketRepository.FindTicketClosedAndReturned(); 
	 }
	
	

}
