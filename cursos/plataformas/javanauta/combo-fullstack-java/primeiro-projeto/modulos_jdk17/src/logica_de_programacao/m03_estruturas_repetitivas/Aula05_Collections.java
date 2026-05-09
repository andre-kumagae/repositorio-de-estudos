package logica_de_programacao.m03_estruturas_repetitivas;

import java.util.ArrayList;
import java.util.List;

public class Aula05_Collections {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add(1,"Banana");
        for (String listaDeCompra : listaDeCompras) {
            System.out.println(listaDeCompra);
        }
        System.out.printf("Na posição %d eu tenho o item %s\n",listaDeCompras.indexOf("Banana"),listaDeCompras.get(1));
        listaDeCompras.remove("Sabão em pó");
        for (String listaDeCompra : listaDeCompras) {
            System.out.println(listaDeCompra);
        }
        System.out.printf("""
                Lista vazia? %b
                Tamanho: %d
                """,listaDeCompras.isEmpty(),listaDeCompras.size());
//        listaDeCompras.clear();
//        System.out.println(listaDeCompras.isEmpty());
        listaDeCompras.forEach(p -> System.out.println(p));
    }
}
