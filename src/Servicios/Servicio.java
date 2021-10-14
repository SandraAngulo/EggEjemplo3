
package Servicios;

import Ahorcado.Ahorcado;
import java.util.Scanner;


public class Servicio {
         Scanner Leer= new Scanner(System.in);
         Ahorcado obj = new Ahorcado();
    public Ahorcado crearJuego(){
       
       String palabra;
       int can_letra;  // es la longitud de la palabra 
       int can_jugadas; // es la cantidad de jugadas maximas
       int encontradas=0; // es la cantidad enconttradas que pide el enunciado igual a0
       System.out.println("Ingrese la palabra con la que quiere jugar al Ahorcado");
       palabra=Leer.next();
                                    //  almacena la cantidad de letra de la palabra  
        can_letra= palabra.length(); // calculo de la cantidad de letras de la palabra ingresada almacenandola en longitud
        System.out.println("Ingrese la cantidad de jugadas maximas");
        can_jugadas=Leer.nextInt();
        String []vec_buscar= new String[can_letra]; // creamos un vector con su longitud corresp. ya calculada anteriormente
        for (int i = 0; i < can_letra; i++) {
          vec_buscar[i]=palabra.substring(i, i+1);
        }
        
       Ahorcado obj = new Ahorcado(vec_buscar,can_letra,can_jugadas,encontradas,can_letra); //crea un objeto que seraretornado con sus datos que ingresamos.
        
        return obj;
        
    }
   public int  Longitud(Ahorcado obj){
       
     int let= obj.getVec_buscar().length;
      //se puede hacer directamente  sin la variable y sin el return tambien. Luego lo llamo desde el main
      
     return let;  
   }
   
  public void buscarLetra(Ahorcado obj,String l){
       
         for (int i = 0; i < obj.getCan_letra(); i++) {
          if(obj.getVec_buscar()[i].equals(l)){
                 System.out.println("la letra ingresada pertenece a la palabra");   
              }else{
              System.out.println("la letra ingresada no pertenece a la palabra");
          }
         }                      

        
  }
}