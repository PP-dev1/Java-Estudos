package atividade3;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite algo : ");
        String texto = sc.nextLine();

        texto = null;

        try {

            System.out.println("Tamanho: " + texto.length());
        } catch (NullPointerException e) {

            System.out.println("Erro: string nula!");
        }

        sc.close();
    }
}
