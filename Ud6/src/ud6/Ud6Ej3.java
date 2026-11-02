
import ud6.Leer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM1
 */
public class Ud6Ej3 {
    public static void main(String[] args){
        int numero;
        int contador;
        
        contador = 0;
        System.out.println("Introduzca un número positivo entero :");
        numero = Leer.datoInt();
        
        while(numero > 0){
            numero = numero / 10;
            contador = contador + 1;
        }
        System.out.println("El numero pasado tiene "+contador+" cifras");
    }
}
