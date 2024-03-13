package com.mycompany._polimorfismo;

import Model.Consultor;
import Model.Empleado;
import Model.Jefe;
import Model.Persona;

public class App {

    public static void main(String[] args) {
        
        // Aplicacion de Polimorfismo 
        Persona vector[] = new Persona[5];
        
        vector[0] = new Persona();      // Clase Padre
        vector[1] = new Empleado();     // Clase Hijo
        vector[2] = new Consultor();    // Clase Hijo
        vector[3] = new Jefe();         // Clase Hijo
        
        
        // Aplicacion de Polimorfismo
        Persona persona = new Persona();
        
        Consultor consultor = new Consultor();
        
        persona = consultor;
        //consultor = persona;
        
        // Funciona asignar de un Hijo a su Padre
        // Pero no funciona asignar un Padre a su Hijo
    }
}
