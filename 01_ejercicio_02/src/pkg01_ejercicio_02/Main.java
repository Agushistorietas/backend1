/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejercicio_02;

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
        System.out.println("Escribí tu nombre");
        Scanner nombre = new Scanner(System.in);
        String nombre1 = nombre.next();
        System.out.println("Tu nombre es " + nombre1);
    }
    
}
