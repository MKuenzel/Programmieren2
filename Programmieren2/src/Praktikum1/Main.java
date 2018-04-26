package Praktikum1;

public class Main {
	
	static int max;
	
	public static int max_vorlesung() {
		if(max == 7) {
			System.out.println("Ihre maximale Anzahl an Vorlesungen wurde erreicht");
				
		}
		return max;
	}
	
	
	public static int max_plaetze() {
		if(max == 300) {
			System.out.println("Die maximale Anzahl an Plätzen wurde erreicht");
				
		}
		return max;
	}
		
	
	
	
	public static void main(String[] args) {
		
		max_vorlesung();
		max_plaetze();
		
		Student s_eins = new Student("Mustermann", "Max", "Musterstraße", "Musterort", 88736514, 4);
		System.out.println("Vorname: " + s_eins.getVorname());
		System.out.println("Nachname: " + s_eins.getName());
		System.out.println("Adresse: " + s_eins.getAdresse());
		System.out.println("Wohnort: " + s_eins.getWohnort());
		System.out.println("Matrikelnummer: " + s_eins.getMatr_nummer());
		System.out.println("Vorlesung: " + s_eins.getVorlesung());
		if(s_eins.getVorlesung()>= 7) {
			System.out.println("Sie haben heute keine Vorlesungen mehr");
		}
		
		System.out.println(" ");
		
		Professor p_eins = new Professor("Prof", "Dr.", "Musterstraße", "Musterort", 7);
		System.out.println("Vorname: " + p_eins.getVorname());
		System.out.println("Nachname: " + p_eins.getName());
		System.out.println("Adresse: " + p_eins.getAdresse());
		System.out.println("Wohnort: " + p_eins.getWohnort());
		System.out.println("Vorlesung: " + p_eins.getVorlesung());
		if(p_eins.getVorlesung()>=7) {
			System.out.println("Sie haben heute keine Vorlesungen mehr");
		}
		
		System.out.println(" ");
		
		Hoersaal h_eins = new Hoersaal("Programmieren - Vorlesung", 300);
		System.out.println(h_eins.getVorlesung());
		System.out.println(h_eins.getPlaetze() + " Plätze ");
		if(h_eins.getPlaetze()>= 300) {
			System.out.println("Alle Sitzplätze des Hörsaals sind belegt");
		}

	}

}
