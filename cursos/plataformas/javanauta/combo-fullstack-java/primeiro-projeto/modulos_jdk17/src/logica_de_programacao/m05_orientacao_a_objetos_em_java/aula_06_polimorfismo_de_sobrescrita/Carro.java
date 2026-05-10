package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_06_polimorfismo_de_sobrescrita;

public class Carro extends Transporte{
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }
}
