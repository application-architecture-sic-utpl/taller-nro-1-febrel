package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetApplyCosine;
import ec.edu.utpl.sic.arqapl.TweetApplyJaroWinkler;
import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;
import org.junit.Test;

public class TweetSimilarityTest {

    public TweetSimilarityTest() {
    }

    @Test
    public void similarJaccard() {
        var tweet1 = "#Hola mundo";
        var tweet2 = "#Hola mundo";
        TweetSimilarity ts = new TweetSimilarity();
            assertEquals(1.0, ts.similarity(tweet1, tweet2), 1e-5);

    }

    @Test
    public void similarCosine() {
        String tweet1 = "#PENNSYLVANIA";
        String tweet2 = "#PENNSYLVANIA";
        TweetApplyCosine ts= new TweetApplyCosine();
        assertEquals(1.0, ts.similarity(tweet1, tweet2), 1e-5);
    }


    @Test
    public void similarJaroWinklerDistance() {
        String tweet1 = "#John Horn";
        String tweet2 = "#John Hornt"; // Admite 1 caracterer diferente
        TweetApplyJaroWinkler ts = new TweetApplyJaroWinkler();
        assertEquals(0.9818181818181818d, ts.similarity(tweet1, tweet2), 1e-5);
    }

}
