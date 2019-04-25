package ejercicios;
/**
 *
 * @author Sant Garcia
 */
import java.util.Scanner;
import paquetedos.Operacion;
public class SeleccionSimple {


    public static void main(String[] args) {
        //documentacion
        
        Scanner entrada = new Scanner(System.in);
        
        int calificacion;
        
        String miMensaje = Operacion.mensaje;
        
        System.out.println("Ingrese la calificacion número 1:");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        } else {
        
        
        } 
        
        int calificacion_2;
        
        System.out.println("Ingrese la calificacion número 2:");
        calificacion_2 = entrada.nextInt();
        
        if (calificacion_2 >= 85 ) {
             System.out.printf("Usted esta aprobado con %d\n", calificacion_2);
        }
    }
   }
    
    

