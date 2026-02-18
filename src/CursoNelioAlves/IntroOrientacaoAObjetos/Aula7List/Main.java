package CursoNelioAlves.IntroOrientacaoAObjetos.Aula7List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Uma lista não aceita tipos primitivos
        List<String> lista = new ArrayList<>();//List é uma interface, então eu preciso instanciar uma classe que implementa essa interface, por isso o new ArrayList
        lista.add("Maria");
        lista.add("Erick");
        lista.add("Bob");
        lista.add("Marcelo");
        lista.add("Ana");
        lista.add("Armando");
        lista.add(2,"Naruto");
        System.out.println(lista.size());

        System.out.println("-------------Original---------------");
        for(String nomes: lista){
            System.out.println(nomes);
        }
        System.out.println("----------------------------");
        lista.remove(1);

        for(String nomes: lista){
            System.out.println(nomes);
        }

        System.out.println("-------------Predicado---------------");
        lista.removeIf(x -> x.charAt(0) == 'M');//Remove todos que começam com a letra M
        for(String nomes: lista){
            System.out.println(nomes);
        }
        System.out.println("-------------Posição de um elemento---------------");
        System.out.println("Index of Naruto: "+ lista.indexOf("Naruto"));
        System.out.println("Index of Erick: "+lista.indexOf("Erick"));

        System.out.println("-------------Filtrar lista com quem começa com A---------------");
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').toList();
        for(String nomes: result){
            System.out.println(nomes);
        }
        System.out.println("-------------Encontrando o primeiro elemento especifico---------------");
        String name = lista.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
        String name2 = lista.stream().filter(x -> x.charAt(0)=='Z').findFirst().orElse(null);
        System.out.println(name);
        System.out.println(name2);

    }
}
