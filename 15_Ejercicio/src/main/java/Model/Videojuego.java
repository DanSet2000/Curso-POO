package Model;


public class Videojuego {
    
    // Atributos
    private int codigo;
    private String titulo;
    private String consola;
    private int cantJugadores;
    private String categoria;
    
    // Constructores

    public Videojuego() {
    }

    public Videojuego(int codigo, String titulo, String consola, int cantJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }
    
    // Getters and Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public void setCantJugadores(int cantJugadores) {
        this.cantJugadores = cantJugadores;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    // Metodos
    
    
}
