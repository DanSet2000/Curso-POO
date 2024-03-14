package Model;


public class Charmander extends Pokemon implements IFuego{
    
    // Constructores   
    public Charmander() {
    }

    
    // Metodos
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy Charmander y ataco con Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola, soy Charmander y ataco con Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola, soy Charmander y ataco con Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola, soy Charmander y ataco con Punio Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola, soy Charmander y ataco con Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola, soy Charmander y ataco con Ascuas");
    }
    
}
