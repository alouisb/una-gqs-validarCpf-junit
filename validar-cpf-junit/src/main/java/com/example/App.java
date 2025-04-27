package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        boolean cpfValido = ValidadorCpf.validarCpf(cpf);

        if (cpfValido) {
            System.out.println("Bem vindo(a)!");
        } else {
            System.out.println("Tente novamente mais tarde.");
        }

        scanner.close();
    }
}
