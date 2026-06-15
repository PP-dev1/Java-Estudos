package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q15 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Code", "Stream", "API");

        Map<Integer, List<String>> agrupado = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupado);
    }
}