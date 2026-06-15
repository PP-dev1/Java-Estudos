package atividade2.questao1;

public class App{
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Pedro");
        aluno.setMatricula(235341);
        Boletim boletim = new Boletim(); // aluno, 10, 6
        boletim.setAluno(aluno);
        boletim.setNota1(10);
        boletim.setNota2(6);

        System.out.println("Aluno: " + boletim.getAluno().getNome());
        System.out.println("Matrícula: " + boletim.getAluno().getMatricula());
        System.out.println("Média: " + boletim.calcularMedia());
        System.out.println("Situação: " + boletim.verificarAprovacao());
    }

}
