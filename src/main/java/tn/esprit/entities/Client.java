package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Client implements Serializable {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idclient  ;
	private String nom ;
	private String prenom ;
	@Temporal (TemporalType.DATE)
	private Date date_naissance ;
	private String email ;
	private String password ;
	@Enumerated (EnumType.STRING)
	private Categorieclient categorieclient ;
	@Enumerated (EnumType.STRING)
	private Profession profession ;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="client")
	private Set<Facture> factures ;
	
	

}
