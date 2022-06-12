package ConceptosBásicos;
public class ArraysMain {
    public static void main(String[] args) {

        String nombre1 = "nombre1";
        String nombre2 = "nombre2";
        String nombre3 = "nombre3";

        String[] nombres = new String[3];
        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        // Equivalente a la anterior, pero ocupando solo una línea
        String[] nombresbis = new String[]{nombre1, nombre2, nombre3};
        for(int i = 0; i < nombresbis.length; i++) {
            System.out.println(nombresbis[i]);
        }

        // Igual para cualquier tipo de dato, incluso para clases
        int[] numeros = new int[5];
        //Coche[] coches = new Coche[2];

    }
}