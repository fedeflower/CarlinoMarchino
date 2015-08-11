package Dati;

import entity.Dipendente;
import entity.Cliente;
import entity.Direttore;
public class Oggetto {

	public static void start(){
		boolean bool=false;
		//bool ? startdip() : startcli();
		startcli();
	}
	
	public static void startdip(){
		Dipendente gino = new Dipendente();
		gino.setNome("Mattew");
		gino.setCognome("Longano");
		gino.create();
		
	}
	
	public static void startcli(){

		Direttore gino = new Direttore();
		gino.setNome("Mattew");
		gino.setCognome("Longano");
		gino.create();
		
	}
	
	public static void main(String[] args) {
		start();
	}
}
