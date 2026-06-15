package atividade3;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data (dd/MM/yyyy): ");
        String texto = sc.nextLine();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false);

        try {
            Date data = formato.parse(texto);
            System.out.println("Data válida: " + data);
        } catch (Exception e) {
            System.out.println("Data inválida!");
        }

        sc.close();
    }
}
