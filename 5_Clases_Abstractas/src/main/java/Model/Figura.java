package Model;

public abstract class Figura {
    
    // Atributos
    protected double ladoX;     // Posicion en X
    protected double ladoY;     // Posicion en Y
    
    // Constructores

    protected Figura() {
    }

    protected Figura(double ladoX, double ladoY) {
        this.ladoX = ladoX;
        this.ladoY = ladoY;
    }
       
    
    // Métodos
    
    // Simplemente se declara el método.
    public abstract double calcularArea();
    
}
