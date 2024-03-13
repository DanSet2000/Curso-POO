package Model;

public class Alumno {
    
    // PUBLIC: Se puede acceder desde cualquier lado
    // PRIVATE: Se puede acceder simplemente desde la clase donde se crea
    // PROTECTED: Se puede usar en la misma clase y sus clases hijo si hay herencia
    
    // Atributos
    private int id;
    private String nombre;
    private String apellido;
    
    // Constructores
    
    // Vacio
    public Alumno() {
    }

    // Con Parametros
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
    
    
    
    
    
    
}
