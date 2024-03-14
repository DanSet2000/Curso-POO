package Model;


public class Squirtle extends Pokemon implements IAgua{
    
    // Constructores
    public Squirtle() {
    }
    
    // Metodos
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy Squirtle y ataco con Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola, soy Squirtle y ataco con Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola, soy Squirtle y ataco con Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola, soy Squirtle y ataco con Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola, soy Squirtle y ataco con Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola, soy Squirtle y ataco con Pistola Agua");
    }
    
    
    
}
