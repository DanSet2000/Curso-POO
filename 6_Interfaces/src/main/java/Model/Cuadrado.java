package Model;

public class Cuadrado implements Figura, Dibujable{

    // Atributos
    private double lado;
    
    // Constructor

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Métodos
    
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado");
    }
    
    
}
