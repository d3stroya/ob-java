package sesion3.estructurascontrol.condicionales;

public class If {
    public static void main(String[] args) {

        int edad = 17;

        // Opción 1
        if(edad >= 18) {
            System.out.println("Mayor de edad");
        } 

        // Opción 2
        boolean mayorEdad = edad >= 18;
        if(mayorEdad) {
            System.out.println("Mayor de edad");
        } 
        
    }
}
