/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava_esctructurasdecontnrol_04;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class EjerciciosJAVA_EsctructurasdeContnrol_04 {

    /**Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
2
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner  leer = new Scanner(System.in);
      System.out.print("Escreiba una frase o palabra.");
      String frase = leer.next();
      String L = frase.substring(0,1);
      if( L.equals("A") || L.equals("a")){ System.out.print("Correcto");}
      else { System.out.print("Incorrecto");}
              
    }
    
}