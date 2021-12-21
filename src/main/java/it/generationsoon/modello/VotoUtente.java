package it.generationsoon.modello;

public class VotoUtente {

	private int id;
	private int voto;
	private Film film;
	private Utente utente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "VotoUtente [id=" + id + ", voto=" + voto + ", film=" + film + ", utente=" + utente + "]";
	}

}
