package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Produit implements Serializable{
	
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
private long idproduit ;
private String codeproduit ;
private String libelleproduit ;
private float prixunitaire ;

@ManyToMany(cascade = CascadeType.ALL)
private Set<Fournisseur> fournisseurs;

@ManyToOne(cascade = CascadeType.ALL)
private Rayon rayon;

@ManyToOne(cascade = CascadeType.ALL)
private Stock stock;

@OneToOne
private DetailProduit detail ; 

@OneToMany(cascade = CascadeType.ALL,mappedBy="produit")

private Set<DetailFacture> detailfacture;



}
