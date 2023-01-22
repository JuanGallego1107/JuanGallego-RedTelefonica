import com.redes.LineaTelefonica;

public class Main {
    public static void main(String[] args) {
        LineaTelefonica objeto = new LineaTelefonica();
        objeto.estrato1 = 1;
        objeto.descuento1 = (double) (Math.random() * 25.5);
        objeto.numLlamadas1 = (int) (Math.random() * 100);
        System.out.println("El descuento de la linea telefonica de estrato 1 es de " + objeto.discount1());
        System.out.println("El valor total de las llamadas es de " + objeto.aplicarDescuento1());
        System.out.println("--------------------------------------------");

        objeto.estrato2 = 2;
        objeto.descuento2 = (double) (Math.random() * 25.5);
        objeto.numLlamadas2 = (int) (Math.random() * 100);
        System.out.println("El descuento de la linea telefonica de estrato 2 es de " + objeto.discount2());
        System.out.println("El valor total de las llamadas es de " + objeto.aplicarDescuento2());
        System.out.println("--------------------------------------------");

        objeto.estrato3 = 3;
        objeto.descuento3 = (double) (Math.random() * 25.5);
        objeto.numLlamadas3 = (int) (Math.random() * 100);
        System.out.println("El descuento de la linea telefonica de estrato 3 es de " + objeto.discount3());
        System.out.println("El valor total de las llamadas es de " + objeto.aplicarDescuento3());
        System.out.println("--------------------------------------------");

        System.out.println("El valor total de todas las lineas telefonicas es de "+ objeto.aplicarDescuentoATodos());
    }
}
