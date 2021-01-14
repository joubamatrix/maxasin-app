package com.project.maxasin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.project.maxasin.fournisseur.Achats;
import com.project.maxasin.service.AchatService;


@SpringBootApplication
public class MaxasinSpringBoot extends SpringBootServletInitializer implements CommandLineRunner  {

	@Autowired
	private AchatService metier;
	
	@Bean
	public BCryptPasswordEncoder bcript() {
		return new BCryptPasswordEncoder ();
	}
	public static void main(String[] args) {
		SpringApplication.run(MaxasinSpringBoot.class, args);
		
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources( MaxasinSpringBoot.class);
	}

	@Override
	public void run(String... args) throws Exception {
		metier.achatProduit(new Achats(1000,10,new Date(),"total"));
		metier.achatProduit(new Achats(1000,10,new Date(),"nikos"));
		metier.achatProduit(new Achats(1000,10,new Date(),"select"));
		metier.listAchats(PageRequest.of(0, 3));
		
	}
}
