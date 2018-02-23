import java.util.ArrayList;
import java.util.List;

public class Bank {
	
private String name;
private List<Konto> konten;
private List<Kunde> kunden;
private String blz;

public Bank(String name, String blz) {
	konten = new ArrayList<Konto>();
	kunden = new ArrayList<Kunde>();
	this.name = name;
	this.blz = blz;
}

public List<Kunde> getKunden() {
	return this.kunden;
}
public void setKunden(List<Kunde> kunden) {
	this.kunden = kunden;
}
public List<Konto> getKonten() {
	return this.konten;
}
public void setKonten(List<Konto> konten) {
	this.konten = konten;
}
public String getName() {
	return this.name;
}
public void setName(String name) {
	this.name = name;
}
public void addKunde(Kunde kunde) {
	kunden.add(kunde);
}

public String getBlz() {
	return blz;
}

public void setBlz(String blz) {
	this.blz = blz;
}

}
