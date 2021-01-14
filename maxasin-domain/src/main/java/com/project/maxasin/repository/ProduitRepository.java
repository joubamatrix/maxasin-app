package com.project.maxasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.maxasin.produit.Produit;

public interface ProduitRepository extends JpaRepository<Produit, String> {

	@Query("select p from product p where p.nomProduit = :x ")
	public Produit findbyNomProduit( @Param("x") String nom);
}