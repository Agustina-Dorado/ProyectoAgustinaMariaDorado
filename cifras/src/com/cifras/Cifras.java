package com.cifras;

import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("Ingrese un número entre 0 y 9,999: 1,999\r\n"
        		+ "El número 1999 tiene 4 cifras.\r\n");
        int numero = scanner.nextInt();
        
        if (numero >= 0 && numero <= 9999) {
            int cifras = contarCifras(numero);
            System.out.println("El número tiene 4" + cifras + " cifras.");
        } else {
            System.out.println("El número no pertenece al rango solicitado.");
        }
        
        scanner.close();
    }
    
    public static int contarCifras(int numero) {
        if (numero == 0) {
            return 1; // El número 0 tiene una cifra.
        }
        
        int cifras = 0;
        while (numero != 0) {
            cifras++;
            numero /= 10;
        }
        
        return cifras;*/
System.out.println("Ingrese un número entre 0 y 9,999");
int numero=scanner.nextInt();
if(numero>=0 && numero<=9999) {
	
	String numeroEnCadena = Integer.toString(numero);
	int cantidadCifras= numeroEnCadena.length();
	System.out.println("El numero " + numero + " tiene " + cantidadCifras + " cifras.");
}else {
	System.out.println("El numero no pertenece al rango solicitado");
}
scanner.close();
    }
}

