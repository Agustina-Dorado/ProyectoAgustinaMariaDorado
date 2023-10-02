package com.ordennumeros;

import java.util.Arrays;

public class OrdenNumeros {

	public static void main(String[] args) {
        // Crear un arreglo para almacenar los números
        double[] numeros = new double[5];
        
        // Asignar los valores directamente
        numeros[0] = 5;
        numeros[1] = 12;
        numeros[2] = 3;
        numeros[3] = 8;
        numeros[4] = 1;

        // Ordenar los números de mayor a menor
        Arrays.sort(numeros);

        // Imprimir números ordenados de mayor a menor
        System.out.println("Números ordenados de menor a mayor:");
        for (double numero : numeros) {
            System.out.print(numero + " ");
        }

        // Ordenar los números de menor a mayor
        double[] numerosOrdenadosDesc = new double[5];
        for (int i = 0; i < 5; i++) {
            numerosOrdenadosDesc[i] = numeros[4 - i]; // Invertir el orden
        }

        // Imprimir números ordenados de menor a mayor
        System.out.println("\nNúmeros ordenados de mayor a menor:");
        for (double numero : numerosOrdenadosDesc) {
            System.out.print(numero + " ");
        }
    }
}