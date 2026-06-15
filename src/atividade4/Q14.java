package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q14 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(10, 20, 30, 40, 50);

        int segundoMaior = lista.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println(segundoMaior);
    }
}