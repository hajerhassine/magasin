package tn.esprit.service;

import java.util.List;

import tn.esprit.entities.Produit;

public interface ProduitService {
	List<Produit> retrieveAllProduits();

	Produit addProduit(Produit p, Long idRayon, Long idStock);

	Produit retrieveProduit(Long id);
}
