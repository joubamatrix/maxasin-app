package com.project.maxasin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.maxasin.client.Client;
import com.project.maxasin.service.ClientService;



@RestController
public class ClientController {
   @Autowired
	private ClientService inter;

   @PostMapping("/client")
public Client ajoutClient(@RequestBody Client client) {
	return inter.ajoutClient(client);
}
   
  
}
