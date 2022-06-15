package sesion4_Poo.ejercicio4;

// 2. CREO UNA CLASE HIJA "SMARTPHONE"
public class SmartPhone extends SmartDevice {
    // Atributos
    int memoriaExterna;
    int pixelesCamara;
    String tipoWifi;
    int ram;

    // Constructores
    public SmartPhone(){}

    public SmartPhone(String modelo, String fabricante, int anyo, String sistemaOperativo, String tipoBateria,
            int duracionBateria, double pulgadasPantalla, String color, boolean resistenteAgua,
            int memoriaExterna, int pixelesCamara, String tipoWifi, int ram) {
        super(modelo, fabricante, anyo, sistemaOperativo, tipoBateria, duracionBateria, pulgadasPantalla, color,
                resistenteAgua);
        this.memoriaExterna = memoriaExterna;
        this.pixelesCamara = pixelesCamara;
        this.tipoWifi = tipoWifi;
        this.ram = ram;
    }

    // Métodos
    public void ampliarRam(int gb){
        this.ram += gb;
    }

    @Override
    public String toString() {
        return "SmartPhone [modelo=" + modelo 
        + "memoriaExterna=" + memoriaExterna + ", pixelesCamara=" + pixelesCamara + ", ram=" + ram
                + ", tipoWifi=" + tipoWifi + "]";
    }
    
}
