package Praktikum1;

public class Person {

	private String name;
	private String vorname;
	private String adresse;
	private String ort;
	private String vorlesung;
	

	public void setName(String n){
		name = n;
	}	
	public String getName(){
		return this.name;
	}
	
	
	
	public void setVorname(String vn) {
		vorname = vn;
	}
	public String getVorname() {
		return this.vorname;
	}
	
	
	
	public void setAdresse(String a) {
		adresse = a;
	}
	public String getAdresse() {
		return this.adresse;
	}
	

	
	public void setOrt(String o) {
		ort = o;
	}
	public String setOrt() {
		return this.ort;
	}
	
	
	public void setVorlesung(String v) {
		vorlesung = v;
	}
	public String setVorlesung() {
		return this.vorlesung;
	}
	

}
