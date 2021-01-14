package com.project.maxasin.stock;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeFlux;
	private String nomProduit;
	private int quantite;
	private double totalPrix;
	
	public Long getCodeFlux() {
		return codeFlux;
	}
	public void setCodeFlux(Long codeFlux) {
		this.codeFlux = codeFlux;
	}
	
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getTotalPrix() {
		return totalPrix;
	}
	public void setTotalPrix(double totalPrix) {
		this.totalPrix = totalPrix;
	}
	@Override
	public String toString() {
		return "Stock [codeFlux=" + codeFlux + ", nomProduit=" + nomProduit + ", quantite=" + quantite + ", totalPrix="
				+ totalPrix + "]";
	}


}
