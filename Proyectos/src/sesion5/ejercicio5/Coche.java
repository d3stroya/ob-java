package sesion5.ejercicio5;

public class Coche {
    String color;
    int numPuertas;
    int potencia;
    boolean sport;

    public Coche(){}
    public Coche(String color, int numPuertas, int potencia, boolean sport) {
        this.color = color;
        this.numPuertas = numPuertas;
        this.potencia = potencia;
        this.sport = sport;
    }
    
    @Override
    public String toString() {
        return "Coche [color=" + color + ", numPuertas=" + numPuertas + ", potencia=" + potencia + ", sport=" + sport
                + "]";
    }
    
}
