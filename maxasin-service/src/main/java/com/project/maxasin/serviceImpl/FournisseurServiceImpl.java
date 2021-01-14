package com.project.maxasin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.maxasin.fournisseur.Fournisseur;
import com.project.maxasin.repository.FournisseurRepository;
import com.project.maxasin.service.fournisseurService;

@Service
public class FournisseurServiceImpl implements fournisseurService {

	 @Autowired
		private FournisseurRepository repoFournisseur;
	 
	@Override
	public Fournisseur ajoutFournisseur(Fournisseur fournisseur) {
		
		return repoFournisseur.save(fournisseur);
	}
}