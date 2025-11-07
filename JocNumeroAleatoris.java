/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jocnumeroaleatoris;
import java.util.Scanner;
/**
 *
 * @author aclemente
 */
public class JocNumeroAleatoris {

    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);

        int random = (int) (Math.random() * 11);
        int numero;
        
        do{
            System.out.println("Adivina el numero aleatori: ");
            numero = llegir.nextInt();
            
            
            
        }while (numero != random);
            System.out.println("Has guanyat el numero random era: " + random);



    }
}
