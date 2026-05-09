package logica_de_programacao.m03_estruturas_repetitivas;

public class Aula04_Arrays {
    public static void main(String[] args) {
//        Declaração de Array
        int[] numeros = {10, 20, 30, 50, 1};
//        Inicialização
        String[] frutas;
        frutas = new String[]{"Maçã", "Morango", "Abacaxi"};
        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 250.00;
        salarios[4] = 100.00;
        int i = 0;
        for (double salario : salarios) {
            System.out.printf("Salário #%d = %5.2f\n", i, salario);
            i++;
        }
        salarios[2] = 250.00;
        System.out.println(salarios[2]);
    }
}
