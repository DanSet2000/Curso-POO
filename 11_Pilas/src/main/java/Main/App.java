package Main;

import java.util.Stack;


public class App {

    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();
        
        System.out.println("Lista vacía: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());
        
        // Agregar Elementos
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        
        // Recorrido por la Pila
        for (Integer pilita: pila){
            System.out.println(pilita);
        }
        
        // Mostrar
        System.out.println("Lista vacía: " + pila);
        System.out.println("Está vacía? " + pila.isEmpty());
        
        pila.pop(); // Eliminar el ultimo registro que entró
        
        System.out.println("Está el 3?: " + "Está en la posición " + pila.search(3));
        System.out.println("Ultimo agregado: " + pila.peek());
    }
}
