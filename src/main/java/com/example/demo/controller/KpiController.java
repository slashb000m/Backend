package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.ConfigDateFinImpl;
import com.example.demo.DAO.ConfigDateImpl;
import com.example.demo.DAO.ConfigEpicImpl;
import com.example.demo.DAO.ConfigIntImpl;
import com.example.demo.DAO.ConfigModuleImpl;
import com.example.demo.DAO.ConfigStatutImpl;
import com.example.demo.DAO.ConfigString;
import com.example.demo.DAO.ConfigStringImpl;
import com.example.demo.DAO.ConfigVersionImpl;
import com.example.demo.DAO.DashboardId;
import com.example.demo.DAO.DashboardIdImpl;
import com.example.demo.DAO.GroupByProportionClosedReturned;
import com.example.demo.DAO.GroupByTicketPriorite;
import com.example.demo.DAO.GroupByTicketRepartition;
import com.example.demo.DAO.GroupByTicketResolution;
import com.example.demo.DAO.TicketClosedReturned;
import com.example.demo.DAO.TicketPriorite;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketResolutionTime;
import com.example.demo.DAO.getConfigChamps;
import com.example.demo.DAO.getDashboard;
import com.example.demo.model.Configuration;
import com.example.demo.service.ConfigurationService;
import com.example.demo.service.TicketService;
import com.example.demo.service.UserService;

@RestController
public class KpiController {
	
	@Autowired
	TicketService ticketService;
	
	@Autowired
	ConfigurationService configurationService;
	

	
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/productivite/closed-tickets" }, method = RequestMethod.GET)
	public List<TicketRepartition> Get_Tickets_Closed()
	{
		return ticketService.ShowTicketsByRepartition();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/kpi/productivite/proportion-returned-validated-tickets" }, method = RequestMethod.GET)
	public List<TicketClosedReturned> Get_Tickets_Returned_And_Validated()
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
	@RequestMapping(value = { "/configNom/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigNomCollab(@RequestBody ConfigStringImpl config)
	{
		configurationService.saveOrUpdateNomCollab(config);
	}
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configModule/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigModule(@RequestBody ConfigModuleImpl config)
	{
		configurationService.saveOrUpdateModule(config);
	}
	
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configVersion/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigVersion(@RequestBody ConfigVersionImpl config)
	{
		configurationService.saveOrUpdateVersion(config);
	}
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configStatut/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigStatut(@RequestBody ConfigStatutImpl config)
	{
		configurationService.saveOrUpdateStatut(config);		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configEpic/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigStatut(@RequestBody ConfigEpicImpl config)
	{
		configurationService.saveOrUpdateEpic(config);		
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configSprint/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigSprint(@RequestBody ConfigIntImpl config)
	{
		configurationService.saveOrUpdateSprint(config);		
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configDateDeb/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigSprint(@RequestBody ConfigDateImpl config)
	{
		configurationService.saveOrUpdateDateDeb(config);		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/configDateFin/Kpi" },consumes ="application/json", method = RequestMethod.POST)
	public void ConfigSprint(@RequestBody ConfigDateFinImpl config)
	{
		configurationService.saveOrUpdateDateFin(config);		
	}
	

	// Get config for forms 

	
	


	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/Config/kpi1" }, method = RequestMethod.GET)
	public com.example.demo.DAO.Configuration ConfigKPI1()
	{
		return ticketService.getKpi1();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/Config/kpi2" }, method = RequestMethod.GET)
	public  com.example.demo.DAO.Configuration  ConfigKPI2()
	{
		return ticketService.getKpi2();
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/Config/kpi3" }, method = RequestMethod.GET)
	public  com.example.demo.DAO.Configuration  ConfigKPI3()
	{
		return ticketService.getKpi3();		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/Config/kpi4" }, method = RequestMethod.GET)
	public  com.example.demo.DAO.Configuration  ConfigKPI4()
	{
		return ticketService.getKpi4();
		
	}
	
	//Get config  
	
	
	
	

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/champsConfig/nom" }, method = RequestMethod.GET)
	public List<getConfigChamps> getConfigNom()
	{
		return ticketService.getNom();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/champsConfig/statut" }, method = RequestMethod.GET)
	public List<com.example.demo.DAO.getConfigStatut> getConfigStatut()
	{
		return ticketService.getStatut();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/champsConfig/module" }, method = RequestMethod.GET)
	public List<com.example.demo.DAO.getConfigModule> getConfigModule()
	{
		return ticketService.getModule();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/champsConfig/epic" }, method = RequestMethod.GET)
	public List<com.example.demo.DAO.getConfigEpic> getConfigEpic()
	{
		return ticketService.getEpic();
		
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/champsConfig/version" }, method = RequestMethod.GET)
	public List<com.example.demo.DAO.getConfigVersion> getConfigVersion()
	{
		return ticketService.getVersion();
		
	}
	
	//get dashboards
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/get/Dashboards" }, method = RequestMethod.GET)
	public List<getDashboard> GetDashboards()
	{
		
		return ticketService.getDashboards();
	}
	
	//delete Dashboard

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = { "/delete/dashboard" },consumes ="application/json", method = RequestMethod.POST)
	public void DeleteDashboard(@RequestBody DashboardIdImpl dashboard_id)
	{
		configurationService.DeleteDashboard(dashboard_id);		
	}
	

	



	


	

}
