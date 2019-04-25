package ejercicios;
/**
 *
 * @author Sant Garcia
 */
import java.util.Scanner;
import paquetedos.Operacion2;
public class SeleccionAnidada {


    public static void main(String[] args) {
        
        //desarrollo...
        
        Scanner entrada = new Scanner(System.in);
        
        int calificacion;
        
        String miMensaje = Operacion2.mensaje1;
        String miMensaje2 = Operacion2.mensaje2;
        String miMensaje3 = Operacion2.mensaje3;
        String miMensaje4 = Operacion2.mensaje4;
        
        System.out.println("Ingrese la calificación número 1:");
        calificacion = entrada.nextInt();
        
        if (calificacion >= 90){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        } else{
            if (calificacion < 90 && calificacion >= 80) {
             System.out.printf("%s %d\n", miMensaje2, calificacion);    
             } else{
                    if (calificacion < 80 && calificacion >= 50) {
                     System.out.printf("%s %d\n", miMensaje3, calificacion);    
                    } else{
                        System.out.printf("%s %d\n", miMensaje4, calificacion);    
                        }
                    }
            }
        
                    
        int calificacion_2;
        
        System.out.println("Ingrese la calificación número 2:");
        calificacion_2 = entrada.nextInt();
        
        
        if (calificacion_2 >= 90){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        } else{
            if (calificacion_2 < 90 && calificacion_2 >= 80) {
             System.out.printf("%s %d\n", miMensaje2, calificacion_2);    
             } else{
                    if (calificacion_2 < 80 && calificacion_2 >= 50) {
                     System.out.printf("%s %d\n", miMensaje3, calificacion_2);    
                    } else{
                        System.out.printf("%s %d\n", miMensaje4, calificacion_2);    
                        }
                    }
            }
        }
    }
    

