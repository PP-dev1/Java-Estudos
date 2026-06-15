package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Pedro", "Ana", "José");

        List<String> maiusculos = nomes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(maiusculos);
    }
}