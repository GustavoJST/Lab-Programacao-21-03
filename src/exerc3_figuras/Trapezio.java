package exerc3_figuras;

public class Trapezio {
    double baseMaior;
    double baseMenor;
    double altura;

    double calcularArea() {
        return (((this.baseMaior + this.baseMenor) / 2) * this.altura);
    }
}
