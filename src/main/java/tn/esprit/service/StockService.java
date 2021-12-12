package tn.esprit.service;

import java.util.List;

import tn.esprit.entities.Stock;

public interface StockService {
	List<Stock> retrieveAllStocks();
	Stock addStock(Stock s);
	Stock updateStock(Stock u);
   void delete(Long id);
	Stock retrieveStock(Long id);
	void assignProduittostock(Long idproduit,Long idstock);
	String retrieveStatusStock();
	void updatestockquantity(Long idstock);
	List retrievestockquantitybyproduct_category();
	List retrieveproductquantitybyproduct_category_bystock();
}
