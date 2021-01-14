package com.project.maxasin.fournisseur;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Fournisseur {
	@Id
	private String nomFn;
	@OneToMany(mappedBy = "fournisseur",fetch = FetchType.LAZY)
	private Collection<Achats> achats;
	
	
	public String getNomFn() {
		return nomFn;
	}
	public void setNomFn(String nomFn) {
		this.nomFn = nomFn;
	}
	@JsonIgnore
	public Collection<Achats> getAchats() {
		return achats;
	}
	@JsonSetter
	public void setAchats(Collection<Achats> achats) {
		this.achats = achats;
	}
	public Fournisseur(String nomFn) {
		super();
		this.nomFn = nomFn;
	}
	public Fournisseur() {
		super();
	}
	
	
}
