
import ud6.Leer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felip
 */
public class Ud6Ej4 {
    public static void main(String[] args){
        int numero;
        int decremento;
        int fact;
        
        fact = 0;
        System.out.println("Introduzca un numero entero positivo :");
        numero = Leer.datoInt();
        decremento = numero;
        while(decremento>=1){
            decremento = numero - 1;
            fact = numero * decremento;

        }
        System.out.println("El factorial de "+numero+" es "+fact);
        
    }
}
