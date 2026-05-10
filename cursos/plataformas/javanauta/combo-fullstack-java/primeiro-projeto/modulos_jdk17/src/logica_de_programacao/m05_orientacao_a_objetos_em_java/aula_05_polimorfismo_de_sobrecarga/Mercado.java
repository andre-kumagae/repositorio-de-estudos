package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_05_polimorfismo_de_sobrecarga;

public class Mercado {
    public static void main(String[] args) {
        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 7;
        Integer melancia = 5;

        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDouble = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata, cenoura, melancia);
        System.out.printf("%d\n%f\n%d", total, totalDouble, totalInteger);
    }
}
