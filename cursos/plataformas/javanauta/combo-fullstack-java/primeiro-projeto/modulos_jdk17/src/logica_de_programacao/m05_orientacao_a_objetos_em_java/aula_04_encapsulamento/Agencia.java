package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_04_encapsulamento;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Carlos", 500);
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);
        System.out.println(minhaConta.getTitular());
        System.out.println(minhaConta.getSaldo());
        System.out.println(minhaConta);
    }
}
