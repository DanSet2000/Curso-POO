package Model;


public class Bulbasaur extends Pokemon implements IPlanta{

    // Constructor
  
    public Bulbasaur() {
    }

    
    // Metodos
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy Bulbasaur y ataco con Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola, soy Bulbasaur y ataco con Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola, soy Bulbasaur y ataco con Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y ataco con Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola, soy Bulbasaur y ataco con Paralizar");
    }
    
}
