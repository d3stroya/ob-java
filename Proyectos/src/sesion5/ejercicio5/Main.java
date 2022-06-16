package sesion5.ejercicio5;

public class Main {
    
    //      Interfaz ----------- Implemetación //
    static CocheCRUD coche = new CocheCRUDImpl();
    
    public static void main(String[] args) {
        Coche fiat = new Coche("Rojo", 4, 130, false);

        coche.save(fiat);
        coche.findAll();
        coche.delete(fiat);
    }
}
