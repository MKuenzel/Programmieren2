package Praktikum1;

public class Professor extends Person {

	private int vorlesung;
	
	
	public int getVorlesung() {
		return vorlesung;
	}
	public void setVorlesung(int vorlesung) {
		this.vorlesung = vorlesung;
	}
	
	
	
	public Professor(String name, String vorname, String adresse, String wohnort, int vorlesung) {
		super(name, vorname, adresse, wohnort);
		this.vorlesung = vorlesung;
	}
	
	
	
}
