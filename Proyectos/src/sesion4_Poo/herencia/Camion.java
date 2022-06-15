package sesion4_Poo.herencia;

import sesion4_Poo.clases.Vehiculo;

public class Camion extends Vehiculo {
    // Para acceder a los atributos de la clase, que está en otro paquete/carpeta, necesitamos especificar su visibilidad: protected o public.
    // Con la herencia creamos jerarquías:
        /*
         * Vehículo 
         *   Camion
         *      CamionTrailer
         *      CamionPequeño
         *      CamionSinRemorque
         */
    // Son clases derivadas/hijas/subclases

    double capacidad;

    public Camion() {

    }
    
}
