package com.project.maxasin.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project.maxasin.fournisseur.Achats;
import com.project.maxasin.produit.Produit;
import com.project.maxasin.repository.AchatRepository;
import com.project.maxasin.repository.ProduitRepository;
import com.project.maxasin.repository.StockRepository;
import com.project.maxasin.service.AchatService;
import com.project.maxasin.stock.Stock;



 @Service
public class AchatServiceImpl implements AchatService {
	 
	 @Autowired
		private AchatRepository repoAchat;
	  @Autowired
		private ProduitRepository repoProduit;
	  @Autowired
	  private StockRepository repoStock;
		

	@Transactional
	public Achats achatProduit(Achats achats) {
     boolean test = false;
     Produit p = new Produit(); 
	 Achats achat = repoAchat.save(achats);
	 double x = (achat.getMontant()/achat.getQuantite());
	 achat.setDateAchat(new Date());
	 Stock s = new Stock();
	 String produit = achat.getNomProduit();
	 List<String> list = repoStock.getNomProduit();
	 for(String l : list) {
		if(l.equals(produit)) 
         test = true;
	 }
	 
      if(test) {
    	
    	s = repoStock.findbyNomProduit(produit);
    	s.setNomProduit(produit);
    	s.setQuantite(achat.getQuantite()+s.getQuantite());
    	s.setTotalPrix(achat.getMontant()+s.getTotalPrix());
    	repoStock.save(s);
    	
    	}
      else {
     p.setCodeProduit(produit);
     p.setMontantUnitaire(x+x*0.3);
	 s.setNomProduit(produit);
	 s.setQuantite( achat.getQuantite());
	 s.setTotalPrix(achat.getMontant());
	 repoStock.save(s);
	 repoProduit.save(p);
	 }
	 
			 return achat;
	}


	@Override
	public Page<Achats> listAchats( Pageable page) {
		return  repoAchat.findAll(page);
		
	}


	@Override
	public void deleteAchatById(Long id) {
	 repoAchat.deleteById(id);
		
	}


	@Override
	public Achats updateAchats(Achats achat , Long id) {
           achat.setCodeAchat(id);
          return repoAchat.save(achat);
	}
 }
