package com.project.maxasin.produit;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;





@Entity(name = "product")

public class Produit {
	@Id
	private String nomProduit;
	private double montantUnitaire;
	private Date dateFabrication;
    
	
	public String getnomProduit() {
		return nomProduit;
	}
	public void setCodeProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	
	public double getMontantUnitaire() {
		return montantUnitaire;
	}
	
	public void setMontantUnitaire(double montantUnitaire) {
		this.montantUnitaire = montantUnitaire;
	}
	public Date getDateFabrication() {
		return dateFabrication;
	}
	public void setDateFabrication(Date dateFabrication) {
		this.dateFabrication = dateFabrication;
	}
	
	public Produit(String nomProduit, double montantUnitaire, Date dateFabrication) {
		super();
		this.nomProduit = nomProduit;
		this.montantUnitaire = montantUnitaire;
		this.dateFabrication = dateFabrication;
	}
	public Produit() {
		super();
	}
	
	

	
}

