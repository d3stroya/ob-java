package sesion3.estructurascontrol.repeticion;

public class While {
    public static void main(String[] args) {
        
        // Es un bucle indeterminado, infinito mientras no se rompa o deje de cumplirse la condición
        int contador = 0;

        while(contador < 10) {
            System.out.println(contador);
            contador++;

            if(contador == 3) {
                continue; // Continúa a la siguiente interacción y salta esta
            }

            if(contador == 5) { // Rompo el bucle cuando contador = 5
                break;
            }
        }
    }
}
