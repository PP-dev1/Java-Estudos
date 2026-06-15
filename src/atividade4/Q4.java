package atividade4;
import java.util.*;
import java.util.stream.*;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(4,25,32,5,45,13,8,77,58,2,52);

        long count = lista.stream()
                .filter(n -> n > 10)
                .count();

        System.out.println(count);
    }
}