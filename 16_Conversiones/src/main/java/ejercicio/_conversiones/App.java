package ejercicio._conversiones;

public class App {

    public static void main(String[] args) {
        
        String cantidad = "15";
        String precio = "150.27";
        double num = 1.67;
        int edad = 30;
        double estatura = 1.67;
        
        // Castear a Entero
        int numInt = (int) num;
        int cantEntero = Integer.parseInt(cantidad);
        
        // Castear a Double
        double precioDouble = Double.parseDouble(precio);
        
        // Castear a Long
        long numLong = (long) num;
        
        // Convertir a String
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Double: " + num);
        System.out.println("Entero: " + numInt);
        System.out.println("Long: " + numLong);
        
        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));
    
   
    }
}
