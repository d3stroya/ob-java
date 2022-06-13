package sesion3.estructurascontrol.repeticion;

public class For {
    public static void main(String[] args) {
        
        // Bucle for básico
        for(int i = 0; i < 11; i++) {
            System.out.println(i);
        }

        // Bucle for para array
        String[] nombres = {"Franky", "Bridget", "Allie"};
        for(int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        int suma = 0;
        int[] numeros = { 5, 7, 8} ;
        for(int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            System.out.println(suma);
        }
    }
}
