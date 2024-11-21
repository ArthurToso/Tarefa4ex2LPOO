public class SomaArea {
    public double calculaArea(Superficie[] superf) {
        double soma = 0;
        for (Superficie s : superf) {
            soma += s.area();
        }
        return soma;
    }
}
