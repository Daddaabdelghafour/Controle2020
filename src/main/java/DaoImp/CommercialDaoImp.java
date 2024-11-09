package DaoImp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import DBmanager.DbManager;
import Dao.CommercialDao;
import controle2020.ctrlModel.Commercial;


public class CommercialDaoImp implements CommercialDao {
	
	@Override 
	public Set<Commercial> selectAll(){
		Set<Commercial> set = new HashSet<Commercial>();
		DbManager db = new DbManager();
		String query = "Select * from Commercial";
		try {
			Statement stmt = db.connection.createStatement();
			ResultSet res = stmt.executeQuery(query);
			while(res.next()) {
				set.add(new Commercial(res.getInt("id"),res.getString("matricule"),res.getString("nom"),res.getString("prenom")));
			}
			db.closeConnection();
			return set;
			
		}catch(SQLException e) {
			System.out.println(query);
		}
		return set;
	}
	
	
	@Override 
	public void delete(String matricule) {
		try { 
		DbManager db = new DbManager();
		String query = "Delete from Commercial where matricule=?";
		PreparedStatement stmt = db.connection.prepareStatement(query);
		stmt.setString(1, matricule);
		boolean r=stmt.execute();
		if(r) {
			System.out.println("Deleted Commercial : " + matricule + " successfully" );

		}
		else {
			System.out.println("Matricule doesn't exist");

		}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
