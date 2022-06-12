import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        // System.in lee datos. System.out los imprime
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        System.out.println("¿Cuántos años tienes?");
        int edad = scanner.nextInt();
        System.out.println("Tu edad es " + edad);

    }
}
