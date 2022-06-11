package Clases;
public class CocheMain {
    public static void main(String[] args) {

        Coche golf = new Coche("blanco", "Volkswagen", "Golf", 123.89);

        System.out.println("En reposo: " + golf.velocidad);

        golf.acelerar(50);
        System.out.println("En carretera: " + golf.velocidad);

        golf.acelerar(70);
        System.out.println("En autovía: " + golf.velocidad);


        // CocheElectrico clio = new CocheElectrico();
        // clio.fabricante = "Renault";
        // clio.color = "negro";

        CocheElectrico megane = new CocheElectrico("rojo", "Renault", "Megane", 154.90, "v2022");
        System.out.println(megane);

        megane.acelerar(50);    // Accede al método acelerar de CocheElectrico, que sobreescribe el método acelerar de Coche.
        System.out.println(megane);
    }
    }

