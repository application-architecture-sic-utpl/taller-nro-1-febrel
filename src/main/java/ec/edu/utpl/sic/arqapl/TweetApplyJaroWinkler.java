package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.metrics.JaroWinklerD;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

public class TweetApplyJaroWinkler {

    // Variable
    private Similaritable algorithm;

    public TweetApplyJaroWinkler() {
        algorithm = new JaroWinklerD();

    }


    // Sobrecarga de Constructores
    public TweetApplyJaroWinkler(Similaritable algorithm) {
        this.algorithm = algorithm;
    }


    // Metodos - Funciones
    public double similarity(String tweet1, String tweet2) {
        return algorithm.similarity(tweet1, tweet2);

    }
}
