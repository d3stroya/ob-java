package sesion5.conInterfaces;

import java.util.List;
import sesion5.sinInterfaces.Empleado;

public interface EmpleadoCRUD {
    
    // Declaramos los métodos, pero no se implementan
    void save(Empleado empleado);  
    List<Empleado> findAll();
    void delete(Empleado empleado);
}
