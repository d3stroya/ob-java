package sesion4_Poo.ejercicio4;

// 1. CREO CLASE SMARTDEVICE
public class SmartDevice {
    // Atributos
    String modelo;
    String fabricante;
    int anyo;
    String sistemaOperativo;
    String tipoBateria;
    int duracionBateria;
    double pulgadasPantalla;
    String color;
    boolean resistenteAgua;

    // Constructores
    public SmartDevice(){}

    public SmartDevice(String modelo, String fabricante, int anyo, String sistemaOperativo, String tipoBateria,
            int duracionBateria, double pulgadasPantalla, String color, boolean resistenteAgua) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.anyo = anyo;
        this.sistemaOperativo = sistemaOperativo;
        this.tipoBateria = tipoBateria;
        this.duracionBateria = duracionBateria;
        this.pulgadasPantalla = pulgadasPantalla;
        this.color = color;
        this.resistenteAgua = resistenteAgua;
    }

    @Override
    public String toString() {
        return "SmartDevice [anyo=" + anyo + ", color=" + color + ", duracionBateria=" + duracionBateria
                + ", fabricante=" + fabricante + ", modelo=" + modelo + ", pulgadasPantalla=" + pulgadasPantalla
                + ", resistenteAgua=" + resistenteAgua + ", sistemaOperativo=" + sistemaOperativo
                + ", tipoBateria=" + tipoBateria + "]";
    }

}
