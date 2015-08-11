package connector;

import java.sql.*;

import dao.DAO;
import dao.DAOConnector;
import dao.DAODipendente;
import entity.Cliente;
import entity.Dipendente;

public class carLoanDBConnector implements Connector {

	@Override
	public ResultSet executeReadQuery(String query) {

		return null;
	}

	@Override
	public ResultSet executeUpdateQuery(String query) {

        Statement statement = null;
        ResultSet queryUpdateResult = null;

        try {
        	statement=connessione.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            queryUpdateResult = statement.getGeneratedKeys();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //restituisce le tuple inserite/modificate
        return queryUpdateResult;
    }

	private Connection connessione = null;

	public carLoanDBConnector() {
		connect();
	}

	public void connect() {

		try {
			new com.mysql.jdbc.Driver();

			connessione = DriverManager.getConnection(
					"jdbc:mysql://localhost/carloan", "utente", "utente");

			System.out.println("Database Connected! :D");

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("Database NOT Connected! :(");
		}
	}

	public static void main(String[] args) {
		/*Dipendente gino = new Dipendente();
		//Cliente gino = new Cliente();
		gino.setNome("Miti");
		gino.setCognome("Longano");
		gino.create();*/
	}

}