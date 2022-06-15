package sesion4_Poo.ejercicio4;

// 3. CREO UNA SEGUNDA CLASE HIJA "SMARTWATCH"
public class SmartWatch extends SmartDevice {
    // Atributos
    boolean podometro;
    String tipoCorrea;
    String colorCorrea;
    boolean frecuenciaCardiaca;

    // Constructores
    public SmartWatch(){}
  
    public SmartWatch(String modelo, String fabricante, int anyo, String sistemaOperativo, String tipoBateria,
            int duracionBateria, double pulgadasPantalla, String color, boolean resistenteAgua,
            boolean podometro, String tipoCorrea, String colorCorrea, boolean frecuenciaCardiaca) {
        super(modelo, fabricante, anyo, sistemaOperativo, tipoBateria, duracionBateria, pulgadasPantalla, color,
                resistenteAgua);
        this.podometro = podometro;
        this.tipoCorrea = tipoCorrea;
        this.colorCorrea = colorCorrea;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public void cambiarColorCorrea(String color){
        this.colorCorrea = color;
    }

    @Override
    public String toString() {
        return "SmartWatch [colorCorrea=" + colorCorrea + ", frecuenciaCardiaca=" + frecuenciaCardiaca + ", podometro="
                + podometro + ", tipoCorrea=" + tipoCorrea + "]";
    }
    
}
