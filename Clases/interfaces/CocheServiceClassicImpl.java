package Clases.interfaces;

import Clases.Coche;
import Clases.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{
    // Estas clases están obligadas a implementar los métodos de la interfaz.
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un coche clásico");
        return new CocheElectrico();
    }
}
