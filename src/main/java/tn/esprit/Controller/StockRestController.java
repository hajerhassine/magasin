package tn.esprit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import tn.esprit.entities.Stock;
import tn.esprit.service.StockService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/stock")
public class StockRestController {
	@Autowired
	StockService stockservice;
	@GetMapping("/retrievestockquantitybyproduct_category")
	public List retrievestockquantitybyproduct_category() {
		List result = stockservice.retrievestockquantitybyproduct_category();
		return result;
		}
	@GetMapping("/retrieveproductquantitybyproduct_category_bystock")
	public List retrieveproductquantitybyproduct_category_bystock() {
		List result = stockservice.retrieveproductquantitybyproduct_category_bystock();
		return result;
		}
	@GetMapping("/Retrieveallstock")
	public List <Stock> Retrieveallstock() {
		return stockservice.retrieveAllStocks();
		}
	
	
	 @PutMapping("/assignproduittostock/{idproduit}/{idstock}")
	@ResponseBody
	public void Assignproduittostock(@PathVariable("idproduit") Long idproduit,@PathVariable("idstock") Long idstock ) {
		stockservice.assignProduittostock (idproduit,idstock);
		}
	 
	 
	 @GetMapping("/getalarm")
		public String getalarm() {
		 String s=stockservice.retrieveStatusStock();
		 Gson gson = new Gson();    
			return  gson.toJson(s);
			}
