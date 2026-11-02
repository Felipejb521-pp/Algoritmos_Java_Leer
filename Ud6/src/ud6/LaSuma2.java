/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud6;

/**
 *
 * @author felip
 */
public class LaSuma2 {

    public static float suma(float a,float b){
        float resultado;
        resultado = a+b;
        return resultado;
    }
  
    public static void main(String[] args) {
        float n1,n2;
        
        System.out.println("Introduzca un nº:");
        n1 = Leer.datoFloat();
        System.out.println("Introduzca un nº:");
        n2 = Leer.datoFloat();
        System.out.println("La suma es :"+suma(n1,n2));
    }
    
}
