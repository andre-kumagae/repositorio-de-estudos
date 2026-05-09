package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_01_objeto;

public class PlantaCasa {
    int metragem;
    int numeroQuartos;
    int numeroBanheiros;
    String cor;
    String material;

    public void construir() {
        System.out.printf("""
                A casa foi construída. As características são:
                Metragem: %d
                Número de quartos: %d
                Número de banheiros: %d
                Material: %s
                """, metragem, numeroQuartos, numeroBanheiros, material);
    }

    public void pintar() {
        System.out.println("A casa foi pintada de: "+cor);
    }
}
