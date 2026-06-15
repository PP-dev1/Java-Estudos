package atividade1;

import java.util.Scanner;

public class atvd04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua nota de 0 a 10: ");
        int nota = sc.nextInt();
        if (nota >=7){
            System.out.print("Aprovado!");
        }else if (nota >= 5){
            System.out.print("recuperação!");
        }else{
            System.out.print("Reprovado!");
        }
    }
}
