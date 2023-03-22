package exerc2_fracao;

public class Fracao {
    int numerador;
    int denominador;

    void multiplicarFracao(int numerador, int denomidador) {
        int resultadoNumerador = this.numerador * numerador;
        int resultadoDenominador = this.denominador * denominador;
        System.out.printf("Resultado da multiplicação de frações: %d/%d\n", resultadoNumerador, resultadoDenominador);
    }
}
