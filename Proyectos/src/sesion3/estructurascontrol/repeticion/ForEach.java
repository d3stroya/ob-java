package sesion3.estructurascontrol.repeticion;

public class ForEach {
    public static void main(String[] args) {
        
    // Bucle foreach con Strings
     String[] nombres = {"Franky", "Bridget", "Allie"} ;  
     for(String nombre : nombres) {
        System.out.println(nombre);
     }

     // Bucle foreach con números
     int suma = 0;
     int[] numeros = { 5, 7, 8 };
     for(int numero : numeros) {
        suma += numero;
        System.out.println(suma);
     }
    }
}
