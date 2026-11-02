
import ud6.Leer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Programa:Ud6Ej1
Autor:Felipe Jimenez Brioso
Entorno:
        nota es numérico real
Algoritmo:
        Escribir "Introduzca su nota :"
        Leer nota
        Si nota>=0 y nota<3 entonces
            Escribir "M.D"
        Sino
            Si nota>=3 y nota<5 entonces
                Escribir "INS"
            Sino
                Si nota>=5 y nota<6 entonces
                    Escribir "SUF"
                Sino
                    Si nota>=6 y nota<7 entonces
                        Escribir "BIEN"
                    Sino
                        Si nota>=7 y nota<9 entonces
                            Escribir "NOT"
                        Sino
                            Si nota>=9 y nota<=10 entonces
                                Escribir "SOBR"
                            Fin Si
                        Fin Si
                    Fin Si
                Fin Si
            Fin Si
        Fin Si
Fin Programa
*/
public class Ud6Ej1 {
    public static void main(String[] args){
        float nota;
        
        System.out.println("Introduzca su nota :");
        nota = Leer.datoFloat();
        if(nota >= 0 && nota < 3){
            System.out.println("M.D");
        }else if(nota >= 3 && nota < 5){
            System.out.println("INS");
        }else if(nota >= 5 && nota < 6){
            System.out.println("SUF");
        }else if(nota >= 6 && nota < 7){
            System.out.println("BIEN");
        }else if(nota >= 7 && nota < 9){
            System.out.println("NOT");
        }else if(nota >= 9 && nota <= 10){
            System.out.println("SOBR");
        }
    }
}
