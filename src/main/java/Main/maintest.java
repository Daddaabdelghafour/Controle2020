package Main;

import java.util.HashSet;
import java.util.Set;

import DaoImp.CommercialDaoImp;
import DaoImp.ProduitDaoImp;
import controle2020.ctrlModel.Commercial;
import controle2020.ctrlModel.Produit;

public class maintest {

	public static void main(String[] args) {
		//Set<Commercial> comSet = new HashSet<Commercial>();
		CommercialDaoImp c = new CommercialDaoImp();
		//comSet = c.selectAll();
		//for (Commercial s : comSet) {
			//System.out.println(s.getMatricule());
		//	System.out.println(s.getNom());
		//	System.out.println(s.getPrenom());
			//System.out.println("*************************");
			
		//}
		//c.delete("REF-comm5");
		Commercial mycomm = new Commercial(3,"fdfdf","fdfdfd","fdfdf");
		ProduitDaoImp d = new ProduitDaoImp();
		//Produit p = new Produit(1,"razer Cortex","high sensitivity mouse",120.5,mycomm);
		Produit new_prod = new Produit(1,"updatedProd","updatedProd",50,mycomm);
		d.update(new_prod);
		//d.add(p);
	
	
	}
	
	
	
	
	
	
	
	
}
