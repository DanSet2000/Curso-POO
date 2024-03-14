package Model;

public class Circulo implements Figura, Rotable, Dibujable{

    // Atributos
    private double radio;
    
    // Constructores

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    // Metodos

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * (radio*radio);
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");

    }
    
}
