package DaoImp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import DBmanager.DbManager;
import Dao.ProduitDao;
import controle2020.ctrlModel.Produit;

public class ProduitDaoImp implements ProduitDao {

	@Override
	public int add(Produit p) {
		try { 
		DbManager db = new DbManager();
		String query = "insert into produit(id,nom,description,prix,Commercial_id) values (?,?,?,?,?);";
		PreparedStatement stmt = db.connection.prepareStatement(query);
		stmt.setInt(1,p.getid());
		stmt.setString(2, p.getnom());
		stmt.setString(3,p.getdescription());
		stmt.setDouble(4, p.getprix());
		stmt.setInt(5, p.getCommercial().getId());
		stmt.execute();
		return p.getid();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
		
	}
	
	@Override
	
	public int update(Produit p) {
		try {
		DbManager db = new DbManager();
		String query = "update produit set nom=? ,description=? , prix=? , Commercial_id=? where id=1  ;";
		PreparedStatement stmt = db.connection.prepareStatement(query);
		stmt.setString(1, p.getnom());
		stmt.setString(2, p.getdescription());
		stmt.setDouble(3, p.getprix());
		stmt.setInt(4, p.getCommercial().getId());
		stmt.execute();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return 1;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
