/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.a04;
import java.util.Scanner;
/**
 *
 * @author Pablo
 */
public class SPPPSERRANOHA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declaramos las variables
        int opcion;
        double angulo, sen, cos, tan;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Opciones de conversión");
        System.out.println("1.- Encontrar el seno del angulo");
        System.out.println("2.- Encontrar el coseno del angulo");
        System.out.println("3.- Encontrar el tangente del angulo");
        
        opcion = teclado.nextInt();
        
       switch(opcion){
           case 1:
               System.out.println("Calcular seno");
              angulo = angulo();
                  if (angulo >=0 & angulo <= 360){
                      angulo = Math.toRadians(angulo);
                      sen = Math.sin(angulo);
                      System.out.println("El seno del angulo ingresado es "+ sen);
                  } else {
                      System.out.println("El angulo que ingresaste no se encuentra en el rango solicitado");
                  }
                  break;
           case 2:
               System.out.println("Calcular Coseno");
               angulo = angulo();
                  if (angulo >=0 & angulo <= 360){
                      angulo = Math.toRadians(angulo);
                      cos = Math.cos(angulo);
                      System.out.println("El seno del angulo ingresado es "+ cos);
                  } else {
                      System.out.println("El angulo que ingresaste no se encuentra en el rango solicitado");
                  }
                  break;
           case 3:
               System.out.println("Calcular Tangente");
               angulo = angulo();
               if (angulo >=0 & angulo <= 360){
                      angulo = Math.toRadians(angulo);
                      cos = Math.cos(angulo);
                      System.out.println("El seno del angulo ingresado es "+ cos);
                  } else {
                      System.out.println("El angulo que ingresaste no se encuentra en el rango solicitado");
                  }
               break;
                  
       }
        
    } static double angulo(){
        Scanner teclado = new Scanner(System.in);
        double angulo;
        
        System.out.println("Ingresa el angulo");
               angulo = teclado.nextDouble();
               
        return angulo;
    } 
    
}
