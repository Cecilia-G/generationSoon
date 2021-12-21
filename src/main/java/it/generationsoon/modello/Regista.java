package it.generationsoon.modello;

public class Regista {

	private int id;
	private String nome;
	private String cognome;
	private String dataDiNascita;
	private String nazionalita;
	private String dataDiDecesso;
	
	

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

	@Override
	public String toString() {
		return "Regista [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", nazionalita=" + nazionalita + ", dataDiDecesso=" + dataDiDecesso + "]";
	}

}
