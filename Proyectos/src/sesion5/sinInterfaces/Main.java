package sesion5.sinInterfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();
        
        Empleado Ana = new Empleado("Ana", 30, 40341.26, true);
        Empleado Pablo = new Empleado("Pablo", 34, 39576.32, true);
        Empleado Carla = new Empleado("Carla", 29, 39965.89, true);

        // GUARDAR EMPLEADOS
        empleadoCRUD.guardar(Ana);     
        empleadoCRUD.guardar(Pablo);
        empleadoCRUD.guardar(Carla);

        // CONSULTAR EMPLEADOS
        List <Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }    
}
