/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava_esctructurasdecontro_08;

import java.util.Scanner;

/**
 *
 * @author Agustina
 */
public class EjerciciosJAVA_EsctructurasdeContro_08 {

    /**Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una cadena");
        cadena = leer.next();
        String pri = cadena.substring(0,1);
         int largo = cadena.length();
        int correcta; 
        correcta = 0;
        int incorrecta;
        incorrecta = 0;
        
        
       while(!cadena.equals("&&&&&")){
           
        if((pri.equals("X"))&&(cadena.endsWith("O"))&&(largo == 5)){ 
            correcta++;
        }else {incorrecta++;}
                System.out.println("Ingrese una cadena");
        cadena = leer.next();}
        System.out.println("Cadenas correctas: " +correcta);
        System.out.println("Cadenas incorrectas:" +incorrecta);
    }
}