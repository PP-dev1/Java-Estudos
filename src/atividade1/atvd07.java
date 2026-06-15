package atividade1;

import java.util.Scanner;

public class atvd07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira seu nome de usuário: ");
        String user = sc.nextLine();
        System.out.print("Digite sua senha: ");
        String password = sc.nextLine();
        if (user.equals("admin") && password.equals("1234")) {
            System.out.println("Login bem-sucedido! ");
        } else {
            System.out.println("Usuário ou senha incorretos! ");
        }
    }
}
