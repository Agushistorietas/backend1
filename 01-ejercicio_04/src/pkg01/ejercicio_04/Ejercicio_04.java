/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba una temperatura en ºC para pasar a ºF.");
       Scanner grados = new Scanner(System.in);
       double centigrados = grados.nextDouble();
       double farenheit = 32 + (9 * centigrados / 5);
       System.out.println(centigrados +"ºC es igual a " + farenheit + "º F");
    }
    
}
