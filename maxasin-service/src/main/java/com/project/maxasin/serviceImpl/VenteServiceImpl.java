package com.project.maxasin.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.maxasin.client.Ventes;
import com.project.maxasin.produit.Produit;
import com.project.maxasin.repository.ProduitRepository;
import com.project.maxasin.repository.StockRepository;
import com.project.maxasin.repository.VenteRepository;
import com.project.maxasin.service.VenteService;
import com.project.maxasin.stock.Stock;



@Service
public class VenteServiceImpl implements VenteService {
	
	@Autowired
		private ProduitRepository repoProduit;
	@Autowired
	    private StockRepository repoStock;
	@Autowired
		private VenteRepository repoVente;

	@Transactional
	public Ventes venteProduit(Ventes ventes) {
	     boolean test = false;
	    Ventes vente =  repoVente.save(ventes);
		 String produit = vente.getNomProduit();
		 System.out.println(produit);
		 Stock s = repoStock.findbyNomProduit(produit);
	
		 System.out.println(s.toString());
		 Produit p = repoProduit.findbyNomProduit(produit);
		
		 List<String> list = repoStock.getNomProduit();
		 for(String l : list) {
			if(l.equals(produit)) 
	         test = true;
		 }
		 
	      if(test) {
	    	vente.setDateVentes(new Date());
	    	vente.setMontant(p.getMontantUnitaire()*vente.getQuantite());
		   double pu =  s.getTotalPrix()/s.getQuantite();
		   
			System.out.println(s.getTotalPrix() );
			System.out.println(vente.getQuantite());
			System.out.println(s.getQuantite() );
			s.setQuantite(s.getQuantite()-vente.getQuantite());
			s.setTotalPrix(pu*s.getQuantite());
	    	if(s.getQuantite()<0)
	    	throw new RuntimeException("le stock est insuffisant");
	    	else {
	    	repoStock.save(s);
	    	repoVente.save(ventes);
	    	return vente;
	    	}
	    	}
	      else {
	    	  
	    	  repoVente.delete(vente); 
	    	  throw new RuntimeException("ce produit n'existe pas");
		 } 
		}

}
