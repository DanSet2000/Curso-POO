package Main;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        
        // Declaracion del Hash Map
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(1523, "Daniel");
        mapaEmpleados.put(1524, "Juan");
        mapaEmpleados.put(1525, "Gabriela");
        mapaEmpleados.put(1526, "Hector");
        mapaEmpleados.put(1527, "Michelle");

        boolean estado = mapaEmpleados.containsValue("Daniel");
        
        if(estado == true){
            System.out.println("El Empleado buscado esta");
        }else{
            System.out.println("El Empleado buscado NO esta");
        }
        
        boolean estadoKey = mapaEmpleados.containsKey(1522);
        
        if(estadoKey == true){
            System.out.println("La Clave buscado esta");
        }else{
            System.out.println("La Clave buscado NO esta");
        }
        
        // Devuelve todos los valores
        System.out.println(mapaEmpleados.values());
        
        // Devuelve todas las Keys
        System.out.println(mapaEmpleados.keySet());
        
        // Obtener el valor asociado a una Key
        String nombre = mapaEmpleados.get(1524);
        
        System.out.println("El Empleado buscado es: " + nombre);
        
        // Eliminar un valor del mapa
        mapaEmpleados.remove(1527);
        
    }
}
