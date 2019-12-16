package videostore;
import java.util.*;

// 1.0
public class Cliente {
    
	private String _nome;
    private List<Noleggio> _noleggi = new ArrayList<Noleggio>();

    public Cliente (String nome) {
        _nome = nome;
    }

    public void addNoleggio(Noleggio arg) {
        _noleggi.add(arg);
    }
    
    public String getNome(){
        return _nome;
    }
    
    private double ammontarePer(Noleggio noleggio) {
    	return noleggio.getAmmontare();
    }
    
    private double getAmmontareTotale() {
    	
    	Iterator<Noleggio> noleggi = _noleggi.iterator();
    	double ammontareTotale = 0;
    	
        while (noleggi.hasNext()) {
        	
            Noleggio ognuno = (Noleggio) noleggi.next();
            ammontareTotale += ammontarePer(ognuno);
            
        }
        
        return ammontareTotale;
    	
    }
  

    public String rendiconto() {
       
    	
        Iterator<Noleggio> noleggi = _noleggi.iterator();
        String r = "Rendiconto noleggi per " + getNome() + " ";
        
        
        while (noleggi.hasNext()) {
            
            Noleggio ognuno = (Noleggio) noleggi.next();
                    
            r += ognuno.getFilm().getTitolo() + " " +
                    String.valueOf(ammontarePer(ognuno))+ " ";
               
             
            
            
        } // while

        // aggiungi totale
    
        r += "L'ammontare dovuto e' " + String.valueOf(getAmmontareTotale());
        return r;
    }
}
