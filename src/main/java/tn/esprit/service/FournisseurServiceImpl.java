package tn.esprit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.esprit.entities.Fournisseur;

import tn.esprit.repository.FournisseurRepository;

@Service
public class FournisseurServiceImpl implements FournisseurService{
	

	@Autowired
	FournisseurRepository fournisseurrepository;
	
	@Override
	public List<Fournisseur> retrieveAllFournisseur() {
        List <Fournisseur> fournisseurs = (List<Fournisseur>) fournisseurrepository.findAll();
		return fournisseurs;
	}
	


	@Override
	public Fournisseur addFournisseur(Fournisseur fournisseur) {
		return fournisseurrepository.save(fournisseur);
	}

	
	@Override
	public void deleteFournisseur(Long id) {
		fournisseurrepository.deleteById(id);
		
	}

	
	@Override
	public Fournisseur updateFournisseur(Fournisseur fournisseur) {
		if (fournisseurrepository.existsById(fournisseur.getIdfournisseur())){
			Fournisseur f = fournisseurrepository.findById(fournisseur.getIdfournisseur()).get();
			f.setCodefournisseur(fournisseur.getCodefournisseur());
			f.setLibellefournisseur(fournisseur.getLibellefournisseur());
			fournisseurrepository.save(f);
		}
		
		return fournisseur;
	}

	@Override
	public Fournisseur retrieveFournisseur(Long id) {
		Fournisseur f =fournisseurrepository.findById(id).get();
		return f;
	}

}
