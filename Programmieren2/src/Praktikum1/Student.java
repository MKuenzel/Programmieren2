package Praktikum1;

public class Student extends Person {

	//Variablen festlegen
	private int matr_nummer;														
	private int vorlesung;
	
	//Getter und Setter deklarieren
	public int getMatr_nummer() {													
		return matr_nummer;
	}
	public void setMatr_nummer(int matr_nummer) {
		this.matr_nummer = matr_nummer;
	}
	
	public int getVorlesung() {
		return vorlesung;
	}
	public void setVorlesung(int vorlesung) {
		this.vorlesung = vorlesung;
	}
	
	
	//Konstruktor deklarieren
	public Student(String name, String vorname, String adresse, String wohnort, int matr_nummer, int vorlesung) {	
		super(name, vorname, adresse, wohnort);
		this.matr_nummer = matr_nummer;
		this.vorlesung = vorlesung;
		
	}
	
	
	
	
}

