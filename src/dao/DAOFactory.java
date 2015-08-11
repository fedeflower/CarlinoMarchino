package dao;

import dao.DAO;

public class DAOFactory {
	
	public static String getClassName(Object obj){
		return "dao.DAO"+obj.getClass().getSimpleName();
	}
	
	@SuppressWarnings("unchecked")
	public static void create(Object obj){
		Class<?> DAOClass=null;
        DAO<Object> daoInstance = null;
		try {
			DAOClass = Class.forName(getClassName(obj));
			daoInstance = (DAO<Object>) DAOClass.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		daoInstance.create(obj);
	}
}
