package videostore;

public abstract class Prezzo {

    private int _codicePrezzo;
   

	abstract int getCodicePrezzo();
	
	abstract double getAmmontare(int giorniNoleggio);
    	
	
}
