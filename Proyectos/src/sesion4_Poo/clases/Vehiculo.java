package sesion4_Poo.clases;

public class Vehiculo {
    // Definimos la "plantilla" general a partir de la cual crear objetos concretos
    // Es la clase superior

        // 1. ATRIBUTOS
        protected String fabricante;
        protected String modelo;
        protected Double cc;  // Double permite null; double, no.
        protected int anyo;
        protected boolean sport;
        protected int velocidad = 0;
        protected Motor motor;    // objeto de la clase Motor

        // 2. CONSTRUCTORES
        public Vehiculo(){} // Constructor vacío. No puedo pasarle ningún valor, porque no tiene parámetros.
       
        // Aplicando sobrecarga:
        public Vehiculo(String fabricante, String modelo, Double cc, int anyo, boolean sport, Motor motor){  // Constructor con parámetros
            this.fabricante = fabricante;   // El fabricante (atributo) es el fabricante (parámetro) que le pasemos. "this" hace referencia al atributo de la clase.
            this.modelo = modelo;
            this.cc = cc;
            this.anyo = anyo;
            this.sport = sport;
            this.motor = motor;
        }

        public Vehiculo(String fabricante, String modelo) {     // Constructor solo con algunos parámetros
            this.fabricante = fabricante;
            this.modelo = modelo;
        }

        // 3. COMPORTAMIENTO
        public void acelerar(int kmh) {
            if(this.velocidad <= 120 && kmh <= 120){
                this.velocidad += kmh;
            } else {
                System.out.println("¡Acción denegada!");
            }
        }
}
