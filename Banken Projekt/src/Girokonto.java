
public class Girokonto extends Konto {

	public Girokonto(String kontonummer, String blz, String name, Double guthaben, Double dispolimit, Double zinssatz) {
		super(kontonummer, blz, name, guthaben, dispolimit, zinssatz);
		// TODO Auto-generated constructor stub
	}


	@Override
	public boolean überweisen(String kontonnummer, String blz, String name, double betrag) {
		
		return false;
		// TODO Auto-generated method stub
		
	}
    public double einzahlen(double einzahlung) {
    	double neuesguthaben = getGuthaben() + einzahlung;
    	setGuthaben(neuesguthaben);
    	return neuesguthaben;
    }
    public double auszahlen(double ausgehzahlterbetrag) {
    	double neuesguthaben = getGuthaben() - ausgehzahlterbetrag;
    	if(-getDispoLimit() > neuesguthaben ) {
    		System.out.println("");
    		return getGuthaben();
    	}
    	
    	setGuthaben(neuesguthaben);
    	return neuesguthaben;
    }
	}


