package com.project.maxasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.maxasin.client.Ventes;

public interface VenteRepository extends JpaRepository<Ventes, Long> {
	   
	@Query("delete from Ventes v where v.nomProduit = :p")
	public void deleteVenteByProduit(@Param("p") String nomProduit);
}
