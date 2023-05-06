/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author algel
 */
public class ModelTamanos {
    private int idTamanos;
    private int precio;
    private String tamano;

    public ModelTamanos() {
        idTamanos= 0;
        precio=0;
        tamano="";
    }

    public int getIdTamanos() {
        return idTamanos;
    }

    public void setIdTamanos(int idTamanos) {
        this.idTamanos = idTamanos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    
    
}
