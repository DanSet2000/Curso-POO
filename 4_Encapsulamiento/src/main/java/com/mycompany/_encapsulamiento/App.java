package com.mycompany._encapsulamiento;

import Model.Alumno;

public class App {

    public static void main(String[] args) {
        
        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno(1, "Daniel", "Carvajal");
        
        System.out.println("id: " + alumno2.getId());
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println("Apellido: " + alumno2.getApellido());
    }
}
