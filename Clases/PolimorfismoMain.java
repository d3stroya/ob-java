package Clases;

public class PolimorfismoMain {
    // Permite crear objetos de clases hijas a partir de clases superiores
    public static void main(String[] args) {
        Coche coche = new Coche();
        Coche cocheElectrico = new CocheElectrico();
        Coche cocheHibrido = new CocheHibrido();

        // instanceof permite saber si un objeto es de una clase
        if(cocheElectrico instanceof Coche){
            System.out.println("Es un coche");
        }   // true

        if(cocheElectrico instanceof CocheElectrico){
            System.out.println("Es un coche eléctrico");
        }   // true

        if(cocheElectrico instanceof CocheHibrido){
            System.out.println("Es un coche híbrido");
        }   // false
    }
}
