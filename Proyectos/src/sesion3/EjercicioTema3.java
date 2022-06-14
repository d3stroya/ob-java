package sesion3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class EjercicioTema3 {
    public static void main(String[] args) {
        // Crear un bucle que permita concatenar textos e imprima el resultado final por consola.
        Map<Integer, String> nombres = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pide tu primer deseo:");
        String deseo1 = scanner.nextLine();
        nombres.put(1, deseo1);
        System.out.println("Pide un segundo deseo:");
        String deseo2 = scanner.nextLine();
        nombres.put(2, deseo2);
        System.out.println("Piensa bien, es tu último deseo:");
        String deseo3 = scanner.nextLine();
        nombres.put(3, deseo3);
            
        
        for(Entry<Integer, String> peticion : nombres.entrySet()) {
            System.out.println("Deseo " + peticion.getKey() + ": " + peticion.getValue());
        }      

    }
}
