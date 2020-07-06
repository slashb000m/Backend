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
	@Query(value="UPDATE configuration SET config_collaborateur= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveNomCollab(@Param("id") Integer id_config,@Param("config") String nom_collab);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_version= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveVersion(@Param("id") Integer id_config,@Param("config") String nom_version);


	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_statut= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveStatut(@Param("id") Integer id_config,@Param("config") String nom_statut);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_epic= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveEpic(@Param("id") Integer id_config,@Param("config") String nom_epic);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_sprint= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveSprint(@Param("id") Integer id_config,@Param("config") int numero_sprint);
	

	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET date_deb= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveDateDeb(@Param("id") Integer id_config,@Param("config") Date date_deb);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET date_fin= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveDateFin(@Param("id") Integer id_config,@Param("config") Date date_fin);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE configuration SET config_module= :config WHERE (config_id= :id and dashboard_id= (select id_dashboard from actual_config) )"
			, nativeQuery = true)
	public void saveModule(@Param("id") Integer id_config,@Param("config") String nom_module);
	
	
	//delete dashboard
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM dashboard WHERE id= :id"
			, nativeQuery = true)
	public void deleteDashboard(@Param("id") Integer dashboard_id);
	
	@Modifying
	@Transactional
	@Query(value="delete from configuration where dashboard_id= :id"
			, nativeQuery = true)
	public void deleteRapportConfig(@Param("id") Integer dashboard_id);
	

	//Create dashboard
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO `dashboard` (`id`, `nom_dashboard`) VALUES (NULL,:nom);"
			, nativeQuery = true)
	public void createDashboard(@Param("nom") String nom_dashboard);
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO `configuration` (`config_collaborateur`, `config_epic`, `config_int`, `config_sprint`, `config_statut`, `config_version`, `date_deb`, `date_fin`, `config_module`, `id`, `config_id`, `dashboard_id`) VALUES ('peu importe', 'peu importe', '1', '1', 'peu importe', 'peu importe', '2016-08-08', '2020-06-27', 'peu importe', NULL, '1', (select id from dashboard where dashboard.nom_dashboard=:nom ))"
			, nativeQuery = true)
	public void createDashboardRapport1(@Param("nom") String nom_dashboard);
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO `configuration` (`config_collaborateur`, `config_epic`, `config_int`, `config_sprint`, `config_statut`, `config_version`, `date_deb`, `date_fin`, `config_module`, `id`, `config_id`, `dashboard_id`) VALUES ('peu importe', 'peu importe', '1', '1', 'peu importe', 'peu importe', '2016-08-08', '2020-06-27', 'peu importe', NULL, '2', (select id from dashboard where dashboard.nom_dashboard=:nom ))"
			, nativeQuery = true)
	public void createDashboardRapport2(@Param("nom") String nom_dashboard);
	

	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO `configuration` (`config_collaborateur`, `config_epic`, `config_int`, `config_sprint`, `config_statut`, `config_version`, `date_deb`, `date_fin`, `config_module`, `id`, `config_id`, `dashboard_id`) VALUES ('peu importe', 'peu importe', '1', '1', 'peu importe', 'peu importe', '2016-08-08', '2020-06-27', 'peu importe', NULL, '3', (select id from dashboard where dashboard.nom_dashboard=:nom ))"
			, nativeQuery = true)
	public void createDashboardRapport3(@Param("nom") String nom_dashboard);
	
	@Modifying
	@Transactional
	@Query(value="INSERT INTO `configuration` (`config_collaborateur`, `config_epic`, `config_int`, `config_sprint`, `config_statut`, `config_version`, `date_deb`, `date_fin`, `config_module`, `id`, `config_id`, `dashboard_id`) VALUES ('peu importe', 'peu importe', '1', '1', 'peu importe', 'peu importe', '2016-08-08', '2020-06-27', 'peu importe', NULL, '4', (select id from dashboard where dashboard.nom_dashboard=:nom ))"
			, nativeQuery = true)
	public void createDashboardRapport4(@Param("nom") String nom_dashboard);
	

	

	

	
	//Consult dashboard Dashboard de Mohamed el raies
	@Modifying
	@Transactional
	@Query(value="UPDATE `actual_config` SET `id_dashboard` = :id WHERE `actual_config`.`id` = 1;"
			, nativeQuery = true)
	public void consultDashboard(@Param("id") Integer dashboard_id);
	


	


	


	





}
