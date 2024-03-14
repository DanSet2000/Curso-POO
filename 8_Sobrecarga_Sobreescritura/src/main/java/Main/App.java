package Main;

import Model.Gato;
import Model.Perro;

public class App {

    public static void main(String[] args) {
        
        Perro bruno = new Perro();
        Gato copito = new Gato();
        
        copito.hacerSonido();   
        bruno.hacerSonido();
    }
}
