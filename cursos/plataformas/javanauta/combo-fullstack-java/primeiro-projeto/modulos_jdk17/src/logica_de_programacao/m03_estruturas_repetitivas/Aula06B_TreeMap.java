package logica_de_programacao.m03_estruturas_repetitivas;

import java.util.Map;
import java.util.TreeMap;

public class Aula06B_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
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
        System.out.printf("\nPrimeira chave: %s\nÚltima chave: %s",notasAlunos.firstKey(),notasAlunos.lastKey());
    }
}
