package sesion9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

        // 1. FILE INPUT STREAM

        // 1.1. LEER CARACTER A CARACTER EN MEMORIA
        /*
        try {
            InputStream fichero = new FileInputStream("C:/Windows/Tasks/SA.DAT");
            // Devuelve un array de bytes, así que:
            try {
                byte[] datos = fichero.readAllBytes();  // Lee todos los bytes en memoria, bien para archivos pequeños.

                // Para mostrar los datos:
                for(byte dato : datos) {
                    System.out.println((char)dato); // Sin (char) muestra números (los bytes). Para mostrar los caracteres, se añade (char), es decir, forzar el tipo.
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
        */

        // 1.2. LEER CARACTER A CARACTER
        /* 
        try {
            InputStream fichero = new FileInputStream("C:/Windows/Tasks/SA.DAT");
            // Devuelve un array de bytes, así que:
            try {
                int dato = fichero.read();  // Lee un carácter cada vez, así que hay que usar un bucle while.
                while(dato != -1){ // Cuando datos = -1, EOF (End of File)
                    System.out.print((char)dato);
                    dato = fichero.read();
                }

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
        */

        // 1.3. LEER A TROCITOS
        /* 
        try {
            InputStream fichero = new FileInputStream("C:/Windows/Tasks/SA.DAT");
            // Devuelve un array de bytes, así que:
            try {
                byte datos[] = new byte[5];  // Lee de 5 en 5caracteres cada vez, así que hay que usar un bucle while.
                int dato = fichero.read(datos);
                while(dato != -1){ 
                    System.out.print((char)dato);
                    dato = fichero.read();
                }

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
        */

        // 2. BUFFER INPUT STREAM: Carga poco a poco en memoria y lo va dando.
        /*
        try {
            InputStream fichero = new FileInputStream("C:/Windows/Tasks/SA.DAT");   // Coge el fichero, pero no lee directamente
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);   // Crea un buffer del que va mostrando trozo a trozo (está parcialmente en memoria)
           
            try {
                int dato = ficheroBuffer.read();
                while(dato != -1){ 
                    System.out.print((char)dato);
                    dato = ficheroBuffer.read();
                }

            } catch (IOException e) {
                System.out.println("No puedo leer el fichero: " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
        */

        // ?????????????????
        /*
        try {
            Scanner scanner = new Scanner(System.in);

            boolean ok = false;

            do {
                System.out.print("Escribe dos número: ");
                scanner.reset();
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                    //System.out.println("Enteros son: " + a + ", " + b);
                } catch(InputMismatchException e) {
                    System.out.println("Oh!");
                }       
            } while(!ok);
        } catch(Exception e) {
            System.out.println("Oh!");
        }
        */

        //InputStream fichero2 = new FileInputStream("C:/Windows/Tasks/SA.DAT");

        // 4. PRINT SREAM
        try {
            InputStream in = new FileInputStream("C:/Windows/Tasks/SA.DAT");
            byte [] datos = in.readAllBytes();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
        } catch (Exception e) {

        }
    }
}
