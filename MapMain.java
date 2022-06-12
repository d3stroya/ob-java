import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        
        Map<String, String> personas = new HashMap<>();

        personas.put("24356983", "Franky Doyle");
        personas.put("54896123", "Bridget Westfall");
        personas.put("87912654", "Vera Bennett");

        System.out.println(personas);

        // Iterar sobre el mapa
        // Extraer la clave
        for(String key : personas.keySet()) {
            System.out.println(key);
        }
        // Extraer el mapa, el valor
        for(String value : personas.values()) {
            System.out.println(value);
        }
        // Extraer ambos valores
        for(Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
