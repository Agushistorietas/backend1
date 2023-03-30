/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejercicio_05;

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
        Scanner numero = new Scanner(System.in);
       System.out.println("Escriba un número entero");
       long num = numero.nextLong();
       System.out.println(" El doble de " + num + " es " + (num*2) + ",el triple es " + (num*3) + ", y la raíz cuadrada es " + Math.sqrt(num) + ".");
    }
    
}
