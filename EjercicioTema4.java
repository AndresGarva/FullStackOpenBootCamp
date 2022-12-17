/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionalaprogramacion;

/**
 *
 * @author WINDOWS 10
 */
public class Ejercicio4 {
     public static void main(String[] args){
         //if - SI
         
        int numero = 6;
        
        if(numero == 0){
            System.out.println("El número es 0");
        }
        else{
            if(numero > 0){
                System.out.println("Su número es positivo");
            }
            else{
                System.out.println("Su número es negativo");
            }
        }
        
       //While
       int NumeroW = 0;
       while(NumeroW <= 4){
           System.out.println("El numero es: " +NumeroW);
           ++NumeroW;
       } 
       
       //do-While
        do{
            System.out.println("El numero es: "+NumeroW);
        }
        while(NumeroW == 4);
     
       //for
        for(int NumberFor = 0; NumberFor<=4; NumberFor++){
            System.out.println("El numero es: "+NumberFor);
            
        }
       
        //switch
        String estacion = "Invierno";
        
        switch(estacion){

        case "verano":
            System.out.println("La estacion es: " + estacion);
            break;
        case "invierno":
            System.out.println("La estacion es: " + estacion);
            break;
        case "otoño":
            System.out.println("La estacion es: " + estacion);
            break;
        case "primavera":
            System.out.println("La estacion es: " + estacion);
            break;
        default:
            System.out.println("No corresponde a ninguna estación");
            break;
        }
     }

}
