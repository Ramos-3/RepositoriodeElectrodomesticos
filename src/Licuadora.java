/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class Licuadora {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the velocidades
     */
    public int getVelocidades() {
        return velocidades;
    }

    /**
     * @param velocidades the velocidades to set
     */
    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    /**
     * @return the voltaje
     */
    public int getVoltaje() {
        return voltaje;
    }

    /**
     * @param voltaje the voltaje to set
     */
    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    private String nombre;
    private int velocidades;
    private int voltaje;
    private String modelo;
    public Licuadora(String nombre, int velocidades, int voltaje, String modelo){
    this.nombre=nombre;
    this.velocidades=velocidades;
    this.voltaje=voltaje;
    this.modelo=modelo;
    }
}
