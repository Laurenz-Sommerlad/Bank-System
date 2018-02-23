import java.util.ArrayList;

public abstract class Konto {
private String kontonummer;
private String blz;
private String name;
private Double guthaben;
private Double dispolimit;
private Double zinssatz;

public Konto(String kontonummer, String blz, String name, Double guthaben, Double dispolimit, Double zinssatz) {
	this.kontonummer = kontonummer;
	this.blz = blz;
	this.name = name;
	this.guthaben = guthaben;
	this.dispolimit = dispolimit;
	this.zinssatz = zinssatz;
}

public String getKontonummer() {
	return this.kontonummer;
}
public String getBLZ() {
	return this.blz;
}
public String getName() {
	return this.name;
}
public Double getGuthaben() {
	return this.guthaben;
}
public Double getDispoLimit() {
	return this.dispolimit;
}
public Double getZinssatz() {
	return this.zinssatz;
}
public void setKontonummer(String kontonummer) {
	this.kontonummer = kontonummer;
}
public void setBLZ(String blz) {
	this.blz = blz;
}
public void setName(String name) {
	this.name = name;
}
public void setGuthaben(Double guthaben) {
	this.guthaben = guthaben;
}
public void setDispoLimit(Double dispolimit) {
	this.dispolimit = dispolimit;
}
public void setZinssatz(Double zinssatz) {
	this.zinssatz = zinssatz;
}

public abstract boolean überweisen(String kontonnummer, String blz, String name, double betrag);

}
