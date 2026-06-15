package atividade1;

import java.util.Scanner;

public class atvd12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Valor para depósito: ");
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    break;

                case 3:
                    System.out.print("Valor para saque: ");
                    double saque = sc.nextDouble();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                    }
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

    }
}