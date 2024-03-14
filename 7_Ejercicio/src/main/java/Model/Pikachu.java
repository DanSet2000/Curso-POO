package Model;


public class Pikachu extends Pokemon implements IElectrico{

    // Constructor
    
    public Pikachu() {
    }

    
    // Metodos
    @Override
    public void atacarPlacaje() {
        System.out.println("Hola, soy Pikachu y ataco con Placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola, soy Pikachu y ataco con Araniazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Hola, soy Pikachu y ataco con Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola, soy Pikachu y ataco con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola, soy Pikachu y ataco con Punio Trueno");
    }
    
}
