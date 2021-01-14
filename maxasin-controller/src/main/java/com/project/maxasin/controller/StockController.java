package com.project.maxasin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.project.maxasin.repository.StockRepository;
import com.project.maxasin.service.StockService;
import com.project.maxasin.stock.Stock;




@RestController
public class StockController {
    @Autowired
	private StockService inter;
    @Autowired
    private StockRepository repo;

    @GetMapping("/stock")
	public List<Stock> listStock() {
		return inter.listStock();
	}
 
    @GetMapping("/stock/{nomProduit}")
   	public Stock getStock(  @PathVariable String nomProduit) {
   		return repo.findbyNomProduit(nomProduit);
   	}
    @GetMapping("/mesproduit")
   	public List<String> getproduit() {
   		return repo.getNomProduit();
   	}
    
    
    
    
}
