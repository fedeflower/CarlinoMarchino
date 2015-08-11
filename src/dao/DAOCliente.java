package dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Cliente;
import dao.QueryStringReplacer;

public class DAOCliente extends DAOConnector<Cliente> {

	private static final String INSERT_QUERY = "INSERT INTO test2(nome,cognome) VALUES ('?', '?');";

	@Override
	public void create(Cliente entity) {
		
		String insertQuery = INSERT_QUERY;
		//System.out.println(insertQuery);
		
		String nomeDipendente = entity.getNome();
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, nomeDipendente);
		
		String cognomeDipendente = entity.getCognome();
		insertQuery = QueryStringReplacer.queryReplaceFirst(insertQuery, cognomeDipendente);
		//System.out.println(insertQuery);
		connector.executeUpdateQuery(insertQuery);	
		//System.out.println(insertQuery);
		
	}

	@Override
	public void update(Cliente entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente read(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}