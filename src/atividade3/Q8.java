package atividade3;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String entrada = sc.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número convertido com sucesso: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: não foi possível fazer a conversão.");
        }

        sc.close();
    }

}
