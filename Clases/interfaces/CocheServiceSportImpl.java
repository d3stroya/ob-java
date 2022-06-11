package Clases.interfaces;

import Clases.Coche;
import Clases.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un coche deportivo");
        return new CocheElectrico();
    }
}
