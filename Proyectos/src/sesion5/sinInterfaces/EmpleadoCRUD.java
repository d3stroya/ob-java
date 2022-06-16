package sesion5.sinInterfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    // ESTRUCTURA DE DATOS: Array list dinámico donde guardar los empleados
    List<Empleado> empleados = new ArrayList<>();
    
    // OPERACIONES CRUD

    // CREATE: Guardar un empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}
