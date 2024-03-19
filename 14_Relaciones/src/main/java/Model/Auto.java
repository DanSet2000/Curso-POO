package Model;

import java.util.List;


public class Auto {
    
    private Long id;
    private String marca;
    private String modelo;
    // Relacion de 1 a 1
    private Propietario propietario;
    // Relacion de N a 1
    private List<Propietario> listaPropietarios;
    
    
    // Constructores

    public Auto() {
    }

    public Auto(Long id, String marca, String modelo, Propietario propietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public Auto(Long id, String marca, String modelo, List<Propietario> listaPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.listaPropietarios = listaPropietarios;
    }

       
    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }


    // Metodos
    

    
    
}
