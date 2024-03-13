package Model;

public class Circulo extends Figura{

    // Atributos
    private double radio;
    
    // Constructores

    public Circulo() {
    }

    public Circulo(double radio, double ladoX, double ladoY) {
        super(ladoX, ladoY);
        this.radio = radio;
    }
    
    
    
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * (radio*radio);
        return resultado;
    }
    
}
