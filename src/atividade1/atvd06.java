package atividade1;

import java.util.Scanner;

public class atvd06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        double weight = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double height = sc.nextDouble();
        double imc = weight / (height * height);
        if (imc <= 18.5) {
            System.out.println("Você está abaixo do peso!");
        } else if (imc < 25) {
            System.out.println("Você está no peso ideal!");
        }else if (imc < 30) {
            System.out.println("Você está com sobrepeso!");
        }else {
            System.out.println("Você está obeso!");
        }
    }
}
