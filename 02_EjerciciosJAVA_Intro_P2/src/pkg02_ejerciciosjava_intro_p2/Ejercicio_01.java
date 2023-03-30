/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_ejerciciosjava_intro_p2;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Ejercicio_01 {

    /**1. Crear un programa que dado un número determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
        System.out.println("Ingrese un número para determinar si es par o impar.");
      Scanner num = new Scanner(System.in);
      int numero = num.nextInt();
      if (numero%2==0){System.out.println("El número es par.");}
      else {System.out.print("El número es impar");}
    }
    }
}
