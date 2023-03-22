package exerc3_figuras;

public class Circulo {
    double pi = Math.PI;
    double raio;

    double calcularArea() {
        return this.pi * (Math.pow(raio, 2));
    }
}
