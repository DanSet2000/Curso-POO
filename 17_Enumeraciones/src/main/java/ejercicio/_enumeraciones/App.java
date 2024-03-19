package ejercicio._enumeraciones;


public class App {

    enum Color{
        ROJO, AZUL, VERDE, AMARILLO, NARANJA, NEGRO, BLANCO
    }
    
    
    public static void main(String[] args) {
        
        Color color = Color.AMARILLO;
        
        System.out.println("El color es: " + color);
        
        // Imprimir Todos
        for (Color colores: Color.values()){
            System.out.println("El Color es: " + colores);
        }
    }
}
