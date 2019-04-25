
package empresa;
import java.util.Scanner;
public class Empresa {
    public static void main(String[] args) {
        
        int nom, n, j = 0;
//        String empleado,salario,horas;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de empleados de su empresa");
        n = teclado.nextInt();
        
            String A[][] = new String [n][3];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el nombre del empleado");
            A[i][j] = teclado.next();
            System.out.println("Introduce el salario del empleado");
            A[i][j+1] = teclado.next();
            System.out.println("Introduce horas de trabajo");
            A[i][j+2] = teclado.next();
        }
        
        System.out.println("NOMBRE   SALARIO HORAS\t");
        
        for (int i = 0; i < n; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(A[i][j] + "\t");
                //si (j==2)
                //si(i == posicionDEPagoB)
                //for(w = 0; w < PagoB.lengh; w++)
                
            }
            System.out.println("");
        }
    }
    
}
