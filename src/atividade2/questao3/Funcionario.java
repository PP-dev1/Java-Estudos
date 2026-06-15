package atividade2.questao3;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 1.621) {
            this.salario = salario;
        } else{
            System.out.println("Salário não pode ser menor que o mínimo.");
        }
    }
    public double aplicarAumento(double percentual){
        return salario += salario * percentual;
    }

}
