package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.TicketRepartition;
import com.example.demo.service.TicketService;
import com.example.demo.service.UserService;

@RestController
public class KpiController {
	
	@Autowired
	TicketService ticketService;
	
	@RequestMapping(value = { "/kpi/productivite/closed-tickets" }, method = RequestMethod.GET)
	public List<TicketRepartition> Get_Tickets_Closed()
	{
		return ticketService.ShowticketsByRepartition();
		
	}
	
	@RequestMapping(value = { "/kpi/productivite/proportion-returned-validated-tickets" }, method = RequestMethod.GET)
	public List<TicketRepartition> Get_Tickets_Returned_And_Validated()
	{
		return ticketService.FindTicketProportionClosedReturned();
		
	}
	


	

}
