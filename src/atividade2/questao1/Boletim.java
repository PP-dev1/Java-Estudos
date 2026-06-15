package atividade2.questao1;

public class Boletim {
    private Aluno Aluno;
    private int nota1;
    private int nota2;

    public Boletim(Aluno aluno, int nota1, int nota2) {
        Aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Boletim() {
    }

    public Aluno getAluno() {
        return Aluno;
    }

    public void setAluno(Aluno aluno) {
        Aluno = aluno;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            System.out.println("Nota inválida!");
        }


    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String verificarAprovacao() {
        double media = calcularMedia();

        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
