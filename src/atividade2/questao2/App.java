package atividade2.questao2;

public class App {
    static void main(String[] args) {
        Produto p = new Produto("Chocolate", 10, 37);
        p.adicionarEstoque(5);
        p.removerEstoque(12);
        System.out.println("Produto: " + p.getNome());
        System.out.println("Estoque: " + p.getQuantidade());
        System.out.println("Valor Unitário: " + p.getPreco());
        System.out.println("Valor Total: " + p.calcularValorTotal());
    }
}
