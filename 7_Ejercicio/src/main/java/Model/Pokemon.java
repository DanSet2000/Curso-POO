package Model;

public abstract class Pokemon {
    
    // Atributos
    
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    
    // Metodos - Ataques en Común de todos los Pokemons
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    
}
