package curso_programacao.inicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("João");
        list.add("Lucas");
        list.add("Carlos");
        list.add("Carla");
        list.add(2, "Marcos");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }

        list.remove(2);

        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("--------------------------------------");

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------------------------------");
        System.out.println("Index of Lucas: " + list.indexOf("Lucas"));

        System.out.println("--------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println("FindFirst: " + name);
    }
}
