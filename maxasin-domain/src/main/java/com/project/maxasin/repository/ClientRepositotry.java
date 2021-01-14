package com.project.maxasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.maxasin.client.Client;

public interface ClientRepositotry extends JpaRepository<Client, Long> {

}
