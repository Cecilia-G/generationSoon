package it.generationsoon.modello;

import java.util.ArrayList;
import java.util.List;

public class Attore {

	private int id;
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private String nazionalita;
	private String dataDiDecesso;
	private String biografia;
	private List<Ruolo> film = new ArrayList<Ruolo>();

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

	public String getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public String getDataDiDecesso() {
		return dataDiDecesso;
	}

	public void setDataDiDecesso(String dataDiDecesso) {
		this.dataDiDecesso = dataDiDecesso;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public List<Ruolo> getFilm() {
		return film;
	}

	public void setFilm(List<Ruolo> film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "Attore [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", nazionalita=" + nazionalita + ", dataDiDecesso=" + dataDiDecesso + ", biografia=" + biografia
				+ "]";
	}

}
