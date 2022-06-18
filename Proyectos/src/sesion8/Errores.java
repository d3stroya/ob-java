package sesion8;
// Los errores son comportamientos no esperados en el programa.
// Pueden darse en la ejecución pero también en el diseño.

import java.util.HashMap;
import java.util.Scanner;

public class Errores {
    public static void main(String[] args) {
        
        // 1. ERRORES
        /*
        // 1.1. ERRORES DE EJECUCIÓN. No tenemos en cuenta algunos aspectos que pueden dar error.
        // Por ejemplo, pedimos al usuario introducir dos números, pero no podemos dividir entre 0.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 2 números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int resultado = a / b;
        System.out.println("El resultado es: " + resultado);
        */

        /*
        // 1.2. ERRORES DE COMPLIACIÓN: es meramente sintáctico, por ejemplo, falta un ;
        Scanner scanner = new Scanner(System.in)
        */

        /*
        // 1.3. ERRORES LÓGICOS (HUMANOS): las órdenes están mal dadas
        int temperatura = 25;
        if(temperatura >= 25) { // La lógica es errónea. El compilador no da error, así que no se ve a priori.
            System.out.println("¡Hace frío!");
        // }
        */

        // 2. AVISOS
        /* Se pueden ignorar con @SuppressWarnings()
           Pero es mejor solucionarlos porque son errores potenciales.
        */

        /* 
        // 3. GESTIONAR ERRORES: 
        // 3.1. try{} catch{} finally{}
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce 2 números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        try{
            int resultado = a / b;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) { // Exception es la clase que incluye todas las excepciones, pero se pueden indicar las excepciones concretas.
            System.out.println("b00m!, excepción es: " + e.getClass()); // Ahora si b = 0, salta esta excepción en lugar de dar el error.
        } catch (Exception e) { // Se pueden añadir varios catch
            System.out.println("Excepción no aritmética");
        } finally {
            System.out.println("finally");  // Siempre se va a ejecutar
        }
        

        // 3.2. throw y throws
        try {
            divide(4, 0);
        } catch (Exception e) { // Se puede indicar la general o una en concreto, pero debe ser la misma que abajo (si es concreta).
            System.out.println("ahhhhh!!!");    // Si en la función entramos en el catch, throw lanza la excepción y se muestra aquí.
        }
        */
        
    }

    /* 
    // 3.2. throw y throws
    public static int divide(int a, int b) throws ArithmeticException { // Puede que devuelva excepciones de este tipo (se pueden indicar varias), pero no tiene porqué
        int resultado = 0;
        try {
            resultado =  a / b;
        } catch(ArithmeticException e) {
            throw new ArithmeticException();    // Lanza el tipo de excepción indicada
        }
        return resultado;
    }
    */
}
