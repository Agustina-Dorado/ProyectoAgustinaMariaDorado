package com.numerospares;

public class NumerosPares {
    public static void main(String[] args) {
        int numero = 357; // Puedes cambiar este número si lo deseas
        
        System.out.println("Números pares desde 0 hasta " + numero + ":");
        
        for (int i = 0; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
    }
}
