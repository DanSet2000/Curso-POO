package Model;


public class Jefe extends Persona{
    
    // Declaracion de Atributos
    int id_jefe;
    String departament_jefe;
    
    // Constructores

    public Jefe() {
    }

    public Jefe(int id_jefe, String departament_jefe, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departament_jefe = departament_jefe;
    }
    
    // Getters and Setters

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartament_jefe() {
        return departament_jefe;
    }

    public void setDepartament_jefe(String departament_jefe) {
        this.departament_jefe = departament_jefe;
    }
    
    
    
}
