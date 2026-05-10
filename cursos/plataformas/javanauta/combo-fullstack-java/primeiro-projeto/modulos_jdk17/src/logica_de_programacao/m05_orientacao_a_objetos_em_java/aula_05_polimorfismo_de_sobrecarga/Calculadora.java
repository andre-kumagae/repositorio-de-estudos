package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_05_polimorfismo_de_sobrecarga;

public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static Integer somar(Integer a, Integer b, Integer c) {
        return a + b + c;
    }
}
