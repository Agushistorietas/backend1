/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_ejercicio_03;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Agustina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
    System.out.println("Escriba una frase");
    String frase1 = frase.nextLine();
    System.out.println("Su frase en minúsculas es " + toLowerCase(frase1) + ", y su frase en mayúsculas es " + toUpperCase(frase1) );
    }
    
}
