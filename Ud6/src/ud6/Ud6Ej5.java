/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud6;

/*Autor:Felipe Jimenez Brioso
Programa:Ud6Ej5
Entorno:
    a,b es numérico entero
Algoritmo:
    Escribir "Introduzca la base :"
    Leer a
    Escribir "Introduzca el exponente :"
    Leer b
    
    Mientras b > 0 hacer
        a = a * a
        b = b - 1
    Fin Mientras
    Escribir "a ^ b =",a
Fin Programa
*/


/**
 *
 * @author felip
 */
public class Ud6Ej5 {
    public static void main(String[] args){
        int a;
        int b;
        
        System.out.println("Introduzca la base :");
        a = Leer.datoInt();
        System.out.println("Introduzca el exponente :");
        b = Leer.datoInt();
        while(b > 0){
            a = a * a;
            b = b - 1;
        }
    }
}
