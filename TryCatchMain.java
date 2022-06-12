public class TryCatchMain {
    public static void main(String[] args) {

        // try cactch permite que el programa continúe aunque haya algún fallo. Sin él, todo lo que venga después del error no se ejecutaría.
        
        try {
            // Código que puede producir problemas
            int result = 5/0;

            // Acción que se lleva a cabo si hay problemas: catch ([tipoExcepción] e)
        } catch (ArithmeticException e) {
            // Imprime la excepción
            e.printStackTrace();

            // Cerrar recursos. Se va a ejecutar siempre, haya fallo o no.
        } finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");

    }
}
