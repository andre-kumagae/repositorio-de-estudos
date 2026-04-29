package logica_de_programacao.m02_estruturas_condicionais;

public class Aula01_ExpressoesComparativas {
    public static void main(String[] args) {
        int pao = 10;
        int acucar = 20;

        System.out.printf("""
                pao == acucar: %b
                pao != acucar: %b
                pao > acucar: %b
                pao < acucar: %b
                pao >= acucar: %b
                pao <= acucar: %b
                """, pao == acucar, pao != acucar, pao > acucar, pao < acucar, pao >= acucar, pao <= acucar);
    }
}
