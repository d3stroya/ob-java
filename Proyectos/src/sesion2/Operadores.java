package sesion2;

public class Operadores {
    public static void main(String[] args) {

        // Aritméticos
        int a = 3;
        int b = 5;

        int suma = a + b;
        System.out.println("Suma: " + suma);

        int resta = a - b;
        System.out.println("Resta: " + resta);

        // Comparación
        /*
         * > mayor que
         * < menor que
         * >= mayor o igual que
         * <= menor o igual que
         * == igual que
         */

         boolean mayor = a > b;
        System.out.println("¿Es a mayor que b? " + mayor);

         boolean menor = a < b;
        System.out.println("¿Es a menor que b?  " + menor);

        // Lógicos
        /*
         * && AND
         * || OR
         */

         boolean verificador = a < 10 && a < b;
         System.out.println(verificador);

    }
}
