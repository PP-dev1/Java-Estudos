package atividade4;
import java.util.*;
import java.util.stream.*;

class Pedido {
    int id;
    double valor;

    Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }
}

public class Q13 {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
                new Pedido(1, 100.0),
                new Pedido(2, 250.0),
                new Pedido(3, 50.0)
        );

        double total = pedidos.stream()
                .map(p -> p.valor)
                .reduce(0.0, Double::sum);

        System.out.println(total);
    }
}