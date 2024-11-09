package DBmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager {

	 // Database connection details (adjust as per your database configuration)
    private static final String DB_URL = "jdbc:mysql://localhost:3306/Ctrl"; // Adjust the database name
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    // Connection object
    public Connection connection;

    // Constructor to establish the connection
    public DbManager() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection established successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to establish connection to the database.");
        }
    }

    // Method to close the connection
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.err.println("Failed to close the connection.");
            }
        }
    }
	
    public String generateCommercialTableSQL() {
        return "CREATE TABLE IF NOT EXISTS Commercial (" +
               "id INT PRIMARY KEY AUTO_INCREMENT," +
               "matricule VARCHAR(255) , " + 
               "nom VARCHAR(255) NOT NULL, " +
               "prenom VARCHAR(255) NOT NULL " +
               ");";
    }
	
	
	
    public String generateProduitTableSQL() {
        return "CREATE TABLE  Produit (" +
               "id INT PRIMARY KEY AUTO_INCREMENT, " + 
               "nom VARCHAR(255) NOT NULL, " +
               "description VARCHAR(255) NOT NULL, " +
               "prix FLOAT NOT NULL, " +
               "Commercial_id INT, " +
               "FOREIGN KEY (Commercial_id) REFERENCES Commercial(id)" +
               ");";
    }


    public void executeSQL(String sql) {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("SQL executed successfully: " + sql);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Failed to execute SQL: " + sql);
        }
    }

    // Generate and execute all table creation statements
    public void createAllTables() {
        executeSQL(this.generateProduitTableSQL());
    }
    
	
    public static void main(String[] args) {
    	DbManager db = new DbManager();
    	db.createAllTables();
    }
    
    
    
    
    
    
    
}
