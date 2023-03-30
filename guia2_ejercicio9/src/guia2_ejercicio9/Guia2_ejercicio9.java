/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2_ejercicio9;

import java.util.Scanner;

/**
 *Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
14
 * @author Agustina
 */
public class Guia2_ejercicio9 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num;
        int cont = 0;
        int suma = 0;

        do {
            System.out.print("Escriba un número para sumar");
            num = n.nextInt();
            cont++;
            if (num > 0) {
                suma = (suma + num);

            }
        if (cont== 5){System.out.println("La suma de los números es" + suma);}
        if (num == 0){System.out.println("Se capturó el numero cero");}
        } while ((num != 0) && cont <5);
    } }

 
   
    
