package Clases;

public class CocheElectrico extends Coche {
    String motorElectrico;

    public CocheElectrico(){}

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, String motorElectrico){
        // super() invoca a un constructor de la clase superior. Ctrl + clic lleva al constructor superior
        super(color, fabricante, modelo, peso);
        this.motorElectrico = motorElectrico;
    }

    // Para evitar duplicar código:
    @Override   // sobreescribe el método heredado del mismo nombre
    public void acelerar(Integer cantidad){
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);   // super permite acceder al método de la clase superior.
    }

}
