package logica_de_programacao.m03_estruturas_repetitivas;

import java.util.HashMap;
import java.util.Map;

public class Aula06A_HashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 10.0);
        notasAlunos.put("Matheus", 8.0);
        notasAlunos.put("Maria", 9.9);
        System.out.println(notasAlunos.get("Alice"));

        System.out.println("Iterando como um String");
        // atalho: iter
        // keySet retorna um Set<K>
        for (String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        System.out.println("Iterando como um Map");
        // entrySET retorna um Map<K,V>
        // atalho: itm
        for (Map.Entry<String, Double> stringDoubleEntry : notasAlunos.entrySet()) {
            String key = stringDoubleEntry.getKey();
            Double value = stringDoubleEntry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
