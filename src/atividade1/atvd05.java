package atividade1;

import java.util.Scanner;

public class atvd05 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System. out. print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System. out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o terceino número: ");
        int n3 = sc.nextInt();
        if (n1 >= n2 && n1>= n3) {
            System.out.println("o maior número é: "+ n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("o maion número é: " + n2);
        }else {
                System. out. println(" maior número é: "+ n3);
        }
    }
}
