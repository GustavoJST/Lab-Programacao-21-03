package exerc1_relogio;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.acertarRelogio(6, 25, 15);
        relogio.lerHora();
        relogio.lerMinuto();
        relogio.lerSegundo();
    }
}
