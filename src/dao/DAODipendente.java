package dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;


import entity.Dipendente;
import dao.QueryStringReplacer;

public class DAODipendente extends DAOConnector<Dipendente> {

	private static final String INSERT_QUERY = "INSERT INTO test(nome,cognome) VALUES ('?', '?');";

	@Override
	public void create(Dipendente entity) {
		
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
	public void update(Dipendente entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dipendente read(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Dipendente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}