import java.util.*;
public class Kunde {

private List<Konto> konten;
private String kundennummer;
private String name;
private String vorname;

public Kunde(String name, String vorname, String kundennummer) {
	konten = new ArrayList<Konto>();
	this.kundennummer = kundennummer;
	this.vorname = vorname;
	this.name = name;
}

public List<Konto> getKonten() {
	return this.konten;
}
public String getKundennummer() {
	return this.kundennummer;
}
public String getName() {
	return this.name;
}
public String getVorname() {
	return this.vorname;
}
public void setKundennummer(String kundennummer) {
	this.kundennummer = kundennummer;
}
public void setName(String name) {
	this.name = name;
}
public void setVorname(String vorname) {
	this.vorname = vorname;
}
public void setKonten(List<Konto> konten) {
	this.konten = konten;
}
}