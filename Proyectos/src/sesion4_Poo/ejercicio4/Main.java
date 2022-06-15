package sesion4_Poo.ejercicio4;

// 4. CREO OBJETOS DE CADA CLASE Y LOS IMPRIMO POR PANTALLA
public class Main {
    public static void main(String[] args) {

        // Creo un objeto de la clase SmartDevice
        SmartDevice google = new SmartDevice("pixel", "Google", 2015, "android 12", "litio", 48, 5.2, "blanco", true);
        
        System.out.println(google);
        System.out.println();
        
        // Creo un objeto de la clase hija SmartPhone
        SmartPhone pixel = new SmartPhone("pixel", "Google", 2020, "android12", "litio", 16, 5, "negro", true, 128, 20, "5G", 16);

        System.out.println("Creando...");
        System.out.println("Smartphone " + pixel.fabricante + " | " + pixel.modelo + " (" + pixel.anyo + ") Pantalla de " + pixel.pulgadasPantalla + " pulgadas | " + pixel.color + " | " + pixel.ram + "GB de RAM");
        System.out.println("Ampliando memoria RAM...");
        pixel.ampliarRam(16);
        System.out.println("Ahora tu smartphone tiene " + pixel.ram + "GB de RAM.");
        System.out.println();

        // Creo un objeto de la clase hija SmartWatch
        SmartWatch fitbit = new SmartWatch("charge 5", "Fitbit", 2021, "fitbitOS", "litio", 168, 2, "negro", true, true, "goma", "negro", true);

        System.out.println("Creando smartwatch...");
        System.out.println("Smartwatch " + fitbit.fabricante + " | " + fitbit.modelo + " (" + fitbit.anyo + ") " + fitbit.color + " | " + "Correa color" + fitbit.colorCorrea + " de " + fitbit.tipoCorrea);
        System.out.println("Modificando el color de la correa...");
        fitbit.cambiarColorCorrea("azul");
        System.out.println("Ahora tu correa es de color " + fitbit.colorCorrea);
    }


    
}
