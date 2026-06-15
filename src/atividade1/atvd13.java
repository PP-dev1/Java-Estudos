package atividade1;

import java.util.Scanner;

public class atvd13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha;

        while (true) {
            System.out.print("Digite uma senha forte: ");
            senha = sc.nextLine();

            if (senha.length() < 8) {
                System.out.println("A senha deve ter no mínimo 8 caracteres.");
                continue;
            }

            boolean temNumero = false;
            boolean temMaiuscula = false;

            for (char c : senha.toCharArray()) {
                if (Character.isDigit(c)) {
                    temNumero = true;
                }
                if (Character.isUpperCase(c)) {
                    temMaiuscula = true;
                }
            }

            if (!temNumero) {
                System.out.println("A senha deve conter pelo menos 1 número.");
                continue;
            }

            if (!temMaiuscula) {
                System.out.println("A senha deve conter pelo menos 1 letra maiúscula.");
                continue;
            }

            System.out.println("Senha cadastrada com sucesso!");
            break;
        }
    }
}
