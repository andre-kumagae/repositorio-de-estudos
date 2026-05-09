package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_02_metodos_estaticos;

public class Main {
    public static void main(String[] args) {
        Integer a = 2, b = 3;
        Integer c = Util.soma(a, b);
        System.out.println(c+"\n"+c.getClass());
        String d = Util.converteParaString(c);
        System.out.println(d+"\n"+d.getClass());
    }
}
