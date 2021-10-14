
package Juego;

import Ahorcado.Ahorcado;
import Servicios.Servicio;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
    Scanner Leer= new Scanner(System.in);
    Servicio SC = new Servicio();
    Ahorcado obj= SC.crearJuego();
        System.out.println("la longitud de la palabra es : " + SC.Longitud(obj));
        System.out.println("ingrese la letra ");
        String l =Leer.next();
      SC.buscarLetra(obj, l);
     
    }
    
}
