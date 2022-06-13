package sesion3.estructurascontrol.condicionales;

public class IfElse {
    public static void main(String[] args) {

        int edad = 20;

        if(edad >= 18) { // para true
            System.out.println("Mayor de edad");
        } else { // para false
            System.out.println("Menor de edad");
        }  // el resto se ejecuta siempre
        System.out.println("Control de edad completado.");
    }
}
