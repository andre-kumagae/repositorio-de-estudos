package logica_de_programacao.m06_excecoes.aula02_excecoes_nao_verificadas;

import java.util.Scanner;

public class VerificaCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu CPF: ");
        String cpf = verificaCPF(scanner.nextLine());
        System.out.println(cpf);
    }

    public static String verificaCPF(String cpf) {
        try {
            if (cpf.equals("12345678900")) {
                throw new RuntimeException("CPF já cadastrado");
            } else {
                return "CPF válido. Usuário cadastrado";
            }
        } catch (RuntimeException e) {
            throw new RuntimeException("CPF já cadastrado: " + cpf);
        }
    }
}
