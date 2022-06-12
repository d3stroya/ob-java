package ConceptosBásicos.Clases.interfaces;

import ConceptosBásicos.Clases.Coche;
import ConceptosBásicos.Clases.CocheElectrico;

public class CocheServiceClassicImpl implements CocheService{
    // Estas clases están obligadas a implementar los métodos de la interfaz.
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un coche clásico");
        return new CocheElectrico();
    }
}
