package com.project.maxasin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.maxasin.client.Client;
import com.project.maxasin.repository.ClientRepositotry;
import com.project.maxasin.service.ClientService;


@Service
public class ClientServiceImpl implements ClientService {

	 @Autowired
		private ClientRepositotry repoClient;
	 
	@Override
	public Client ajoutClient(Client client) {
		
		return repoClient.save(client) ;
	}
}
