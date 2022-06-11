package Clases;

public abstract class CocheAbstracto {
    // atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Integer velocidad = 0;

    // constructores
    /*
     * No puede instanciarse, solo puede ser instanciada a través de clases hijas.
     * Es una forma de forzar la creación de clases heredadas para no tocar la clase principal (esta, la abstracta).
     * Sirve de base; tiene un código común a todas las clases, pero está incompleta.
     * Las clases hijas completan.
     */


    // comportamiento
    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }
}
