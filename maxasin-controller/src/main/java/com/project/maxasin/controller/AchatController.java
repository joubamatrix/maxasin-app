package com.project.maxasin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.maxasin.fournisseur.Achats;
import com.project.maxasin.service.AchatService;



@RestController
public class AchatController {
   @Autowired
	AchatService metier;
	@GetMapping("/achat/page={page}&size={size}")
   public Page<Achats> listAchats(@PathVariable("page") int page,@PathVariable("size") int size) {
	return metier.listAchats(PageRequest.of(page, size));
}

   @DeleteMapping("/achat/{id}")
public void deleteAchatById(@PathVariable Long id) {
	metier.deleteAchatById(id);
}

   @PutMapping("/achat/{id}")
public Achats updateAchats( @RequestBody Achats achat, @PathVariable Long id) {
	return metier.updateAchats(achat, id);
}

@PostMapping("/achat")
   public Achats saveAchat(@RequestBody Achats achat) {
	   return metier.achatProduit(achat);
   }
}
