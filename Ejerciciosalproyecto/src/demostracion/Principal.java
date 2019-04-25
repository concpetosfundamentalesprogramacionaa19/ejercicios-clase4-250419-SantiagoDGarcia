package demostracion;

/**
 *
 * @author Sant Garcia
 */
import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int mensajes;
    double tarifaB, adicion1, adicion2, tarifaF, tarifaF2, adicion4,adicion3, 
            valorM, valorM2;
    
    
    tarifaB = 3.00;
    
        System.out.println("Ingrese la cantidad de mensajes que envio el usuario: ");
            mensajes = entrada.nextInt();
        
        if (mensajes >=0 && mensajes <= 40) {
            
            valorM = tarifaB*1.12;
            System.out.printf("el valor a pagar es: %.2f  $", valorM);
            
        } else {
            if (mensajes > 40 && mensajes <= 200) {
                // Se establece la condicion de adicionar los mensajes a la 
                // tarifa extra
                adicion1 = mensajes-40;
                // Se suman los valores adicionales
                adicion2 = (adicion1 * 0.05);
                // Se establece un valor final
                tarifaF = adicion2 + tarifaB;
                valorM = tarifaF*1.12;
                System.out.printf("el valor a pagar es: %.2f  $", valorM);    

        
                
            } else if(mensajes > 200){
                 // Se establece la condicion de adicionar los mensajes a la 
                // tarifa extra
                adicion1 = mensajes-40;
                // Se sss los valores adicionales
                adicion2 = (adicion1 * 0.05);
                // Se establece un valor final
                tarifaF = adicion2 + tarifaB;
                valorM = tarifaF*1.12;  
                
                adicion3 = mensajes-200;
                   // Se suman los valores adicionales
                   adicion4 = (adicion3 * 0.1);
                   // Se establece un valor final
                   tarifaF2 = adicion4 + tarifaF; 

                   valorM = tarifaF2*1.12;
                   System.out.printf("el valor a pagar es: %.2f  $", valorM);
            }

                 
            }
            
    
    
    
    
 }   
}

