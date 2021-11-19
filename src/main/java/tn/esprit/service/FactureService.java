package tn.esprit.service;

import java.util.List;

import tn.esprit.entities.Facture;

public interface FactureService {
	List<Facture> retrieveAllFactures();
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);
}
