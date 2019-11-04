package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.metrics.Cosine;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;


public class TweetApplyCosine {

    // Variables
    private Similaritable algorithm;

    // Sobrecarga de Constructores

    public TweetApplyCosine(){
        algorithm = new Cosine();
    }

    public TweetApplyCosine(Similaritable algorithm){
        this.algorithm = algorithm;
    }

    // Metodos - Funciones
    public double similarity(String tweet1, String tweet2) {
        return algorithm.similarity(tweet1,tweet2);
    }
}
