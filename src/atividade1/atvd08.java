package atividade1;

import java.util.Scanner;

public class atvd08 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Insira o tipo de combustível (G ou A): ");
        String combustivel = sc.nextLine();
        double preco;
        if (combustivel.equalsIgnoreCase("G")){
            preco = 5.50;
        }
        else if(combustivel.equalsIgnoreCase("A")){
            preco = 4.00;
        }else{
            System.out.println("Tipo de combustível inválido!");
            return;
        }
        System.out.println("Digite a quantidade em Litros: ");
        double qtd = sc.nextInt();

        double valor_total;
        valor_total = qtd * preco;
        System.out.println("Valor total: " + valor_total);
    }
}
