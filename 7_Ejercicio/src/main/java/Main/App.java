package Main;

import Model.Bulbasaur;
import Model.Charmander;
import Model.Pikachu;
import Model.Squirtle;


public class App {

    public static void main(String[] args) {
        
        // Creacion de Objetos
        
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();   
        squirtle.atacarBurbuja();
        bulbasaur.atacarMordisco();
        bulbasaur.atacarParalizar();
        charmander.atacarPlacaje();
        charmander.atacarAscuas();
        pikachu.atacarPlacaje();
        pikachu.atacarImpactrueno();
    }
}
