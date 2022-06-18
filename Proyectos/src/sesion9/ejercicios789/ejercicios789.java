package sesion9.ejercicios789;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class ejercicios789 {

    /* 
     // 0. Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
    public static String reverse(String texto) {
        for(int i = 9; i >= 0 ; i--) {
            System.out.println(texto.charAt(i));
        }
        return texto;
     }
     */
    public static void main(String[] args) {

        // 0. Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        //reverse("Hola mundo");


        /*
        // 1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        String nombres[] = {"Franky", "Bridget", "Allie"};
        for(String nombre : nombres) {
            System.out.println(nombre);
        }

        // 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int numeros[][] = {
            {4, 0, 8},
            {7, 2, 5}
        };
        for(int i = 0; i < numeros.length; i++) {
            for(int j = 0; j < numeros[i].length; j++) {
                System.out.println("Posición de i: " + i + ", posición de j: " + j);
                System.out.println("Valor: " + numeros[i][j]);
            }
        }

        // 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<String> listaCompra = new Vector(5, 5);
        listaCompra.add("Tomates");
        listaCompra.add("Pimientos");
        listaCompra.add("Sandía");
        listaCompra.add("Espinacas");
        listaCompra.add("Lubina");

        listaCompra.remove(1);
        listaCompra.remove(2);

        for(String producto : listaCompra) {
            System.out.println(producto);
        }

        // 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        Vector<Integer> problemaVector = new Vector();
        /* Por defecto, Vector crea un array de 10 elementos.
        Cuando se sobrepasa, crea una copia de ese array y aumenta su capacidad en otros 10 elementos.
        Por tanto, para crear un array de 1000 elementos, crearía 100 copias, lo cual consume mucha memoria; NO es lo óptimo
        La solución es crear un vector con la capacidad lo más acorde posible a lo que necesitamos
        */

        /* 
        Vector<Integer> solucionVector = new Vector(1000);
        // O bien aumentar su índice de incremento de capacidad (o ambas)
        Vector<Integer> solucionVector2 = new Vector(1000,1000);

        // 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> temporadas = new ArrayList<>();
        temporadas.add("Temporada 1");
        temporadas.add("Temporada 2");
        temporadas.add("Temporada 3");
        temporadas.add("Temporada 4");

        LinkedList<String> temporadasLinked = new LinkedList<>(temporadas);

        System.out.println("ArrayList:");
        for(String temporada : temporadas) {
            System.out.println(temporada);
        }

        System.out.println("LinkedList:");
        for(String temporada : temporadas) {
            System.out.println(temporada);
        }
        */

        /* 
        // 6.1. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
        // Por último, vuelve a recorrerlo y muestra el ArrayList final. 
        ArrayList<Integer> contador = new ArrayList<>();
        System.out.println("Relleno el array:");
        for(int i = 0; i < 11; i++) {
            contador.add(i);
        }

        System.out.println("Elimino los pares:");
        for(int j = 0; j < contador.size(); j++) {
            if(contador.get(j) % 2 == 0) {
                contador.remove(contador.get(j));
            }
        }
        for(int num : contador) {
            System.out.println(num);
        }

        // 6.2. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        ArrayList<Integer> contador2 = new ArrayList<>();

        // Añado solamente los impares al array y los muestro por pantalla. 
        for(int i = 0; i < 11; i++) {
            if(i % 2 != 0) {
                contador2.add(i);
            }
        }

        for(int impar : contador2) {
            System.out.println(impar);
        }
        */

        // 7. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException 
        // que será capturada por su llamante (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
        // Finalmente, mostraremos en cualquier caso: "Demo de código".
        //System.out.println(DividePorCero(3, 0));

        // 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        // copyFile("C:/Windows/Tasks/SA.DAT", "copia.DAT");

        // 9. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
        /*
         * A partir de un archivo plantilla
         * Pedir al usuario por consola que escriba 3 deseos
         * Esos deseos se guardarán en un array dinámico
         * Los datos del archivo plantilla más los del array se guardarán en un nuevo archivo.
         */
        
        

    }

    /* 
    // 7. Crea una función DividePorCero.
    public static int DividePorCero(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
            throw new ArithmeticException();
        } finally {
            System.out.println("Demo del código");
        }
        return resultado;
    }
    */

    // 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    public static void copyFile(String fileIn, String fileOut) {
        try {
            // LEER
            InputStream in = new FileInputStream(fileIn);
            byte [] datos = in.readAllBytes();  // Crea un array de bytes con los datos del fileIn
            in.close(); // Es una buena práctica cerrar el archivo cuando acabamos con él.

            // IMPRIMIR
            PrintStream out = new PrintStream(fileOut);
            out.write(datos);   // Copia esos datos al fileOut
            out.close();
            
        } catch (Exception e) {
            System.out.println("El programa da error: " + e.getMessage());
        }
    }
}
