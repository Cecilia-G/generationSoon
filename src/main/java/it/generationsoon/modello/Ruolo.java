package it.generationsoon.modello;

public class Ruolo {

	private int id;
	private String nomeRuolo;
	private Film film;
	private Attore attore;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeRuolo() {
		return nomeRuolo;
	}

	public void setNomeRuolo(String nomeRuolo) {
		this.nomeRuolo = nomeRuolo;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Attore getAttore() {
		return attore;
	}

	public void setAttore(Attore attore) {
		this.attore = attore;
	}

	@Override
	public String toString() {
		return "Ruolo [id=" + id + ", nomeRuolo=" + nomeRuolo + ", film=" + film + ", attore=" + attore + "]";
	}

}
