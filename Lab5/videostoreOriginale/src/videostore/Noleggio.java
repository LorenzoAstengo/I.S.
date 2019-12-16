package videostore;

// 1.0
public class Noleggio {
    
	private Film _film;
    private int _giorniNoleggio;

    public Noleggio(Film film, int giorniNoleggio) {
        _film = film;
        _giorniNoleggio = giorniNoleggio;
    }

    public int getGiorniNoleggio() {
        return _giorniNoleggio;
    }

    public Film getFilm() {
        return _film;
    }
    
    //metodo estratto per isolare lo switch
    public double getAmmontare() {
    	
    	/*double risultato = 0;
    	
    	switch (this.getFilm().getCodicePrezzo()) {
        case Film.REGOLARE:
            risultato += 2;
            if (this.getGiorniNoleggio() > 2)
                risultato += (this.getGiorniNoleggio() - 2) * 1.5;
            break;
        case Film.NOVITA:
            risultato += this.getGiorniNoleggio() * 3;
            break;
        case Film.BAMBINI:
            risultato += 1.5;
            if (this.getGiorniNoleggio() > 3)
                risultato += (this.getGiorniNoleggio() - 3) * 1.5;
            break;
        }
    	
    	return risultato;*/
    	
    	return _film.getAmmontare(getGiorniNoleggio());
    	
    }
}
