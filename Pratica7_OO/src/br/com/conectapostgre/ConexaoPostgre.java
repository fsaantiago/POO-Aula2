package br.com.conectapostgre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoPostgre {
	 private final String url = "jdbc:postgresql://localhost/BDLivrariaUniversitaria";
	 private final String user = "postgres";
	 private final String password = "652472Afa!";
	 Connection conn = null;

	 
	 private static final String QUERY = "select * from autor where id_autor =?";
	 private static final String SELECT_ALL_QUERY = "select * from autor";
	 
	 
	 public Connection connect() {	        
	        try {
	            conn = DriverManager.getConnection(url, user, password);

	            if (conn != null) {
	                System.out.println("Connected to the PostgreSQL server successfully.");
	            } else {
	                System.out.println("Failed to make connection!");
	            }
	            
	            Statement statement = conn.createStatement();
	            ResultSet resultSet = statement.executeQuery("SELECT VERSION()");
	            if (resultSet.next()) {
	            	System.out.println(resultSet.getString(1));
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }

	        return conn;
	       
	    }	 
	    public void getAllUsers() {
	        
	        try {
	           
	            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_QUERY);
	            System.out.println(preparedStatement);
	            
	            ResultSet rs = preparedStatement.executeQuery();

	            
	            while (rs.next()) {
	                int id = rs.getInt("id_autor");
	                String name_autor = rs.getString("nm_autor");
	                System.out.println(id + " - " + name_autor);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }
	    public void getUserById() {
	    	
	        try {
	            
	            PreparedStatement preparedStatement = conn.prepareStatement(QUERY);
	            
	            preparedStatement.setInt(1, 5);
	            System.out.println(preparedStatement);
	            ResultSet rs = preparedStatement.executeQuery();
	            
	            while (rs.next()) {
	                int id = rs.getInt("id_autor");
	                String name_autor = rs.getString("nm_autor");
	                System.out.println(id + " - " + name_autor);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	    }	    
	    public static void printSQLException(SQLException ex) {
	            for (Throwable e: ex) {
	                if (e instanceof SQLException) {
	                    e.printStackTrace(System.err);
	                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                    System.err.println("Message: " + e.getMessage());
	                    Throwable t = ex.getCause();
	                    while (t != null) {
	                        System.out.println("Cause: " + t);
	                        t = t.getCause();
	                    }
	                }
	            }
	        }
	    public static void main(String[] args) {
	    	
	    	ConexaoPostgre app = new ConexaoPostgre();
	        app.connect();
	        System.out.println("\nRealizando o select na tabela Autor");
	        app.getAllUsers();
	        System.out.println("\nRealizando o select na tabela Autor pelo ID");
	        app.getUserById();	        
	    }
	}
