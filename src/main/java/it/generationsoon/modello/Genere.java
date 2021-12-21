package it.generationsoon.modello;

public enum Genere {
	ANIMAZIONE("animazione"), AZIONE("azione"), AVVENTURA("avventura"), BIOGRAFICO("biografico"), COMMEDIA("commedia"), DOCUMENTARIO("documentario"), DRAMMATICO("drammatica"), FANTASCIENZA("fantascienza"), FANTASTICO("fantastico"), GIALLO("giallo"),
	GUERRA("guerra"), HORROR("horror"), MUSICALE("musicale"), SENTIMENTALE("sentimentale"), STORICO("storico"), THRILLER("thriller"), WESTERN("western");
	
	private String value;

	private Genere(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	
	
	
}
