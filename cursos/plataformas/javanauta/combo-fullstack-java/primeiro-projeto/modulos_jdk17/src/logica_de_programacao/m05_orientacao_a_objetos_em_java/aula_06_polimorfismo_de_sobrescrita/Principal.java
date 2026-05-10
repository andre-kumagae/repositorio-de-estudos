package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_06_polimorfismo_de_sobrescrita;

public class Principal {
    public static void main(String[] args) {
        Transporte transporte = new Transporte();
        transporte.mover();
        Carro fusca = new Carro();
        fusca.mover();
    }
}
