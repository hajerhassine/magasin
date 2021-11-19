package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture,Long>{

}
