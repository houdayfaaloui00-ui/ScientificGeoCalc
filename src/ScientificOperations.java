public class ScientificOperations {
    public double logNaturel(double val) {
        if (val <= 0) {
            throw new IllegalArgumentException("Valeur strictement positive requise");
        }
        return Math.log(val);
    }
    public double exponentielle(double val) {
        return Math.exp(val);
    }
}