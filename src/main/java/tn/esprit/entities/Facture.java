package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class Facture implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idfacture ;
	private float montantremise;
	private float montantfacture;
	private boolean active;
	@Temporal (TemporalType.DATE)
	private Date datefacture ;
	@ManyToOne
	private Client client ; 
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="facture")
	private Set<DetailFacture> detailfacture ;
	
	
	

}
