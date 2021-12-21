package it.generationsoon.modello;

import java.util.ArrayList;
import java.util.List;

public class Utente {

	private int id;
	private String nome;
	private String cognome;
	private String username;
	private String password;
	private List<VotoUtente> filmVotati = new ArrayList<VotoUtente>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<VotoUtente> getFilmVotati() {
		return filmVotati;
	}

	public void setFilmVotati(List<VotoUtente> filmVotati) {
		this.filmVotati = filmVotati;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", username=" + username + ", password="
				+ password + "]";
	}

}
