import java.util.ArrayList;
import java.util.List;

import Clases.Coche;

public class ListasMain {
    public static void main(String[] args) {
        // Es una interfaz, así que requiere una implementación
        // Es una lista dinámica
        List<String> nombres = new ArrayList<>();

        // Añadir nombres a la lista
        nombres.add("Buzz");
        nombres.add("Woody");
        nombres.add("Andy");

        System.out.println(nombres);

        // Recorrer el array
        // for([variable] : [lista])
        for(String nombre : nombres) {
            System.out.println(nombre);
        }

        // También se puede usar con objetivos
        class Coche {
            String name = "Nombre del coche";

            Coche(String name){
                this.name = name;
            }
        }


        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Golf"));
        coches.add(new Coche("Megane"));
        coches.add(new Coche("A1"));

        
    }
    
}
