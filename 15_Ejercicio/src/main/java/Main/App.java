package Main;

import Model.Videojuego;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        
        // Crear lista de Videojuegos
        List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
        
        // Crear videojuegos
        Videojuego video1 = new Videojuego(123, "Banjo Kazzoie", "Nintendo 64", 4, "Plataforma");
        Videojuego video2 = new Videojuego(456, "Mario Party 3", "Nintendo 64", 4, "Fiesta");
        Videojuego video3 = new Videojuego(789, "Age of Empires II", "PC", 1, "Estrategia");
        Videojuego video4 = new Videojuego(101, "Counter Strike 1.6", "PC", 1, "Shooter");
        Videojuego video5 = new Videojuego(100, "Mario Kart 64", "Nintendo 64", 2, "Carreras");
        
        // Agregando elementos a la ArrayList
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        // Mostrar videojuegos
        for (Videojuego video: listaVideojuegos){
            System.out.println("------ VIDEOJUEGO ------");
            System.out.println("Titulo: " + video.getTitulo());
            System.out.println("Consola: " + video.getConsola());
            System.out.println("Cant. de Jugadores: " + video.getCantJugadores());
        }
        
        // Cambiar el nombre y cant de videojuegos 
        video1.setTitulo("Banjo Tooie");
        video1.setCantJugadores(2);
        
        video5.setTitulo("Super Mario Kart");
        video5.setCantJugadores(5);
        
        // Recorrer ArrayList y solo mostrar juegos de Nintengo 64
        System.out.println("------ EXCLUSIVOS DE NINTENDO 64 ------");
        for (Videojuego videogame: listaVideojuegos){
            if (videogame.getConsola().equals("Nintendo 64")){
            System.out.println("------ VIDEOJUEGO ------");
            System.out.println("Titulo: " + videogame.getTitulo());
            System.out.println("Consola: " + videogame.getConsola());
            System.out.println("Cant. de Jugadores: " + videogame.getCantJugadores());
            }
        }
        
    }
}
