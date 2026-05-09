package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_01_objeto;

public class PlantaCasa {
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    protected void construir() {
        System.out.printf("""
                A casa foi construída. As características são:
                Metragem: %d
                Número de quartos: %d
                Número de banheiros: %d
                Material: %s
                """, metragem, numeroQuartos, numeroBanheiros, material);
    }

    public int somarMetragem() {
        return metragem * numeroBanheiros * numeroQuartos;
    }

    public void alterarCaracteristicas(int metros, int quartos, int banheiros, String mat) {
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiros;
        material = mat;
    }

    public void pintar() {
        System.out.println("A casa foi pintada de: "+cor);
    }
}
