package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.entities.Facture;
import tn.esprit.repository.FactureRepository;
@Service
public class FactureServiceImpl implements FactureService {

	@Autowired
	FactureRepository facturerepository ;
	@Override
	public List<Facture> retrieveAllFactures() {
		List<Facture> factures = (List<Facture>) facturerepository.findAll();
		return factures;
	}

	@Override
	public void cancelFacture(Long id) {
		Facture facture = facturerepository.findById(id).get();
		facture.setActive(true);
	    facturerepository.save(facture);
		
	}

	@Override
	public Facture retrieveFacture(Long id) {
		Facture f = facturerepository.findById(id).get();
		return f;
	}

}
