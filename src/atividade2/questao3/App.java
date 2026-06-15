package atividade2.questao3;

public class App {
    static void main(String[] args) {
        Funcionario f = new Funcionario();
        Vendedor v = new Vendedor(0.03);
        Gerente g = new Gerente(0.05);
        v.setNome("Pedro");
        v.setSalario(1612);
        g.setNome("Paulo");
        g.setSalario(1612);
        f.aplicarAumento(v.percentual);
        f.aplicarAumento(g.percentual);
        System.out.println("Vendedor: " + v.getNome() + " - Salário Base: " + v.getSalario() + " - Salário Total: "+ v.aplicarAumento(0.03));
        System.out.println("Gerente: " + g.getNome() + " - Salário Base: " + g.getSalario() + " - Salário Total: "+ g.aplicarAumento(0.05));
    }
}
