package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DetailFacture implements Serializable  {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
private long iddetailfacture ;
private int quantite ;
private float prixtotal ;
private int pourcentageremise; 
private int montantremise ;
@ManyToOne
private Facture facture;
@ManyToOne
private Produit produit ;


}
