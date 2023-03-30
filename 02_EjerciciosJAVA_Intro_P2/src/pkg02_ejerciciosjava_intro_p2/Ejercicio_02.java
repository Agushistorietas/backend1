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
public class Ejercicio_02 {
    Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
   String frase = leer.next();
   

   if (frase.equals("eureka")){
        System.out.println("La frase es correcta");
   }else {
            System.out.println("La frase es incorrecta");

    }
}
}
}
