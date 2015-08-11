package entity;

import dao.DAO;
import dao.DAOFactory;

public abstract class Persona {
	
	@SuppressWarnings("unchecked")
	public void create(){
		DAOFactory.create(this);
	}
}
