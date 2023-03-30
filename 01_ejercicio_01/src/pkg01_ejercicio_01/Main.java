/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Escriba dos números enteros para sumar");
Scanner numero = new Scanner(System.in);
Scanner numero2 = new Scanner(System.in);
int num1 = numero.nextInt();
int num2 = numero2.nextInt();
int suma = num2 + num1;
        System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es de " + suma );
    }
    
} 

