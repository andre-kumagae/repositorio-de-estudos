package logica_de_programacao.m01_estruturas_sequenciais;

public class Aula03_OperadoresAritmeticos {
    public static void main(String[] args) {
        double pao = 9.50;
        double queijo = 7.00;
        double acucar = 1.00;
        double desconto = 5.00;
        int totalDeDiasNoMes = 30;
        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalDividido = valorTotalComDesconto / 2;
        double valorTotalMensal = valorTotalComDesconto * totalDeDiasNoMes;
        System.out.println("Valor total = R$ " + valorTotal);
        System.out.println("Valor total com o desconto = R$ " + valorTotalComDesconto);
        System.out.println("Valor total dividido = R$ " + valorTotalDividido);
        System.out.println("Valor total mensal = R$ " + valorTotalMensal);
    }
}
