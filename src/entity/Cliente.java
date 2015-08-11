package entity;

public class Cliente extends Persona {

	private String nome;
	private String cognome;

	public Cliente(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Cliente() {
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

}
