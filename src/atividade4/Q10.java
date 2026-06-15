package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q10 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Pedro", 20),
                new Pessoa("Ana", 20),
                new Pessoa("Carlos", 25)
        );

        Map<Integer, List<Pessoa>> agrupado = pessoas.stream()
                .collect(Collectors.groupingBy(p -> p.idade));

        System.out.println(agrupado);
    }
}