package Projekt;

public class Spieler {
	
	//Variablen deklaration
	String farbe;
	int spielerzug;

	//Spielerfarbe Getter und Setter
	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	
	//Spielerzug Getter und Setter
	public int getSpielerzug() {
		return spielerzug;
	}

	public void setSpielerzug(int spielerzug) {
		this.spielerzug = spielerzug;
	}

	
	//Konstruktor
	public Spieler(String farbe, int spielerzug) {
		this.farbe = farbe;
		this.spielerzug = spielerzug;
	}
	
}
