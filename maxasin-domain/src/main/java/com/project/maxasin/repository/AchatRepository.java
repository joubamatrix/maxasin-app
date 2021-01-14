package com.project.maxasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.maxasin.fournisseur.Achats;

public interface AchatRepository extends JpaRepository<Achats, Long> {

}
