package atividade2.questao2;

public class Produto {
    private String nome;
    private double preco;
    private int qtde;

    public Produto(String nome, double preco, int qtde) {
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
        this.preco = preco;
    } else{
            System.out.println("Preço inválido!");
        }
    }

    public int getQuantidade() {
        return qtde;
    }

    public void setQuantidade(int qtde) {
        if (qtde > 0){
        this.qtde = qtde;
        } else{
            System.out.println("Quantidade inválida!");
        }
    }
    public void adicionarEstoque(int quantidade){
        if (quantidade > 0) {
            qtde += quantidade;
        } else{
            System.out.println("Quantidade inválida!");
        }
    }
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= qtde) {
            qtde -= quantidade;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }
    public double calcularValorTotal() {
        return preco * qtde;
    }
}
