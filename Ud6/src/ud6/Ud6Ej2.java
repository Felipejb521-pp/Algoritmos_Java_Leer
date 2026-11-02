
import ud6.Leer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAM1
 */
/*Programa:Ud6Ej2
Autor:Felipe Jimenez Brioso
Entorno:
        numero es numérico entero
Algoritmo:
        Escribir "Introduzca un numero :"
        Leer numero
        Según Sea numero hacer
            caso 1:
                Escribir "Lunes"
            caso 2:
                Escribir "Martes"
            caso 3:
                Escribir "Miercoles"
            caso 4:
                Escribir "Jueves"
            caso 5:
                Escribir "Viernes"
            caso 6:
                Escribir "Sabado"
            caso 7:
                Escribir "Domingo"
        Fin Según Sea
Fin Programa
*/

public class Ud6Ej2 {
    public static void main(String[] args){
        int numero;
        
        System.out.println("Introduzca un número entero entre 1 y 7");
        numero = Leer.datoInt();
        switch(numero){
            case 1:
                System.out.println("Lunes");
            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miercoles");
            case 4:
                System.out.println("Jueves");
            case 5:
                System.out.println("Viernes");
            case 6:
                System.out.println("Sabado");
            case 7:
                System.out.println("Domingo");
        }
    }
}
