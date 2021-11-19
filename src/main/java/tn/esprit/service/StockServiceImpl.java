package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Stock;
import tn.esprit.repository.Stockrepository;
@Service
public class StockServiceImpl implements StockService{
 @Autowired
 
 Stockrepository stockrepository ;
	@Override
	public List<Stock> retrieveAllStocks() {
		List <Stock> stocks = (List<Stock>) stockrepository.findAll();
		return stocks;
	}

	@Override
	public Stock addStock(Stock s) {
		Stock t = stockrepository.save(s);
		return t;
	}

	@Override
	public Stock updateStock(Stock u) {
		Stock t = stockrepository.save(u);
		return t;
	}

	@Override
	public Stock retrieveStock(Long id) {
		Stock t = stockrepository.findById(id).get();
		return t;
	}

}
