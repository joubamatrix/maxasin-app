package com.project.maxasin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.maxasin.repository.StockRepository;
import com.project.maxasin.service.StockService;
import com.project.maxasin.stock.Stock;



@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	  private StockRepository repoStock;
		
	@Override
	public List<Stock> listStock() {
		
		return repoStock.findAll();
	}
	

}
