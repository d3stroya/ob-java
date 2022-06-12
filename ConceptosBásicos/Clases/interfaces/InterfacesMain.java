package ConceptosBásicos.Clases.interfaces;

import ConceptosBásicos.Clases.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        // Aplica polimorfismo
        CocheService service1 = new CocheServiceClassicImpl();
        CocheService service2 = new CocheServiceSportImpl();

        // Partiendo de la misma interfaz, hacemos dos implementaciones distintas, y obtenemos dos salidas distintas.
        // Ambas crean un coche demo (interfaz), pero uno es clásico y otro deportivo.
        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();
    }
}
