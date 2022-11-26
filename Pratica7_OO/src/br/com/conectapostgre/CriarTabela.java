package br.com.conectapostgre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {

	private final String url = "jdbc:postgresql://localhost/BDLivrariaUniversitaria";
	private final String user = "postgres";
	private final String password = "652472Afa!";

    private static final String createTableSQL = "CREATE TABLE users " +
        "(ID INT PRIMARY KEY ," +
        " NAME TEXT, " +
        " EMAIL VARCHAR(50), " +
        " COUNTRY VARCHAR(50), " +
        " PASSWORD VARCHAR(50))";

    public static void main(String[] argv) throws SQLException {
    	CriarTabela criaTabela = new CriarTabela();
    	criaTabela.createTable();
    }

    public void createTable() throws SQLException {

        System.out.println(createTableSQL);
        try (Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();) {
            statement.execute(createTableSQL);
            
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
}