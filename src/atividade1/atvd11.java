package atividade1;

import java.util.Scanner;

public class atvd11{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        int quantidade = 0;
        double peso, maior = 0, menor = Double.MAX_VALUE;

        do {
            System.out.println("\n1. Cadastrar Peso");
            System.out.println("2. Finalizar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1){
                System.out.print("Digite o peso do animal: ");
                peso = sc.nextDouble();
                quantidade++;

                if (peso > maior) {
                    maior = peso;
                }

                if (peso < menor) {
                    menor = peso;
                }
            }

        } while (opcao != 2);

        System.out.println("\nQuantidade de animais: " + quantidade);

        if (quantidade > 0) {
            System.out.println("Maior peso: " + maior);
            System.out.println("Menor peso: " + menor);
        }
    }
}