
package switchcase;
import java.util.Scanner;
/**
 *
 * @author usuario1
 */
public class SwitchCase {
    public static void main(String[] args) {
    Scanner captura = new Scanner(System.in);
        //Declaro las variables
        String opcion;
        double primerNumero;
        double segundoNumero;
        double resultado;
        
        // Cargo las variables
        System.out.println("*** Menu ***");
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("Multiplicacion");
        System.out.println("Division");        
        System.out.println("Degite su opcion:");
        opcion = captura.next();
        
        switch(opcion){
            // Suma
            case "suma":
                // Capturar los datos
                System.out.println("*** Suma ***");
                System.out.println("Digite el primer numero:");
                primerNumero = captura.nextDouble();
                
                System.out.println("Digite el segundo numero:");
                segundoNumero = captura.nextDouble();
                
                // Proceso
                resultado = primerNumero + segundoNumero;
                
                // Impresión
                System.out.println("Resultado ="+ resultado);
            break;
            
            // Resta
            case "Resta":
                 // Capturar los datos
                System.out.println("*** Resta ***");
                System.out.println("Digite el primer numero:");
                primerNumero = captura.nextDouble();
                
                System.out.println("Digite el segundo numero:");
                segundoNumero = captura.nextDouble();
                
                // Proceso
                resultado = primerNumero - segundoNumero;
                
                // Impresión
                System.out.println("Resultado ="+ resultado);
                
            break;
            
            case "Multiplicacion":
            // Capturar los datos
                System.out.println("*** Suma ***");
                System.out.println("Digite el primer numero:");
                primerNumero = captura.nextDouble();
                
                System.out.println("Digite el segundo numero:");
                segundoNumero = captura.nextDouble();
                
                // Proceso
                resultado = primerNumero * segundoNumero;
                
                // Impresión
                System.out.println("Resultado ="+ resultado);
            break;
            
            case  "Division":
                System.out.println("*** Division ***");
                System.out.println("Digite el primer numero");
                primerNumero = captura.nextDouble();
                
                System.out.println("Digite en segundo numero");
                segundoNumero = captura.nextDouble();
                
                // Proceso
                if (segundoNumero != 0);
                    
                else
                        System.out.println("la division por 0 no exiate.");
            // Default
            default:
                System.out.println("Su opcion no existe");
        }        
    }
    
}
