package logica_de_programacao.m01_estruturas_sequenciais.aula_06_casting;

public class ConversaoDeTipos {
    public static void main(String[] args) {
        int numeroInteiro = 10;
        System.out.println("numeroInteiro = " + numeroInteiro);
        double numeroInteiroParaFlutuante = numeroInteiro;
        System.out.println("Numero inteiro convertido para flutuante: " + numeroInteiroParaFlutuante);
        double numeroFlutuante = 10.5;
        System.out.println("Numero flutuante: " + numeroFlutuante);
        int numeroFlutuanteParaInteiro = (int) numeroFlutuante;
        System.out.println("Numero flutuante convertido para inteiro: " + numeroFlutuanteParaInteiro);
        Integer numeroInteiroWrapper = 10;
        System.out.println("numeroInteiroWrapper = " + numeroInteiroWrapper);
        String numeroParaString = numeroInteiroWrapper.toString();
        System.out.println("numeroParaString = " + numeroParaString);
        String numeroEmTexto = "1234";
        System.out.println("numeroEmTexto = " + numeroEmTexto);
        int numeroEmTextoParaTipoInt = Integer.parseInt(numeroEmTexto);
        System.out.println("numeroEmTextoParaTipoInt = " + numeroEmTextoParaTipoInt);
        Integer numeroEmTextoParaWrapperInteger = Integer.valueOf(numeroEmTextoParaTipoInt);
        System.out.println("numeroEmTextoParaWrapperInteger = " + numeroEmTextoParaWrapperInteger);
    }
}
