package atividade4;
import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        boolean todosPositivos = lista.stream()
                .allMatch(n -> n > 0);

        System.out.println(todosPositivos);
    }
}