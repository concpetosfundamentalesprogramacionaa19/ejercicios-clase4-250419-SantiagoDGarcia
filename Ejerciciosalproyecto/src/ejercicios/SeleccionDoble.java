package ejercicios;
/**
 *
 * @author Sant Garcia
 */
import java.util.Scanner;
import paquetedos.Operacion;
public class SeleccionDoble {


    public static void main(String[] args) {
        
        //desarrollo...
        
        Scanner entrada = new Scanner(System.in);
        
        int calificacion;
        
        String miMensaje = Operacion.mensaje;
        String miMensaje2 = Operacion.mensaje2;
        
        System.out.println("Ingrese la calificación número 1:");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        } else{
            System.out.printf("%s %d\n", miMensaje2, calificacion);
        } 
        
        int calificacion_2;
        
        System.out.println("Ingrese la calificación número 2:");
        calificacion_2 = entrada.nextInt();
        
        
        if (calificacion_2 >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        } else{
            System.out.printf("%s %d\n", miMensaje2, calificacion_2);
        }
        
       }
    }
   
    
    

