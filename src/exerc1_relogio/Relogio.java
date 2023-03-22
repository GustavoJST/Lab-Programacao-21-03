package exerc1_relogio;

public class Relogio {
    Ponteiro ponteiroHora = new Ponteiro();
    Ponteiro ponteiroMinuto = new Ponteiro();
    Ponteiro ponteiroSegundo = new Ponteiro();

    void acertarRelogio(int hora, int minuto, int segundo) {
        this.ponteiroHora.posicao = hora;
        this.ponteiroMinuto.posicao = (minuto / 5);
        this.ponteiroSegundo.posicao = (segundo / 5);
    }

    void lerHora() {
        System.out.printf("A hora atual com base nos ponteiros é: %d\n",
                this.ponteiroHora.posicao);
    }

    void lerMinuto() {
        System.out.printf("O minuto atual com base nos ponteiros é: %d\n",
                (this.ponteiroMinuto.posicao * 5));
    }

    void lerSegundo() {
        System.out.printf("O minuto atual com base nos ponteiros é: %d\n",
                (this.ponteiroSegundo.posicao * 5));
    }
}
