package atividade4;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList(
                "Java", "Programação", "Stream", "Código", "Computador"
        );

        long count = palavras.stream()
                .filter(p -> p.length() > 5)
                .count();

        System.out.println(count);
    }
}