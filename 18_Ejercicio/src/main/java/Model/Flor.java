package Model;


public class Flor extends Planta{
    
    // Atributos
    private String colorPetalos;
    private int cantPetalos;
    private String colorPistilo;
    private String variedad;
    private String estacion;
    
    // Constructores

    public Flor() {
    }

    public Flor(String colorPetalos, int cantPetalos, String colorPistilo, String variedad, String estacion, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.colorPetalos = colorPetalos;
        this.cantPetalos = cantPetalos;
        this.colorPistilo = colorPistilo;
        this.variedad = variedad;
        this.estacion = estacion;
    }
    
    // Getters and Setters 

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public int getCantPetalos() {
        return cantPetalos;
    }

    public void setCantPetalos(int cantPetalos) {
        this.cantPetalos = cantPetalos;
    }

    public String getColorPistilo() {
        return colorPistilo;
    }

    public void setColorPistilo(String colorPistilo) {
        this.colorPistilo = colorPistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
    
    
    
    @Override
    public void decirQueSoy() {
        System.out.println("Hola, soy una Flor");
    }
    
}
