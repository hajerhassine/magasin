package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Produit;
import tn.esprit.repository.ProduitRepository;
import tn.esprit.repository.Stockrepository;
import tn.esprit.repository.RayonRepository;

@Service
public class ProduitServiceImpl implements ProduitService{
	
	@Autowired
	ProduitRepository produitrepository ; 
	
	@Override
	public List<Produit> retrieveAllProduits() {
		List<Produit> produits=(List<Produit>) produitrepository.findAll();
		return produits;
	}

	@Override
	public Produit addProduit(Produit p, Long idRayon, Long idStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit retrieveProduit(Long id) {
		// TODO Auto-generated method stub
		return null;
	}




}
