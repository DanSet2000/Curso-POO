package Model;

public class Alumno {
    
    // Declaracion de variables
    int id;
    String nombre;
    String apellido;
    
    // Crear el constructor vacío
    public Alumno() {
    }

    // Crear el constructor con parametros
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
     
    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    // Declaracion de los Metodos
    
    // Void indica para metodos que realizan algo pero no obtienen una respuesta
    public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y me llamo" + this.getNombre());
    }
    
    public void saberAprobado(double calificacion){
        
        if (calificacion >= 6){
            System.out.println("Ha aprobado la materia");
        }else{
            System.out.println("Ha reprobado la materia");
        }
    }
    
}
