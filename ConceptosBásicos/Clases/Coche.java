package ConceptosBásicos.Clases;

public class Coche {
  
        // atributos
        String color;
        String fabricante;
        String modelo;
        Double peso;
        Integer velocidad = 0;

        // constructores
        public Coche(){}
        
        public Coche(String color, String fabricante, String modelo, Double peso){
            this.color = color;
            this.fabricante = fabricante;
            this.modelo = modelo;
            this.peso = peso;
            this.velocidad = velocidad;
        }

        // comportamiento
        public void acelerar(Integer cantidad) {
            if(cantidad > 0 && cantidad <= 120) {
                this.velocidad += cantidad;
            }
        }

        public String toString() {
            return "Coche{" +
            "color= " + color + 
            ", fabricante= " + fabricante +
            ", modelo= " + modelo +
            ", peso= " + peso +
            ", velocidad= " + velocidad;

        }
}