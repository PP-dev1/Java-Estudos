package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q16 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Pedro", 20),
                new Pessoa("Ana", 17),
                new Pessoa("Carlos", 25)
        );

        Map<Boolean, List<Pessoa>> particionado = pessoas.stream()
                .collect(Collectors.partitioningBy(p -> p.idade >= 18));

        System.out.println(particionado);
    }
}