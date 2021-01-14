package com.project.maxasin.fournisseur;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Achats {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long codeAchat;
		private double montant;
		private int quantite;
		private Date dateAchat;
		private String nomProduit;
		@ManyToOne
		@JoinColumn(name = "NOM_FN")
	    private Fournisseur fournisseur;
		
		
		
		public Long getCodeAchat() {
			return codeAchat;
		}
		public void setCodeAchat(Long codeAchat) {
			this.codeAchat = codeAchat;
		}
		public int getQuantite() {
			return quantite;
		}
		public void setQuantite(int quantite) {
			this.quantite = quantite;
		}
		public double getMontant() {
			return montant;
		}
		public void setMontant(double montant) {
			this.montant = montant;
		}
		public Date getDateAchat() {
			return dateAchat;
		}
		public void setDateAchat(Date dateAchat) {
			this.dateAchat = dateAchat;
		} 
	
		public String getNomProduit() {
			return nomProduit;
		}
		public void setNomProduit(String nomProduit) {
			this.nomProduit = nomProduit;
		}
		public Fournisseur getFournisseur() {
			return fournisseur;
		}
		public void setFournisseur(Fournisseur fournisseur) {
			this.fournisseur = fournisseur;
		}
		
		public Achats(double montant, int quantite, Date dateAchat, String nomProduit) {
			super();
			this.montant = montant;
			this.quantite = quantite;
			this.dateAchat = dateAchat;
			this.nomProduit = nomProduit;
		}
		public Achats() {
			super();
		}
		
		
		
}