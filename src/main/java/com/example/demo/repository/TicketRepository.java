package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.TicketRepartition;
import com.example.demo.DAO.TicketRepartitionImpl;
import com.example.demo.model.Ticket;



@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	
	@Query(value="SELECT ticket.statut_statut_id as id_statut,ticket.date_creation as date_creation,auth_user.first_name as first_name ,auth_user.last_name as last_name,produit.nom_produit as nom_produit,version.nom_version as nom_version "
			+ "FROM auth_user join produit ON auth_user.produit_produit_id = produit.produit_id "
			+ "join version ON produit.produit_id = version.produit_produit_id "
			+ "join ticket ON version.version_id = ticket.version_source_version_id "
			+ "where produit.nom_produit='GP3' AND ticket.date_creation >= 10/10/2010 AND ticket.statut_statut_id=1", nativeQuery = true)
	List<TicketRepartition> FindTicketByConfig();
	
	
	@Query(value="SELECT ticket.statut_statut_id as id_statut, ticket.date_creation as date_creation,auth_user.first_name as first_name ,auth_user.last_name as last_name,produit.nom_produit as nom_produit,version.nom_version as nom_version"
			+ " FROM auth_user join produit ON auth_user.produit_produit_id = produit.produit_id "
			+ "join version ON produit.produit_id = version.produit_produit_id "
			+ "join ticket ON version.version_id = ticket.version_source_version_id"
			+ " where produit.nom_produit='GP3' AND ticket.date_creation >= 10/10/2010 AND ticket.statut_statut_id=1 OR ticket.statut_statut_id=2", nativeQuery = true)
	List<TicketRepartition> FindTicketClosedAndReturned();
	
	@Query(value="SELECT ticket.date_maj as date_maj, ticket.complexite as complexite,auth_user.first_name as first_name ,auth_user.last_name as last_name,log.temps as temps_de_resolution,ticket.date_creation as date_creation FROM ticket join auth_user ON auth_user.auth_user_id = ticket.assigne_a_auth_user_id join log ON log.ticket_ticket_id = ticket.ticket_id where ticket.date_creation >= 10/10/2010 AND ticket.statut_statut_id=1", nativeQuery = true)
	List<TicketRepartition> FinfTicketByLogs();
	
	

}
