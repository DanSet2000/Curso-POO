package Model;


public class AnimalSobrecarga {
    
    // Atributos
    
    private int id_animal;
    private String descripcion;
    
    // Constructores
    
    // Getters and Setters
    
    // Metodos con el mismo nombre pero reciben distinta cantidad de Parámetros
    
    public void hacerSonido(){
        System.out.println("El animal hace sonido");
    }
    
    public void hacerSonido(String nombreAnimal){
        System.out.println("El animal " + nombreAnimal + " hace un sonido");
    }
    
    public void hacerSonido(String nombreAnimal, String tipoSonido){
        System.out.println("El animal " + nombreAnimal + "hace un sonido de tipo " + tipoSonido);
    }
    
}
