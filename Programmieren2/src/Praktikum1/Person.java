package Praktikum1;

public class Person {

	//Variablen festlegen
	private String name;
	private String vorname;
	private String adresse;
	private String wohnort;
	
	//Getter und Setter deklarieren
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public String getWohnort() {
		return wohnort;
	}
	public void setWohnort(String wohnort) {
		this.wohnort = wohnort;
	}
	

	//Konstruktor deklarieren
	public Person(String name, String vorname, String adresse, String wohnort) {
		this.name = name;
		this.vorname = vorname;
		this.adresse = adresse;
		this.wohnort = wohnort;
	}
	
}
