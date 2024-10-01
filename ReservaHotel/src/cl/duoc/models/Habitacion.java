/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Habitacion {
    private String numeroHabitacion;
    private double precioHabitacion;
    private boolean disponible;

    public Habitacion() {
    }

    public Habitacion(String numeroHabitacion, double precioHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.disponible = true;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void reservar(){
        this.disponible = false;
    }
    
    
}
