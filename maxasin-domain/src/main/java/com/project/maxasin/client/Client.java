package com.project.maxasin.client;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Client {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeCl;
	private String nomClient;
	@OneToMany(mappedBy = "client")
	private Collection<Ventes> ventes;
	
	
	public Long getCodeCl() {
		return codeCl;
	}
	public void setCodeCl(Long codeCl) {
		this.codeCl = codeCl;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public Collection<Ventes> getVentes() {
		return ventes;
	}
	
	public void setVentes(Collection<Ventes> ventes) {
		this.ventes = ventes;
	}
	public Client( String nomClient) {
		this.nomClient = nomClient;
	}
	public Client() {
		super();
	}
	
}
