package AV1.QChatGPT;

public class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome + '\n' +
                "Idade: " + idade);
    }
}
