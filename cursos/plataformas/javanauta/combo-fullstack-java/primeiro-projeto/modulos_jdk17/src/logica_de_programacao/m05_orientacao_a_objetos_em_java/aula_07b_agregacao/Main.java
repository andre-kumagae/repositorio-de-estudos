package logica_de_programacao.m05_orientacao_a_objetos_em_java.aula_07b_agregacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Funcionarios joao = new Funcionarios("Joao");
        Funcionarios joana = new Funcionarios("Jooana");
        Funcionarios matheus = new Funcionarios("Matheus");
        List<Funcionarios> listaDeFuncionarios = new ArrayList<>();
        listaDeFuncionarios.add(joana);
        listaDeFuncionarios.add(joao);
        listaDeFuncionarios.add(matheus);
        Departamento ti = new Departamento("TI", listaDeFuncionarios);
        ti.mostrarFuncionarios();

        Departamento marketing = new Departamento("Marketing", Collections.emptyList());
        marketing.mostrarFuncionarios();
    }
}
