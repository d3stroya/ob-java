package sesion5.conInterfaces;

import sesion5.sinInterfaces.Empleado;

public class Main {

    /*
     * Las interfaces permiten hacer cambios sin tener que modificar todo el código.
     * Actúa de intermediario entre clases y main.
     * Es como un contrato que dice lo que hay que hacer, pero no cómo.
     * Luego se pueden crear diferentes clases con diferentes formas de implementarlo,
     * sin que suponga grandes cambios en el main, solo hay que crear un objeto a partir
     * de la nueva clase:
     */
    // static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCrudMySQL();


    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
    }
}
