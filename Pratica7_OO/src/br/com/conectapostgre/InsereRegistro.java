package br.com.conectapostgre;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsereRegistro {
	private final String url = "jdbc:postgresql://localhost/BDLivrariaUniversitaria";
	private final String user = "postgres";
	private final String password = "652472Afa!";

    private static final String INSERT_USERS_SQL = "INSERT INTO users" +
        "  (id_isbn, id_categoria, id_editora, country, password) VALUES " +
        " (?, ?, ?, ?, ?);";

    public static void main(String[] argv) throws SQLException {
    	InsereRegistro insereLivro = new InsereRegistro();
    	insereLivro.insertRecord();
    }

    public void insertRecord() throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager.getConnection(url, user, password);

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Fernondo");
            preparedStatement.setString(3, "fernondenho@gmail.com");
            preparedStatement.setString(4, "BR");
            preparedStatement.setString(5, "secret");

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
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