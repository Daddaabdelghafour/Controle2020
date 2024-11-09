package controle2020.ctrlModel;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Commercial {
private int id;
private String matricule;
private String nom;
private String prenom;
private Set<Produit> produits;

public Commercial(int id,String matricule,String nom,String prenom) {
	this.id=id;
	this.matricule = matricule;
	this.nom=nom;
	this.prenom=prenom;
	produits = new HashSet<Produit>();
}


public int getId() {
	return this.id;
}

public String getMatricule() {
	return this.matricule;
}


public String getNom() {
	return this.nom;
	
}


public String getPrenom() {
	return this.prenom;
}

public Set<Produit> getProduits(){
	return this.produits;
}


















}
