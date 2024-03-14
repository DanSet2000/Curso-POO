package Model;


public class Perro extends AnimalSobrescribe{

    // Atributos
    private String nombrePerro;
    private double peso;
    private String raza;
    private String sexo;
    
    
    // Metodo Sobrescritura
    @Override
    public void hacerSonido() {
        System.out.println("Soy un perro y hago el sonido guau guau");
    }
    
}
