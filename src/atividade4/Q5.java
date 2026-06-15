package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q5 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList(
                "Pedro", "Ana", "José", "Maria",
                "Antonia", "Augusto", "Carlos", "Francisco"
        );

        List<String> resultado = nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
}