package sesion2;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        // Función que recibe un precio y devuelve el precio final con IVA
        double precioFinal = calcularPrecioFinal(2.89, 4);
        System.out.println("El precio con IVA es " + precioFinal);
    }

    static double calcularPrecioFinal(double precio, int iva) {
        return precio + (precio * iva/100);
    }
}
