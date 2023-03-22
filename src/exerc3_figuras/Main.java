package exerc3_figuras;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.aresta = 5;
        double areaForma = quadrado.calcularArea();
        System.out.println(areaForma);
    }

}
