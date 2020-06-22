package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.Configuration;
import com.example.demo.DAO.GroupByProportionClosedReturned;
import com.example.demo.DAO.GroupByTicketPriorite;
import com.example.demo.DAO.GroupByTicketRepartition;
import com.example.demo.DAO.GroupByTicketResolution;
import com.example.demo.DAO.TicketClosedReturned;
import com.example.demo.DAO.TicketPriorite;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketRepartitionImpl;
import com.example.demo.DAO.TicketResolutionTime;
import com.example.demo.DAO.getConfigChamps;
import com.example.demo.DAO.getConfigEpic;
import com.example.demo.DAO.getConfigModule;
import com.example.demo.DAO.getConfigStatut;
import com.example.demo.DAO.getConfigVersion;
import com.example.demo.DAO.getDashboard;
import com.example.demo.model.Ticket;



@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	/* before the selection from the view, make the update for the where condition of the view creation, if doesnt work, use create or
	 * replace view and rewrite the view creation  */
	
	@Query(value="select * from ticket_collab where \r\n" + 
			" ( statut=(select configuration.config_statut from configuration where configuration.config_id=1) \r\n" + 
			"or(select configuration.config_statut from configuration where configuration.config_id=1)=\"peu importe\"  ) \r\n" + 
			"\r\n" + 
			"and (nom_module=(select configuration.config_module from configuration where configuration.config_id=1) \r\n" + 
			"or(select configuration.config_module from configuration where configuration.config_id=1)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and (nom_epic=(select configuration.config_epic from configuration where configuration.config_id=1) \r\n" + 
			"or(select configuration.config_epic from configuration where configuration.config_id=1)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and (nom_version=(select configuration.config_version from configuration where configuration.config_id=1) \r\n" + 
			"or(select configuration.config_version from configuration where configuration.config_id=1)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and (first_name=(select configuration.config_collaborateur from configuration where configuration.config_id=1) \r\n" + 
			"or(select configuration.config_collaborateur from configuration where configuration.config_id=1)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and numero_sprint>(select configuration.config_sprint from configuration where configuration.config_id=1) \r\n" + 
			"\r\n" + 
			"and date_creation>(select configuration.date_deb from configuration where configuration.config_id=1) \r\n" + 
			"\r\n" + 
			"and date_creation<(select configuration.date_fin from configuration where configuration.config_id=1) "
			, nativeQuery = true)
	List<TicketRepartition> FindTicketByConfig();
	

	@Query(value="select * from proportion_closed_returned_view \r\n" + 
			"where \r\n" + 
			" ( first_name=(select configuration.config_collaborateur from configuration where configuration.config_id=2) \r\n" + 
			"or(select configuration.config_collaborateur from configuration where configuration.config_id=2)=\"peu importe\"  ) \r\n" + 
			"\r\n" + 
			"and (nom_module=(select configuration.config_module from configuration where configuration.config_id=2) \r\n" + 
			"or(select configuration.config_module from configuration where configuration.config_id=2)=\"peu importe\" )\r\n" + 
			"\r\n" +
			"and (nom_epic=(select configuration.config_epic from configuration where configuration.config_id=2) \r\n" + 
			"or(select configuration.config_epic from configuration where configuration.config_id=2)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and (nom_version=(select configuration.config_version from configuration where configuration.config_id=2) \r\n" + 
			"or(select configuration.config_version from configuration where configuration.config_id=2)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and numero_sprint>(select configuration.config_sprint from configuration where configuration.config_id=2) \r\n" + 
			"\r\n" + 
			"and date_creation>(select configuration.date_deb from configuration where configuration.config_id=2) \r\n" + 
			"\r\n" + 
			"and date_creation<(select configuration.date_fin from configuration where configuration.config_id=2) "
			, nativeQuery = true)
	List<TicketClosedReturned> FindTicketClosedAndReturned();
	
	
	@Query(value="SELECT * from resolution_time_ticket_view\r\n" + 
			"where \r\n" + 
			" ( first_name=(select configuration.config_collaborateur from configuration where configuration.config_id=3) \r\n" + 
			"or(select configuration.config_collaborateur from configuration where configuration.config_id=3)=\"peu importe\"  ) \r\n" + 
			"\r\n" + 
			"and (nom_epic=(select configuration.config_epic from configuration where configuration.config_id=3) \r\n" + 
			"or(select configuration.config_epic from configuration where configuration.config_id=3)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and (nom_module=(select configuration.config_module from configuration where configuration.config_id=3) \r\n" + 
			"or(select configuration.config_module from configuration where configuration.config_id=3)=\"peu importe\" )\r\n" + 
			"\r\n" +
			"and (nom_version=(select configuration.config_version from configuration where configuration.config_id=3) \r\n" + 
			"or(select configuration.config_version from configuration where configuration.config_id=3)=\"peu importe\" )\r\n" + 
			"\r\n" + 
			"and numero_sprint>(select configuration.config_sprint from configuration where configuration.config_id=3) \r\n" + 
			"\r\n" + 
			"and date_creation>(select configuration.date_deb from configuration where configuration.config_id=3) \r\n" + 
			"\r\n" + 
			"and date_creation<(select configuration.date_fin from configuration where configuration.config_id=3) "
			, nativeQuery = true)
	List<TicketResolutionTime> FindTicketWithTime();
	
	
	@Query(value="select * from tickets_with_priority_view where (nom_epic=(select configuration.config_epic from configuration where configuration.config_id=4) or(select configuration.config_epic from configuration where configuration.config_id=4)=\"peu importe\" ) and (nom_version=(select configuration.config_version from configuration where configuration.config_id=4) or(select configuration.config_version from configuration where configuration.config_id=4)=\"peu importe\" ) and (nom_module=(select configuration.config_module from configuration where configuration.config_id=4) or(select configuration.config_module from configuration where configuration.config_id=4)=\"peu importe\" ) and numero_sprint>(select configuration.config_sprint from configuration where configuration.config_id=4) and date_creation>(select configuration.date_deb from configuration where configuration.config_id=4) and date_creation<(select configuration.date_fin from configuration where configuration.config_id=4)"
			, nativeQuery = true)
	List<TicketPriorite> FindTicketWithPriorite();
	
	
	/*Group By 
	 * 
	 * 
	 * 
	 */
	
	
	
	@Query(value="SELECT last_name, COUNT(*) as nb_de_ticket"
			+ " FROM tickets_par_collaborateur_view "
			+ "GROUP BY last_name"
			, nativeQuery = true)
	List<GroupByTicketRepartition> GroupByNumberOfTickets();
	
	@Query(value="SELECT last_name,id_statut,COUNT(*) as nb_de_ticket FROM test_3 GROUP BY id_statut"
			, nativeQuery = true)
	List<GroupByProportionClosedReturned> GroupByTicketRepartition();
	
	@Query(value="SELECT nom_ticket as last_name, SUM(temps_de_resolution) AS nb_de_ticket FROM test_2 GROUP BY nom_ticket"
			, nativeQuery = true)
	List<GroupByTicketResolution> GroupByResolutionTime();
	
	@Query(value="SELECT priorite, COUNT(*) as nb_de_ticket"
			+ " FROM test_1 "
			+ "GROUP BY priorite"
			, nativeQuery = true)
	List<GroupByTicketPriorite> GroupByTicketPriority();
	
	// Get configuration 
	
	
	@Query(value="SELECT configuration.config_module as nom_module, configuration.config_collaborateur as nom_collab,configuration.config_epic as epic,configuration.config_sprint as sprint,configuration.config_statut statut,configuration.config_version as version,configuration.date_deb as date_deb,configuration.date_fin as date_fin from configuration "
			+ "where configuration.config_id = 1"
			, nativeQuery = true)
	Configuration GetKpi1();
	
	@Query(value="SELECT configuration.config_module as nom_module, configuration.config_collaborateur as nom_collab,configuration.config_epic as epic,configuration.config_sprint as sprint,configuration.config_statut statut,configuration.config_version as version,configuration.date_deb as date_deb,configuration.date_fin as date_fin from configuration "
			+ "where configuration.config_id = 2"
			, nativeQuery = true)
	Configuration GetKpi2();
	
	@Query(value="SELECT configuration.config_module as nom_module, configuration.config_collaborateur as nom_collab,configuration.config_epic as epic,configuration.config_sprint as sprint,configuration.config_statut statut,configuration.config_version as version,configuration.date_deb as date_deb,configuration.date_fin as date_fin from configuration "
			+ "where configuration.config_id = 3"
			, nativeQuery = true)
	Configuration GetKpi3();
	
	@Query(value="SELECT configuration.config_module as nom_module, configuration.config_collaborateur as nom_collab,configuration.config_epic as epic,configuration.config_sprint as sprint,configuration.config_statut statut,configuration.config_version as version,configuration.date_deb as date_deb,configuration.date_fin as date_fin from configuration "
			+ "where configuration.config_id = 4"
			, nativeQuery = true)
	Configuration GetKpi4();
	
	// get champs for config
	
	@Query(value="select descrption from statut"
			, nativeQuery = true)
	List<getConfigStatut>  GetStatut();
	
	@Query(value=" select first_name from auth_user"
			, nativeQuery = true)
	List<getConfigChamps>  GetNom();
	
	@Query(value="select nom from epic"
			, nativeQuery = true)
	List<getConfigEpic>  GetEpic();
	
	@Query(value="Select nom_version from version"
			, nativeQuery = true)
	List<getConfigVersion>  GetVersion();
	
	@Query(value="select nom from module"
			, nativeQuery = true)
	List<getConfigModule>  GetModule();
	
	@Query(value="SELECT * from `dashboard` "
			, nativeQuery = true)
	List <getDashboard> GetDashboards();
	

	

	
	
	
	
	
	
	
	
	
	

}
