package atividade1;

import java.util.Scanner;

public class atvd03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Coloque uma opereção(+,-,*,/): ");
        String operator = sc.next();
        double result;

        switch (operator){
            case "+":
                result = n1 + n2;
                System.out.println("A soma de: "+ n1 + " + " + n2 + " é " + result);
                break;

            case "-":
                result = n1 - n2;
                System.out.println("A subtração de: "+ n1 + " - " + n2 + " é " + result);
                break;

            case "*":
                result = n1 * n2;
                System.out.println("A multiplicação de: "+ n1 + " * " + n2 + " é " + result);
                break;

            case "/":
                result = n1 / n2;
                System.out.println("A divisão de: "+ n1 + " / " + n2 + " é " + result);
                break;

            default:
                System.out.println("Você não selecionou nenhum operador válido! ");
        }
    }
}

