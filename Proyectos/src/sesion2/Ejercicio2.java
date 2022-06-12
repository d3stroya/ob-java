package sesion2;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        // Función que recibe un precio y devuelve el precio final con IVA
        double precioSinIva = 149.65;
        double precioFinal = calcularPrecioFinal(precioSinIva);
        System.out.println("El precio sin IVA es " + precioSinIva);
        System.out.println("El precio con IVA es " + precioFinal);
    }

    static double calcularPrecioFinal(double precio) {
        return precio + (precio * 21/100);
    }
}
