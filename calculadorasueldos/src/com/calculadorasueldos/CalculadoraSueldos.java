package com.calculadorasueldos;

import java.util.Scanner;

public class CalculadoraSueldos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadSueldos = 3; // Cantidad de sueldos a ingresar

        double[] sueldos = {645500.0, 69500.0, 119168.0};

        double sueldoMaximo = sueldos[0];
        double sueldoMinimo = sueldos[0];
        double sumaSueldos = sueldos[0];

        for (int i = 1; i < cantidadSueldos; i++) {
            if (sueldos[i] > sueldoMaximo) {
                sueldoMaximo = sueldos[i];
            }
            if (sueldos[i] < sueldoMinimo) {
                sueldoMinimo = sueldos[i];
            }
            sumaSueldos += sueldos[i];
        }

        double promedio = sumaSueldos / cantidadSueldos;

        System.out.println("El sueldo más alto es: $" + sueldoMaximo);
        System.out.println("El sueldo más bajo es: $" + sueldoMinimo);
        System.out.println("El promedio de los sueldos ingresados es: $" + promedio);

        sc.close();
    }
}
