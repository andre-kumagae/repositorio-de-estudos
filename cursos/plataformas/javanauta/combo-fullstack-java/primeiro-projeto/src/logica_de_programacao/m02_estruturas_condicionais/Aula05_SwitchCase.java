package logica_de_programacao.m02_estruturas_condicionais;

public class Aula05_SwitchCase {
    public static void main(String[] args) {
        int numeroDoDia = 5;

        // Forma antiga
//        switch (numeroDoDia) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//        }

        String diaDaSemana = switch (numeroDoDia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terça";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sábado";
            default -> "Dia inválido";
        };
        System.out.println(diaDaSemana);
    }
}
