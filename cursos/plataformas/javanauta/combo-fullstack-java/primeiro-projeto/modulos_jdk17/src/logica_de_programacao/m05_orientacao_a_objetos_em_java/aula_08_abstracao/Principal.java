package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_08_abstracao;

public class Principal {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("Rua das Flores", "Sao Paulo", "1042", "SP", "0999-111", "Joao", "1111111", "Vendedor");
        Cliente joana = new Cliente("Rua das Rosas", "Rio de Janeiro", "RJ", "08811222", "Joana", "222222");
        System.out.println(joao);
        joao.mostrarEndereco();
        System.out.println(joana);
        joana.mostrarEndereco();
    }

}
