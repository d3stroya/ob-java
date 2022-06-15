package sesion4_Poo.clases;

import sesion4_Poo.herencia.Camion;
import sesion4_Poo.herencia.Coche;
import sesion4_Poo.herencia.Moto;

public class Main {
    // static determina que un objeto pertenece a la clase. Permite instanciarlo sin crear un objeto de la clase. "main" pertenece a Main.
    // Puede usarse con constantes como el IVA, el número pir, etc.
    public static void main(String[] args) {
        // 1. CLASES Y OBJETOS

        // Para crear un objeto:
        // Clase identificador = new Clase();

        // Crear objeto usando el constructor vacío
        Vehiculo clio = new Vehiculo();

        // Añadimos motor a la clase de abajo
        Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
        
        // Crear un objeto con parámetros
        Vehiculo golf = new Vehiculo("Volkswagen", "Golf", 2.1, 2016, false, motorGTI);
        System.out.println(golf.velocidad);
        golf.acelerar(100);
        System.out.println(golf.velocidad);


        // 2. HERENCIA
        Moto kawasakiNinja = new Moto();
        kawasakiNinja.acelerar(100);
        kawasakiNinja.anyo = 2018;

        // 3. POLIMORFISMO
        // Distintos objetos hijos comparten método o atributos, pero cada uno lo implementa a su manera.
        Vehiculo vehiculo;

        vehiculo = new Moto();
        vehiculo.acelerar(100);

        vehiculo = new Coche();
        vehiculo.acelerar(120);

        vehiculo = new Camion();
        vehiculo.acelerar(80);

        // 4. CLASES ABSTRACTAS
        /*No se pueden instanciar. Solo se instancian las hijas. 
        Por ejemplo, crear una clase abstracta "incidente" que luego haya que completar 
        según el tipo de incidente que sea (incendio, avería, corte de carretera,...)
        */
    }
}
