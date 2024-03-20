package Model;


public class Arbusto extends Planta{
    
    // Atributos
    private double ancho;
    private boolean esDomestico;
    private String variedad;
    private String colorHojas;
    private boolean sePoda;
    
    // Constructores

    public Arbusto() {
    }

    public Arbusto(double ancho, boolean esDomestico, String variedad, String colorHojas, boolean sePoda, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePoda = sePoda;
    }
    
    // Getters and Setters

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePoda() {
        return sePoda;
    }

    public void setSePoda(boolean sePoda) {
        this.sePoda = sePoda;
    }
    
    
    // Metodos

    @Override
    public void decirQueSoy() {
        System.out.println("Hola, soy un Arbusto");
    }
    
}
