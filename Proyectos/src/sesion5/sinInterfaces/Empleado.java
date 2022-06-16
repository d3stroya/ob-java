package sesion5.sinInterfaces;

public class Empleado {

    // ATRIBUTOS
    String nombre;
    int edad;
    double salario;
    boolean alta;

    // CONSTRUCTORES
    public Empleado(){}
    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    // MÉTODOS
    
    @Override
    public String toString() {
        return "Empleado [alta=" + alta + ", edad=" + edad + ", nombre=" + nombre + ", salario=" + salario + "]";
    }

    
}
