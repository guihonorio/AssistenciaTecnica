package com.mycompany.assistenciatecnica;

public class Validacoes {

    public static boolean emailValido(String email) {
        if (email == null) {
            return false;
        }
        String e = email.trim();
        if (e.isEmpty()) {
            return false;
        }
        int arroba = e.indexOf('@');
        if (arroba <= 0 || arroba == e.length() - 1) {
            return false;
        }
        String dominio = e.substring(arroba + 1);
        return dominio.contains(".") && !dominio.startsWith(".") && !dominio.endsWith(".");
    }

    public static boolean telefoneValido(String telefone) {
        if (telefone == null) {
            return false;
        }
        String t = telefone.trim();
        if (t.isEmpty()) {
            return false;
        }
        
        for (int i = 0; i < t.length(); i++) {
            if (!Character.isDigit(t.charAt(i))) {
                return false;
            }
        }
       
        return t.length() == 10 || t.length() == 11;
    }

    public static boolean textoPreenchido(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean nomeValido(String nome) {
        if (!textoPreenchido(nome)) {
            return false;
        }
        String n = nome.trim();

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
}