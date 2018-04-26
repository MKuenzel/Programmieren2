package Praktikum1;

public class Hoersaal {

	private String vorlesung;
	private int plaetze;
	
	
	public String getVorlesung(){
		return vorlesung;
	}
	public void setVorlesung(String vorlesung) {
		this.vorlesung = vorlesung;
	}
	
	
	public int getPlaetze() {
		return plaetze;
	}
	public void setPlaetze(int plaetze) {
		this.plaetze = plaetze;
	}
	
	
	
	public Hoersaal(String vorlesung, int plaetze) {
		this.vorlesung = vorlesung;
		this.plaetze = plaetze;
	}
	
}
