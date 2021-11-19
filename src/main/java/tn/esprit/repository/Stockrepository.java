package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Stock;
@Repository
public interface Stockrepository extends CrudRepository<Stock,Long> {

	
	
	
}
