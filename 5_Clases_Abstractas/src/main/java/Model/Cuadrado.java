package Model;

public class Cuadrado extends Figura{

    // Atributos
    private double lado;
    
    // Constructor

    public Cuadrado() {
    }

    public Cuadrado(double lado, double ladoX, double ladoY) {
        super(ladoX, ladoY);
        this.lado = lado;
    }
    

    // Métodos
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
    
}
