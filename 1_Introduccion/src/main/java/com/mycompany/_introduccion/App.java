package com.mycompany._introduccion;

import Model.Alumno;


public class App {

    public static void main(String[] args) {
        
        // Instanciar Objeto
        
        Alumno alumno1 = new Alumno(1, "Daniel", "Carvajal");
        Alumno alumno2 = new Alumno();
        
        // Usando los Getters para obtener el ID del Alumno 1
        System.out.println("El id del alumno 1 es: " + alumno1.getId());
        
        // Usando los Setters para el Alumno que usa el constructor vacio
        alumno2.setId(4);
        alumno2.setNombre("Carlos");
        alumno2.setApellido("Perez");
        
        System.out.println("El id del alumno 2 es: " + alumno2.getId() + ""
                + " y se se llama: " + alumno2.getNombre() + " " + alumno2.getApellido());
        
    }
}
