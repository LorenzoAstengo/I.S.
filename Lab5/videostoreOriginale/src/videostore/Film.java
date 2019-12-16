package videostore;

// 1.0
public class Film {
    
	public static final int BAMBINI = 2;
    public static final int REGOLARE = 0;
    public static final int NOVITA = 1;
    private Prezzo prezzo = null; 
    
    private String _titolo;

    public Film(String titolo, int codicePrezzo) {
        _titolo = titolo;
        setCodicePrezzo(codicePrezzo);
    }

    public int getCodicePrezzo() {
        return prezzo.getCodicePrezzo();
    }

    public void setCodicePrezzo(int arg) {
    	
    	switch(arg) {
    	case REGOLARE:
            prezzo = new PrezzoRegolare();
            break;
        case NOVITA:
        	prezzo = new PrezzoNovita();
            break;
        case BAMBINI:
        	prezzo = new PrezzoBambini();
            break; 
    	}
    	
    }

    public String getTitolo() {
        return _titolo;
    }
    
    public double getAmmontare(int giorniNoleggio) {
    	
    	return prezzo.getAmmontare(giorniNoleggio);
    	
    }
	
}
