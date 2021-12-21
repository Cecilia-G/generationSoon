package it.generationsoon.modello;

import java.util.ArrayList;
import java.util.List;

public class Film {

	private int id;
	private String titolo;
	private int anno;
	private int durata;
	private String distribuzione;
	private String dataDiUscita;
	private Genere genere;
	private Regista regista;
	private List<Ruolo> attori = new ArrayList<Ruolo>();
	private List<VotoUtente> votiUtenti = new ArrayList<VotoUtente>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public String getDistribuzione() {
		return distribuzione;
	}

	public void setDistribuzione(String distribuzione) {
		this.distribuzione = distribuzione;
	}

	public String getDataDiUscita() {
		return dataDiUscita;
	}

	public void setDataDiUscita(String dataDiUscita) {
		this.dataDiUscita = dataDiUscita;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public Regista getRegista() {
		return regista;
	}

	public void setRegista(Regista regista) {
		this.regista = regista;
	}

	public List<Ruolo> getAttori() {
		return attori;
	}

	public void setAttori(List<Ruolo> attori) {
		this.attori = attori;
	}

	public List<VotoUtente> getVotiUtenti() {
		return votiUtenti;
	}

	public void setVotiUtenti(List<VotoUtente> votiUtenti) {
		this.votiUtenti = votiUtenti;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titolo=" + titolo + ", anno=" + anno + ", durata=" + durata + ", distribuzione="
				+ distribuzione + ", dataDiUscita=" + dataDiUscita + ", genere=" + genere + ", regista=" + regista
				+ "]";
	}

}
