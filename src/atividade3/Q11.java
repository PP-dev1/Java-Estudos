package atividade3;

import java.time.LocalDate;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data (AAAA-MM-DD): ");
        String texto = sc.nextLine();

        try {
            LocalDate data = LocalDate.parse(texto);
            // System.out.println(data);
            System.out.println("Data válida: " + data);
        } catch (Exception e) {
            System.out.println("Data inválida!");
        }

        sc.close();
    }
}
