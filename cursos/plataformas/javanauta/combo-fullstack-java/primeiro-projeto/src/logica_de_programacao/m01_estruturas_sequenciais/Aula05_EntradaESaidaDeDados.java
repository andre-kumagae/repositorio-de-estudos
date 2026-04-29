package logica_de_programacao.m01_estruturas_sequenciais;

import java.util.Scanner;

public class Aula05_EntradaESaidaDeDados {
    public static void main(String[] args) {
        System.out.println("Impressão pulando a linha");
        System.out.print("Impressão na mesma linha");
        System.out.printf("%n%40s","Impressão formatada");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nOlá! Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Você está empregado?: ");
        boolean empregado = scanner.nextBoolean();
        System.out.printf("Olá! Sou o %s, tenho %d anos e minha situação de emprego é: %b",nome,idade,empregado);

    }
}
