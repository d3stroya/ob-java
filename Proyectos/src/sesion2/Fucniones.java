package sesion2;

public class Fucniones {
    public static void main(String[] args) {
        // Las funciones evitan la repetición de código
        
        // Función sin parámetros ni retorno
        showMenu();

        // Función sin parámetros y con retorno

            // Guardar el retorno en una variable
            String menu = getMenu();
            // Imprimir el retorno
            System.out.println(menu);
            // Imprimir la función
            System.out.println(getMenu());

        // Función con parámetros y sin retorno
        imprimirSaludo("Buenas!!");

        // Función con parámetros y retorno
        String saludo = obtenerSaludo("Franky", "Doyle");
        System.out.println(saludo);

    }
   
    static void showMenu(){
        System.out.println("Tienda de Rosquillas");
        System.out.println("- Comprar rosquillas");
        System.out.println("- Encargar osquillas");
        System.out.println("- Ver ofertas");
        
    }
    
    static String getMenu() {
        return "Tienda de Rosquillas \n - Comprar rosquillas \n - Encargar osquillas \n - Ver ofertas";
    }
    
    static void imprimirSaludo(String saludo) {
        System.out.println(saludo);
    }
    
    static String obtenerSaludo(String nombre, String apellido) {
        return "Hola, " + nombre + " " + apellido;
    }
}
