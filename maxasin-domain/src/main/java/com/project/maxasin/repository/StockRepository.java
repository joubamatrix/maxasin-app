package com.project.maxasin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.maxasin.stock.Stock;



public interface StockRepository extends JpaRepository<Stock, Long> {

	@Query("select s.nomProduit from Stock s "  )
	public List<String> getNomProduit();
	 
	@Query("select s from Stock s where s.nomProduit = :x ")
	public Stock findbyNomProduit( @Param("x") String nom);
}