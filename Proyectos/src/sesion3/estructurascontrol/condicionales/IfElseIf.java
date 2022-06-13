package sesion3.estructurascontrol.condicionales;

public class IfElseIf {
    public static void main(String[] args) {
        
        String dia = "Martes";

        // Comparación de Strings
        // boolean resultado = dia.equals("Lunes");
        
        // Comparación de números
        // boolean resultadoNum = 5 == 5;
        
        if(dia.equals("Lunes")) {
            System.out.println("Comienza la semana");

        } else if(dia.equals("Viernes")) {
            System.out.println("Ya casi es finde!!");
            
        } else {
            System.out.println("Ánimo!");
        }



    }
}
