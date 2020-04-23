package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Ticket;
import com.example.demo.model.TicketRepartition;


@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
	
	@Query(value="SELECT ticket.date_creation as date_creation,auth_user.first_name as first_name ,auth_user.last_name as last_name,produit.nom_produit as nom_produit,version.nom_version as nom_version FROM auth_user join produit ON auth_user.produit_produit_id = produit.produit_id join version ON produit.produit_id = version.produit_produit_id join ticket ON version.version_id = ticket.version_source_version_id where produit.nom_produit='GP3' AND ticket.date_creation >= 10/10/2010 AND ticket.statut_statut_id=3", nativeQuery = true)
	List<TicketRepartition> FindTicketByConfig();
}
