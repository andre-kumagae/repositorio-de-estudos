package logica_de_programacao.m02_estruturas_condicionais.aula01_expresooes_comparativas;

public class ExpressoesComparativas {
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
