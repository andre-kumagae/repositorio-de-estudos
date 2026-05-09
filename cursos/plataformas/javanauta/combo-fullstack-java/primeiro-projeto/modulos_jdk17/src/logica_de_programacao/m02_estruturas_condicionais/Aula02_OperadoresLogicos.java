package logica_de_programacao.m02_estruturas_condicionais;

public class Aula02_OperadoresLogicos {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(!verdadeiro);

        System.out.println("\nTABELA VERDADE - E");
        System.out.println("V && V = " + (verdadeiro && verdadeiro));
        System.out.println("F && F = " + (falso && falso));
        System.out.println("V && F = " + (verdadeiro && falso));
        System.out.println("F && V = " + (falso && verdadeiro));
        System.out.println("\nTABELA VERDADE - OU");
        System.out.println("V || V = " + (verdadeiro || verdadeiro));
        System.out.println("F || F = " + (falso || falso));
        System.out.println("V || F = " + (verdadeiro || falso));
        System.out.println("F || V = " + (falso || verdadeiro));
        System.out.println("\nTABELA VERDADE - OU EXCLUSIVO");
        System.out.println("V ^ V = " + (verdadeiro ^ verdadeiro));
        System.out.println("F ^ F = " + (falso ^ falso));
        System.out.println("V ^ F = " + (verdadeiro ^ falso));
        System.out.println("F ^ V = " + (falso ^ verdadeiro));
    }
}
