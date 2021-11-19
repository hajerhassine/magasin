package tn.esprit.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
public class Rayon implements Serializable {

	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idrayon ;	
	private String coderayon ;
	private String libelle ;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="rayon")
	private Set <Produit> produits;
	
	
}
