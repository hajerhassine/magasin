package tn.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.entities.Stock;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.entities.Produit;
import tn.esprit.entities.Stock;
@Repository
public interface Stockrepository extends CrudRepository<Stock,Long> {

	@Transactional
	@Modifying
	@Query("Update Produit p set p.stock.idstock = :idstock where p.idproduit =:idproduit")
    void assignproduittostock(@Param("idproduit") Long idproduit, @Param("idstock") Long idstock);

    @Query("SELECT count(*),p.detail.categorieproduit,s.libellestock FROM Produit p JOIN Stock s ON p.stock=s.idstock GROUP BY p.detail.categorieproduit, s.libellestock")
	List retrieveproductquantitybyproduct_category_bystock();
    
    @Query("SELECT count(*),p.detail.categorieproduit,s.libellestock FROM Produit p JOIN Stock s ON p.stock=s.idstock GROUP BY p.detail.categorieproduit")
   	List retrievestockquantitybyproduct_category();
    
    @Transactional
	@Modifying
	@Query("Update Stock s set s.quantite =s.quantite+1  where s.idstock =:idstock")
    void updatestockquantity( @Param("idstock") Long idstock);
    
    
    @Query("SELECT p FROM Produit p where p.stock.quanite_min>p.stock.quantite")
    List<Produit> StatusStock();
	
	
}
