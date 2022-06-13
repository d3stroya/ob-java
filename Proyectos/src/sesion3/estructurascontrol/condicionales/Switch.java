package sesion3.estructurascontrol.condicionales;

public class Switch {
    public static void main(String[] args) {
        String dia = "Sábado";

        switch(dia) {
            case "Lunes":
                System.out.println("Comienza la semana");
                break; // Rompe el flujo de ejecución si esta opción se cumple
            case "Viernes":
                System.out.println("Ya casi es finde!!");
                break;
            case "Sábado":
                System.out.println("Partyyyyy!");
                break;
            default: // Caso por defecto, equivalente al else del if else. Se ejecuta cuando ningún caso de los anteriores se cumple
                System.out.println("No hay notas para este día");
        }
    }
}
