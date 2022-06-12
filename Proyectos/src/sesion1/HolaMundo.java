package sesion1;

public class HolaMundo {
    public static void main(String[] args) {

        // TIPOS DE DATOS

        // 1. Numéricos

            // 1.1. Enteros
            byte numero = 9;
            short corto = 10;
            int entero = 86;
            long largo = 139;

            // 1.2. Decimales
            float flotante = 7.3f;
            double decimal = 4.2;

        // 2. Booleanos
        boolean verdadero = true;
        boolean falso = false;

        // 3. Texto
        char caracter = 'z';
        String texto = "Tipos de variables";

        System.out.println("1. Los tipos de datos numéricos son:");
        System.out.println("  1.1. Enteros: ");
        System.out.println("Byte: " + numero + " | Short: " + corto + " | Int: " + entero + " | Long: " + largo);
        System.out.println("  1.2. Decimales: ");
        System.out.println("Float: " + flotante + " | Double: " + decimal);

        System.out.println("2. Los tipos de datos booleanos son:");
        System.out.println("True: " + verdadero + " | False: " + falso);

        System.out.println("3. Los tipos de datos de texto son:");
        System.out.println("Char: " + caracter + " | String: " + texto);



    }
}
