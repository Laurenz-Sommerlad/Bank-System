
public class Sparbuch extends Konto{

	public Sparbuch(String kontonummer, String blz, String name, Double guthaben, Double dispolimit, Double zinssatz) {
		super(kontonummer, blz, name, guthaben, dispolimit, zinssatz);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean überweisen(String kontonnummer, String blz, String name, double betrag) {
		// TODO Auto-generated method stub
		return false;
	}

}
