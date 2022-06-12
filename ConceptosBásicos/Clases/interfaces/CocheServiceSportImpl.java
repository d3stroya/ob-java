package ConceptosBásicos.Clases.interfaces;

import ConceptosBásicos.Clases.Coche;
import ConceptosBásicos.Clases.CocheElectrico;

public class CocheServiceSportImpl implements CocheService {
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando un coche deportivo");
        return new CocheElectrico();
    }
}
