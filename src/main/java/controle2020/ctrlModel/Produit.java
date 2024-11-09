package controle2020.ctrlModel;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Produit {
private int id;
private String nom;
private String description;
private double prix;
private Commercial comm;	

public Produit(int id,String nom,String description,double prix,Commercial c) {
this.id=id;
this.nom=nom;
this.description=description;
this.prix=prix;
this.comm=c;
}

public int getid() {
	return this.id;
}

public String getnom() {
	return this.nom;
}


public String getdescription() {
	return this.description;
}


public Double getprix() {
	return this.prix;
}

public Commercial getCommercial() {
	return this.comm;
}


@Override
public boolean equals(Object o) {
	if(this == o) {
		return true;
	}
	if(o == null) {
		return false;
	}
	
	Produit c = (Produit) o;
	if(this.id == c.id) {
		return true;
	}
	else {
		return false;
	}
}

@Override 
public int hashCode() {
	return Objects.hashCode(this.description);
}



public static void main(String[] args) {
	//Produit p = new Produit(1,"Razer Mouse","high sensitivity mouse",120.5,null);
	//int a = p.hashCode();
	//boolean b = p.equals(p);
	//System.out.println(a);
	//System.out.println(b);
	
}












}
