package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class DetailProduit implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long iddetailproduit ;
	@Temporal(TemporalType.DATE)
	private Date date_creation ;
	@Temporal(TemporalType.DATE)
	private Date date_dermodification ;
	@Enumerated(EnumType.STRING)
	private Categorieproduit categorieproduit ;
	@OneToOne(mappedBy="detail")
	private Produit produit ; 
	
	

}
