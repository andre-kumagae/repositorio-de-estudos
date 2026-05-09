package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_03_interface;

public class PlantaCasaComInterface implements Construcao{
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;
    @Override
    public void construir() {
        System.out.printf("""
                A casa foi construída. As características são:
                Metragem: %d
                Número de quartos: %d
                Número de banheiros: %d
                Material: %s
                """, metragem, numeroQuartos, numeroBanheiros, material);
    }

    @Override
    public void pintar(String cor) {
        System.out.println("A casa foi pintada de: "+cor);
    }

    @Override
    public int calcularCustoDaConstrucao(int custoPorMetro) {
        return metragem * numeroBanheiros * numeroQuartos;
    }
}
