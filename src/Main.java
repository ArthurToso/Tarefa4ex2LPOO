public class Main {
    public static void main(String[] args) {
        Quadrado[] quad = new Quadrado[2];
        quad[0] = new Quadrado(2.0);
        quad[1] = new Quadrado(5.0);

        Circunferencia[] circ = new Circunferencia[2];
        circ[0] = new Circunferencia(3.0);
        circ[1] = new Circunferencia(2.0);

        Superficie[] superf = new Superficie[quad.length + circ.length];
        superf[0] = quad[0];
        superf[1] = quad[1];
        superf[2] = circ[0];
        superf[3] = circ[1];

        SomaArea soma = new SomaArea();

        System.out.println("Área dos quadrados: " + soma.calculaArea(quad));
        System.out.println("Área das circunferências: " + soma.calculaArea(circ));
        System.out.println("Soma de todas as áreas: " + soma.calculaArea(superf));
    }
}