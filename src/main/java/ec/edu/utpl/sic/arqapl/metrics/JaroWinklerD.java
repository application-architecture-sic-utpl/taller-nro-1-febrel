package ec.edu.utpl.sic.arqapl.metrics;
import org.apache.commons.text.similarity.JaroWinklerDistance;

public class JaroWinklerD implements Similaritable {

    @Override
    public double similarity(String text1, String text2) {
        var jaroWinkler = new JaroWinklerDistance();
        var similarity = jaroWinkler.apply(text1, text2);
        return similarity;
    }
}
