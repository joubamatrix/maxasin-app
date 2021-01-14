package com.project.maxasin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.maxasin.client.Ventes;
import com.project.maxasin.service.VenteService;


@RestController
public class VenteController {
    @Autowired
	private VenteService inter;
   
    @PostMapping("/vente")
	public Ventes venteProduit(@RequestBody Ventes vente) {
		return inter.venteProduit(vente);
	}
    
  
   
   
}
