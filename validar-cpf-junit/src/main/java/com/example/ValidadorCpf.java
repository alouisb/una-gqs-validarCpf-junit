package com.example;

public class ValidadorCpf {

    public static boolean validarCpf(String cpf) {
        if (cpf == null) {
            return false;
        }
        return cpf.length() == 11;
    }
}
