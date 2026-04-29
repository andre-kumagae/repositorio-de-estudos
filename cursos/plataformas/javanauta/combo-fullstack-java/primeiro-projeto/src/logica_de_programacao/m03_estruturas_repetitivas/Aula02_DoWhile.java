package logica_de_programacao.m03_estruturas_repetitivas;

public class Aula02_DoWhile {
    public static void main(String[] args) {
        int contador = 0;
        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador < 5);
    }
}
