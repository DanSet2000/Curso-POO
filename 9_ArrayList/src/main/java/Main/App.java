package Main;

import Model.Persona;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        // Crear un ArrayList para guardar objetos de Tipo Persona
        
        // Una lista de Persona
        List<Persona> lista = new ArrayList<Persona>();
        
        // Agregar algo nuevo en la lista
        lista.add(new Persona(1, "Daniel", 23));
        lista.add(new Persona(2, "Juan", 23));
        lista.add(new Persona(3, "Maria", 20));
        lista.add(new Persona(4, "Martha", 35));
        
        System.out.println("-------- Recorrido usando for clasico -------");
       
        // Recorrer la  lista por indice
        for (int i = 0; i < lista.size(); i++){
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        
        System.out.println("-------- Recorrido usando for each -------");
        
        // Recorrido usando for each
        for (Persona person:lista){
            System.out.println("Prueba: " + person.getNombre());
        }
    }
}
