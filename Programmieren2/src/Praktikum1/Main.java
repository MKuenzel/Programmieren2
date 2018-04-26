package Praktikum1;

public class Main {
	
	public static void main(String[] args) {
		
		//Implementierung und Ausgabe des Objekts Student
		Student s_eins = new Student("Mustermann", "Max", "Musterstraße", "Musterort", 88736514, 4);
		System.out.println("Student");
		System.out.println("-------");
		System.out.println("Vorname: " + s_eins.getVorname());
		System.out.println("Nachname: " + s_eins.getName());
		System.out.println("Adresse: " + s_eins.getAdresse());
		System.out.println("Wohnort: " + s_eins.getWohnort());
		System.out.println("Matrikelnummer: " + s_eins.getMatr_nummer());
		System.out.println("Vorlesung: " + s_eins.getVorlesung());
		//Schleife um die Anzahl der Vorlesungen zu überprüfen
		if(s_eins.getVorlesung()>= 7) {
			System.out.println("Sie haben heute keine Vorlesungen mehr");
		}
		
		System.out.println(" ");
		
		//Implementierung und Ausgabe des Objekts Professor
		Professor p_eins = new Professor("Prof", "Dr.", "Musterstraße", "Musterort", 7);
		System.out.println("Professor");
		System.out.println("---------");
		System.out.println("Vorname: " + p_eins.getVorname());
		System.out.println("Nachname: " + p_eins.getName());
		System.out.println("Adresse: " + p_eins.getAdresse());
		System.out.println("Wohnort: " + p_eins.getWohnort());
		System.out.println("Vorlesung: " + p_eins.getVorlesung());
		//Schleife um die Anzahl der Vorlesungen zu überprüfen
		if(p_eins.getVorlesung()>=7) {
			System.out.println("Sie haben heute keine Vorlesungen mehr");
		}
		
		System.out.println(" ");
		
		//Implementierung und Ausgabe des Objekts Hörsaal
		Hoersaal h_eins = new Hoersaal("Programmieren - Vorlesung", 300);
		System.out.println("Hörsaal");
		System.out.println("-------");
		System.out.println(h_eins.getVorlesung());
		System.out.println(h_eins.getPlaetze() + " Plätze ");
		//Schleife um die Anzahl der Sitzplätze zu überprüfen
		if(h_eins.getPlaetze()>= 300) {
			System.out.println("Alle Sitzplätze des Hörsaals sind belegt");
		}

	}

}
