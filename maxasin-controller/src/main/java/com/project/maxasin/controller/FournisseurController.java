package com.project.maxasin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.maxasin.fournisseur.Fournisseur;
import com.project.maxasin.service.fournisseurService;




@RestController
public class FournisseurController {
   
	@Autowired
	private fournisseurService inter;
    
@PostMapping("/fournisseur")
public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur) {
	
	return inter.ajoutFournisseur(fournisseur);
}


}