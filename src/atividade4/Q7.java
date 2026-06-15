package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q7 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        int soma = lista.stream()
                .reduce(0, Integer::sum);

        System.out.println(soma);
    }
}