package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q11 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 2, 8, 2, 5, 10, 8);

        List<Integer> resultado = lista.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(resultado);
    }
}