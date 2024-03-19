package ejercicio._linkedlist;

import Model.Persona;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {

    public static void main(String[] args) {
                
        // Crear un LinkedList para guardar objetos de Tipo Persona
        
        // Una lista de Persona
        List<Persona> lista = new LinkedList<Persona>();
        
        // Agregar personas al final de la lista
        lista.add(new Persona(1, "Daniel", 23));
        lista.add(new Persona(2, "Juan", 23));
        lista.add(new Persona(3, "Maria", 20));
        lista.add(new Persona(4, "Martha", 35));
        
        // Agregar al Principio de la Lista
        lista.add(0, new Persona(5, "Luis", 25));
        
        // Siempre usar el for each
        System.out.println("-------- Recorrido usando for each -------");
        
        // Recorrido usando for each
        for (Persona person:lista){
            System.out.println("Prueba: " + person.getNombre());
        }
        
        
        // Crear una ArrayList
        List<Persona> listaArray = new ArrayList<Persona>();
        
        listaArray.add(new Persona(1, "Luisina", 30));
        listaArray.add(new Persona(2, "Gabriel", 30));
        listaArray.add(new Persona(3, "Ibra", 9));
        listaArray.add(new Persona(4, "Daniel", 2));
        
        // Crear una LinkedList
        List<Persona> listaLinked = new LinkedList<Persona>();
        
        listaLinked.add(new Persona(1, "Luisina", 30));
        listaLinked.add(new Persona(2, "Gabriel", 30));
        listaLinked.add(new Persona(3, "Ibra", 9));
        listaLinked.add(new Persona(4, "Daniel", 2));
        
        
        //Remove en ArrayList
        listaArray.remove(1);
        
        //Remove en LinkedList
        String nombreBorrar = "Gabriel";
        for(Persona persona2: listaLinked){
            if(persona2.getNombre().equals(nombreBorrar)){
                listaLinked.remove(persona2);
                break; // Deja de Recorrer
            }
        }
        
                
        System.out.println("------------- LUEGO DE ELIMINAR ------------");
        // Recorrido por For Each
        System.out.println("--------- ARRAYLIST ---------");
        
        for (Persona persona: listaArray){
            System.out.println("Elemento: " + persona.getNombre());
        }
       
                        
        System.out.println("------------- LUEGO DE ELIMINAR ------------");
        // Recorrido por For Each
        System.out.println("--------- LINKEDLIST ---------");
        
        for (Persona persona: listaLinked){
            System.out.println("Elemento: " + persona.getNombre());
        }
        
        
        // METODOS EXTRA
        
        // Tamaño de la lista
        
        System.out.println("------------- TAMAÑO DE LA LISTA -----------");
        System.out.println("ArrayList: "+ listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        
        // Obtener el primer objeto (Excluviso de Linked List)
        System.out.println("------------- PRIMER Y ULTIMO OBJETO DE LA LISTA -----------");
        System.out.println("------------- EXCLUSIVO DE LINKED LIST  -----------");
        //System.out.println("Primer Elemento LinkedList: " + listaLinked.getFirst().toString());
        //System.out.println("Ultimo Elemento LinkedList: " + listaLinked.getLast().toString());

        // Borrar toda la Lista
        System.out.println("------------- BORRANDO LISTAS  -----------");
        listaArray.clear();
        listaLinked.clear();
        
        // Comprobar si la Lista esta vacia
        System.out.println("------------- ESTÁ VACIA ALGUNA LISTA??  -----------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
        
        
    
    
    }
}
