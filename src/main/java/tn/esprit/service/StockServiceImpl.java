package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Produit;
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

	@Override
	public void assignProduittostock(Long idproduit, Long idstock) {
		stockrepository.assignproduittostock(idproduit, idstock);
		
	}
	//@Scheduled(cron="*/60 * * * * *")
	@Override
	public String retrieveStatusStock() {
		List <Produit> produits=stockrepository.StatusStock();
		String list="les produits dont la quantité de stock est epuisée: \n";
		if(produits.isEmpty()){
			list="Pas de produits dont la quantite de stock est epuiseé";
		}
		else{
			for (Produit p : produits){
			list=list+p.getLibelleproduit().toString()+" \n";
		}
		}
		return list;
	}

	@Override
	public void updatestockquantity(Long idstock) {
		stockrepository.updatestockquantity(idstock);
		
	}

	@Override
	public List retrievestockquantitybyproduct_category() {
	
		return stockrepository.retrievestockquantitybyproduct_category();
	}

	@Override
	public List retrieveproductquantitybyproduct_category_bystock() {

		return stockrepository.retrieveproductquantitybyproduct_category_bystock();
	}

	@Override
	public void delete(Long id) {
		stockrepository.deleteById(id);
		
	}


}
