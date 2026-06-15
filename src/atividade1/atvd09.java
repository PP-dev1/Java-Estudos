package atividade1;

import java.util.Scanner;

public class atvd09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número (1 a 10): ");
        int num = sc.nextInt();

        System.out.println("\nTabuada do " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
