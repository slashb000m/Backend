package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TicketRepartition;
import com.example.demo.service.TicketService;
import com.example.demo.service.UserService;

@RestController
public class KpiController {
	
	@Autowired
	TicketService ticketService;
	
	@RequestMapping(value = { "/kpi-Productivite-tickets" }, method = RequestMethod.GET)
	public List<TicketRepartition> Get_Tickets()
	{
		return ticketService.ShowticketsByRepartition();
		
	}

	
	

}
