package sesion7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class TiposDatosAvanzados {
    public static void main(String[] args) {
        /* 
        // 1. CADENAS DE TEXTO
        String cadena = "Mensaje";

        int cadenaLen = cadena.length();
        System.out.println("Longitud de cadena: " + cadenaLen);

        String cadenaMayus = cadena.toLowerCase();
        System.out.println("La cadena en minúsculas: " + cadenaMayus);

        String cadenaUpper = cadena.toUpperCase();
        System.out.println("La cadena en mayúsculas iniciales: " + cadenaUpper);

        boolean resultado = cadena.startsWith("Men");
        System.out.println("¿Empieza por 'Men'? " + resultado);

        boolean resultado2 = cadena.endsWith("O");
        System.out.println("Acaba en 'O'? " + resultado2);

        char letra = cadena.charAt(0);
        System.out.println("El caracter es: " + letra); // Posición de un caracter

        // Atravesar una cadena
        for(int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }
        */

        /*
        // 2. ARRAYS: variable con múltiples valores consecutivos de un mismo tipo.
        // Tipo de dato --- nombre --- []
        int arrayUno[] = new int[5]; // Array de 5 elementos, máximo.
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        for(int i : arrayUno) {
            System.out.println(i);
        }

        int arrayDos[] = {1, 2, 3, 4, 5};   // Array con valores que sabemos de antemano

        for (int i : arrayDos) {
            System.out.println(i);
        }

        String nombres[] = {
            "Franky",
            "Bridget",
            "Tess"
        };

        System.out.println("Longitud del array: " + nombres.length);    // En los arrays "length" es una propiedad, no un método
        
        // Recorrer arrays:
        System.out.println("Foreach:");
        for (String i : nombres) {      // Foreach
            System.out.println(i);
        }

        System.out.println("For:");
        for(int i = 0; i < nombres.length; i++) {       // For --> Permite conocer el índice (i = index)
            System.out.println(nombres[i] + " en posición " + i);
        }

        int arrayBidimensional[][] = new int [2][4];    // El primer [] es el número de filas y el segundo es el número de columnas
        arrayBidimensional[0][0] = 1;
        arrayBidimensional[0][1] = 2;
        arrayBidimensional[0][2] = 3;
        arrayBidimensional[0][3] = 4;
        arrayBidimensional[1][0] = 10;
        arrayBidimensional[1][1] = 20;
        arrayBidimensional[1][2] = 30;
        arrayBidimensional[1][3] = 40;

        for(int f = 0; f < arrayBidimensional.length; f++) {
            System.out.println("Valor de f: " + f);    // Fila

            for(int c = 0; c < arrayBidimensional[f].length; c++){
                System.out.println("Valor de f: " + f + " y valor de c: " + c);    // Columna
                System.out.println(arrayBidimensional[f][c]);   // Valor de cada celda
            }
        }

        int arrayBidimensional2[][] = {
            {1, 2, 3, 4},
            {10, 20, 30, 40}
        };

        for(int f = 0; f < arrayBidimensional2.length; f++) {
            System.out.println("Valor de f: " + f);    // Fila

            for(int c = 0; c < arrayBidimensional2[f].length; c++){
                System.out.println("Valor de f: " + f + " y valor de c: " + c);    // Columna
                System.out.println(arrayBidimensional[f][c]);   // Valor de cada celda
            }
        }
        */

        /*
        // 3. VECTORES: se ajustan automáticamente al número y tipo de datos que tengamos
        // Vector --- Tipo de  --- nombre --- = new Vector()
        Vector<Integer> vector = new Vector();
        vector.add(1);  // Añade elementos al vector
        vector.add(2);
        vector.add(3);
        System.out.println(vector);

        vector.remove(1); // Elimina un elemento indicando el índice
        System.out.println(vector);
        
         
        //    El vector crea por debajo un array con una capacidad (10)
        //    El número de elementos (size) es igual a los que hemos añadido con add
        //    La capacidad aumenta (a 20) cuando se sobrepasa la capacidad anterior (10), 
        //    es decir, hay más elementos que la capacidad (p.e: 12 > 10). 
        //    El vector crea un nuevo array de capacidad 10 por defecto.
        //    Esto copia los elementos del array1 (c = 10) al array2 (c = 20), 
        //    lo que aumenta el uso de memoria. Hay que evitarlo en la medida de lo posible.
        //    Una vez que aumenta la capacidad, ya no decrece.
        
        System.out.println("Vector tamaño: " + vector.size() + " y capacidad: " + vector.capacity());   

        // Podemos indicar la capacidad del vector y su incremento de capacidad
        Vector<Integer> vector2 = new Vector(3, 3);
        vector2.add(1);  // Añade elementos al vector
        vector2.add(2);
        vector2.add(3);
        vector2.add(4); // Sobrepasa la capacidad 3 elementos, así que aumenta otros 3
        System.out.println("Vector tamaño: " + vector2.size() + " y capacidad: " + vector2.capacity());   

        Vector<Integer> vector3 = new Vector();
        vector3.add(1);
        vector3.add(2);

        // Comparar vectores
        boolean resultado = vector.equals(vector3);
        System.out.println("¿Son iguales vector y vector 3? " + resultado);

        // Recorrer un vector
        Vector<Integer> vector4 = new Vector(128);
        vector4.add(1);
        vector4.add(2);
        vector4.add(3);
        vector4.add(4);

        for(int i : vector4){
            System.out.println("Valor actual: " + i);
        }

        for(int i = 0; i < vector4.size(); i++){
            if(i % 2 == 0){
                vector4.remove(i);
                continue;   // Como elimino la posición, hay que "continuar" (vuelve a la condición) y no acceder a ella.
            }
            System.out.println("Valor: " + vector4.get(i) + " en posición " + i);
        }

        // Hacer más pequeño un vector
        Vector<Integer> vector5 = new Vector(16);
        System.out.println("Capacidad del vector: " + vector5.capacity() + ". Tamaño: " + vector5.size());
        vector5.trimToSize();   // Reduce la capacidad del vector hasta tu tamaño
        System.out.println("Capacidad del vector: " + vector5.capacity() + ". Tamaño: " + vector5.size());
        */

        /*
        // 4. ARRAY LIST. Se usan para programación secuencial, mientras los vectores se utilizan para programación concurrente (en paralelo)
        // Aumenta su capacidad en un 50%
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Franky");
        lista.add("Bridget");
        lista.add("Tess");

        System.out.println(lista);
        lista.remove("Tess");   // Es equivalente a list.remove(2);
        System.out.println(lista);

        for(String nombre : lista){
            System.out.println(nombre);
        }

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        // Convertir arraylist en array
        String array[] = new String[lista.size()];
        for(int i = 0; i < lista.size(); i++){  // Necesitamos el índice para hacer la conversión (for, no foreach)
            array[i] = lista.get(i);
        }

        // Otra forma de convertirlo en array
        for(Object arrayObjeto : lista.toArray()){
            System.out.println(arrayObjeto.toString());
        }
        */

        /*
        // 5. LINKED LIST: no utiliza un array, sino una estructura de datos llamada lista doblemente enlazada. 
            // El array es mucho más rápido para almacenar y buscar datos.
            // La linked list es más rápida para modificar datos.
            // El array deriva de List, por tanto hereda sus métodos
            // La linked list implementa la interfaz List y Decke?
        LinkedList<String> listaEnlazada = new LinkedList(lista);
        */

        /* 
        // 6. BIG DECIMAL: clase para números que requieran una gran precisión, porque float y double dan problemas (son menos precisos y generan errores).
            // No se opera como con int, float o double; hay que usar los métodos de la clase.
            // Se usa en campos financieros
        BigDecimal valorA = new BigDecimal(0.1);
        BigDecimal valorB = new BigDecimal(4);
        BigDecimal producto = valorA.multiply(valorB); // Multiplica el valorA por valorB 
        System.out.println("Producto: " + producto);

        BigDecimal suma = valorA.add(valorB); // Suma
        System.out.println("Suma: " + suma);
        */

        /* 
        // 7. MAPA O ARRAY ASOCIATIVO: especie de diccionario con pares clave-valor.
        // La clave no puede estar duplicada. Si se repite una clave, sobreescribe el valor
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 10);  // Añade un elemento al mapa
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);
        mapa.put("clave3", 40); // Sobreescribe el valor de la clave3
        mapa.replace("clave3", 90);  // La forma más correcta de sobreescribir. Si no existe la clave, no se crea, la ignora.
        mapa.replace("clave4", 90);  // No hace nada porque no existe la clave.
        mapa.remove("clave2");  // Elimina la clave indicada y su valor.

        System.out.println(mapa);
        System.out.println(mapa.get("clave1"));     // Muestra el valor de la clave que se pasa como parámetro

        // Recorrer un mapa
        for(Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());  // Obtiene la clave
            System.out.println("Elemento valor es: " + elemento.getValue());    // Obtiene el valor
        }

        TreeMap<String, Integer> arbolRojoNegroBinario = new TreeMap<>();
        */
    }
}