package AV1.QChatGPT;

public class Aluno extends Pessoa{

    public int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Matrícula: " + matricula);
    }

}
