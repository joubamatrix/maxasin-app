package com.project.maxasin.client;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ventes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeVentes;
	private double montant;
	private Date dateVentes;
	private int quantite;
	
	private String nomProduit;
	@ManyToOne
	@JoinColumn(name = "CODE_CL")
    private Client client;
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Long getCodeVentes() {
		return codeVentes;
	}
	public void setCodeVentes(Long codeVentes) {
		this.codeVentes = codeVentes;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Date getDateVentes() {
		return dateVentes;
	}
	public void setDateVentes(Date dateVentes) {
		this.dateVentes = dateVentes;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Ventes(Long codeVentes, double montant, Date dateVentes) {
		super();
		this.codeVentes = codeVentes;
		this.montant = montant;
		this.dateVentes = dateVentes;
	}
	public Ventes() {
		super();
	}
	
	
}
