package com.project.maxasin.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.project.maxasin.fournisseur.Achats;

public interface AchatService {
	public  Achats achatProduit(Achats achats);
	public Page<Achats> listAchats(Pageable page);
	public void deleteAchatById(Long id);
	public Achats updateAchats(Achats achat , Long id);
}
