package ejercicio._relaciones;

import Model.Auto;
import Model.Propietario;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        
        // Crear un objeto auto
        Auto auto = new Auto();
        
        // Asignar datos al Auto
        auto.setId(1L);
        auto.setMarca("Renault");
        auto.setModelo("Duster");
        
        // Crear lista propietarios vacia
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        
        // Creacion dos objetos propietario vacios
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        
        // Setear datos para los propietarios
        prop1.setId(1L);
        prop1.setNombre("Daniel");
        prop1.setApellido("Carvajal");
        
        prop2.setId(2L);
        prop2.setNombre("Juan");
        prop2.setApellido("Sarabia");
        
        // Agregar propietarios a la Lista
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        
        // Agregar lista propietarios al Auto
        auto.setListaPropietarios(listaPropietarios);
        
        System.out.println("El auto: " + auto.getMarca() + " " + auto.getModelo()
        + "tiene como propietarios a: " + auto.getListaPropietarios().toString());
    }
}
