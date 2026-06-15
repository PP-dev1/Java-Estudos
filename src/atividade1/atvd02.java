package atividade1;

import java.util.Scanner;

public class atvd02 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu número: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.print("O número "+num+ " é par!");
        }else{
            System.out.print("O número "+num+ " é ímpar!");
        }
    }
}