package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.GroupByProportionClosedReturned;
import com.example.demo.DAO.GroupByTicketPriorite;
import com.example.demo.DAO.GroupByTicketRepartition;
import com.example.demo.DAO.GroupByTicketResolution;
import com.example.demo.DAO.TicketPriorite;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketResolutionTime;
import com.example.demo.service.TicketService;
import com.example.demo.service.UserService;

@RestController
public class KpiController {
	
	@Autowired
	TicketService ticketService;
	

	
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/productivite/closed-tickets" }, method = RequestMethod.GET)
	public List<TicketRepartition> Get_Tickets_Closed()
	{
		return ticketService.ShowTicketsByRepartition();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/productivite/proportion-returned-validated-tickets" }, method = RequestMethod.GET)
	public List<TicketRepartition> Get_Tickets_Returned_And_Validated()
	{
		return ticketService.FindTicketProportionClosedReturned();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/efficacite/temps_moyen_resolution_ticket" }, method = RequestMethod.GET)
	public List<TicketResolutionTime> Get_Tickets_With_Time_Spent()
	{
		return ticketService.FindTicketByLogs();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/produit/priorite_tickets_par_version" }, method = RequestMethod.GET)
	public List<TicketPriorite> Get_Tickets_With_Priority_And_Version()
	{
		return ticketService.FindTicketByVersion();
		
	}
	
	// GroupBy Controllers 
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/productivite/closed-tickets/group-by-number-of-tickets" }, method = RequestMethod.GET)
	public List<GroupByTicketRepartition> Get_Group_By_Tickets()
	{
		return ticketService.CountNumberOfTicketsByCollaborateurs();		
	}
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/productivite/group-by-proportion-returned-validated-tickets" }, method = RequestMethod.GET)
	public List<GroupByProportionClosedReturned> Get_Group_By_Closed_Returned()
	{
		return ticketService.ContNumberOfClosedReturned();		
	}
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/efficacite/group-by-temps_moyen_resolution_ticket"}, method = RequestMethod.GET)
	public List<GroupByTicketResolution> Get_Group_By_Resolution_Time()
	{
		return ticketService.ContNumberOfResolutionTime();		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/produit/group-by-priorite_tickets_par_version" }, method = RequestMethod.GET)
	public List<GroupByTicketPriorite> Get_Group_By_Priorite()
	{
		return ticketService.ContNumberOfPriorite();		
	}
	
	
	//Post config
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configNom/Kpi" }, method = RequestMethod.POST)
	public List<GroupByTicketPriorite> ConfigNomCollab()
	{
		return ticketService.ContNumberOfPriorite();		
	}
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configStatut/Kpi" }, method = RequestMethod.POST)
	public List<GroupByTicketPriorite> ConfigStatut()
	{
		return ticketService.ContNumberOfPriorite();		
	}
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configVersion/Kpi" }, method = RequestMethod.POST)
	public List<GroupByTicketPriorite> ConfigVersion()
	{
		return ticketService.ContNumberOfPriorite();		
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configSprint/Kpi" }, method = RequestMethod.POST)
	public List<GroupByTicketPriorite> ConfigSprint()
	{
		return ticketService.ContNumberOfPriorite();		
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configEpic/Kpi" }, method = RequestMethod.POST)
	public List<GroupByTicketPriorite> ConfigEpic()
	{
		return ticketService.ContNumberOfPriorite();		
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configDateDeb/Kpi" }, method = RequestMethod.POST)
	public List<GroupByTicketPriorite> ConfigDateDeb()
	{
		return ticketService.ContNumberOfPriorite();		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configDateFin/Kpi" }, method = RequestMethod.POST)
	public List<GroupByTicketPriorite> ConfigDateFin()
	{
		return ticketService.ContNumberOfPriorite();		
	}
	
	
	
	

	


	

}
