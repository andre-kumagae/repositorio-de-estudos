package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_01_objeto;

public class Casa {
    public static void main(String[] args) {
        PlantaCasa casa = new PlantaCasa();
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";
        casa.construir();
        casa.pintar();
    }
}
