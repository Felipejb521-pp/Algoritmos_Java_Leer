
import ud6.Leer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package ud6;

/**
 *
 * @author felip
 */
/*Autor:Felipe Jimenez Brioso
Programa:Ud6Ej6
Entorno:
    nota es alfanumérico(2)
    contador es numérico entero
Algoritmo:
    aprobado = 0

    Escribir "La correspondencia de notas es :"
    Escribir "S = 9.5"
    Escribir "N = 7.5"
    Escribir "B = 6"
    Escribir "SF = 5"
    Escribir "I = 4"
    Escribir "MD = 2.5"
    Escribir "o = 0"

    'S' <- 9.5
    'N' <- 7.5
    'B' <-6
    contador = 35
    Mientras contador > 0 hacer
        Escribir "Introduzca nota de un alumno ,(restantes",contador-1," notas"
        Leer nota
        sumatorio = sumatorio + nota
        Si  nota >= 5 entonces
            aprobado = aprobaddo +1
        Fin Si
        contador = contador - 1
    Fin Mientras
    Escribir "El numero de aprobados es :",aprobado
    Escribir "El numero de suspensos es :",35 - aprobado
    Escribir "La nota media de la clase es :"sumatorio / 35.0
*/


public class Ud6Ej6 {
    public static void main(String[] args) {
        int contador;
        String letra;
        int aprobado;
        double sumatorio;
        double nota;
        
        aprobado = 0;
        sumatorio = 0;
        System.out.println("La correspondencia de notas es :");
        System.out.println("S = 9.5");
        System.out.println("N = 7.5");
        System.out.println("B = 6");
        System.out.println("SF = 5");
        System.out.println("I = 4");
        System.out.println("MD = 2.5");
        System.out.println("b = 0");

        contador = 35;
        while(contador > 0 ){
            System.out.println("Introduzca nota de un alumno ,"+(contador)+" notas restantes");
            letra = Leer.dato();
        
            switch(letra){
                case "S": 
                    nota = 9.5;
                    break;
                case "N":
                    nota = 7.5;
                    break;
                case "B":
                    nota = 6;
                    break;
                case "SF":
                    nota = 5;
                    break;
                case "I":
                    nota = 4;
                    break;
                case "MD":
                    nota = 2.5;
                    break;
                case "o":
                    nota = 0;
                    break;
                default:
                    System.out.println("Nota no valida");
                    continue; // vuelve a pedir la nota sin avanzar contador
            }

        
            sumatorio = sumatorio + nota;
                if(nota >= 5){
                    aprobado = aprobado +1;
                }
                contador = contador - 1;
        }
      
        System.out.println("El numero de aprobados es :"+aprobado);
        System.out.println("El numero de suspensos es :"+(35 - aprobado));
        System.out.println("La nota media de la clase es :"+sumatorio / 35.0);
                   
        
    }
    
}
