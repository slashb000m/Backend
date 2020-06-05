package com.example.demo.repository;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.DAO.ConfigString;
import com.example.demo.DAO.TicketRepartition;
import com.example.demo.model.Configuration;


@Repository
public interface ConfigRepository extends JpaRepository<Configuration, Integer>
{
	
	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_collaborateur= :config WHERE config_id= :id"
			, nativeQuery = true)
	public void saveNomCollab(@Param("id") Integer id_config,@Param("config") String nom_collab);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_version= :config WHERE config_id= :id"
			, nativeQuery = true)
	public void saveVersion(@Param("id") Integer id_config,@Param("config") String nom_version);


	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_statut= :config WHERE config_id= :id"
			, nativeQuery = true)
	public void saveStatut(@Param("id") Integer id_config,@Param("config") String nom_statut);






}
