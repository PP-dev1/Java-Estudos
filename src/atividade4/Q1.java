package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(4,25,32,78,45,13,10,77,58,61,52);

        List<Integer> pares = lista.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares);
    }
}