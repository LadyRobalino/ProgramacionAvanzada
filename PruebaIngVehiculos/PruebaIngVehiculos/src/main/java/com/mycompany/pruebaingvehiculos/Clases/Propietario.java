/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaingvehiculos.Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Propietario implements Serializable {
    @Id
    @GeneratedValue
    private int idprop;
    private String cedula;
    private String apellido;
    private String nombre;

    @OneToMany
        (mappedBy = "propietario")
    private List<Vehiculo> vehiculos;
    
    public Propietario() {
    }

    public Propietario(int idprop, String cedula, String apellido, String nombre, List<Vehiculo> vehiculos) {
        this.idprop = idprop;
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombre = nombre;
        this.vehiculos = vehiculos;
    }

    public int getIdprop() {
        return idprop;
    }

    public void setIdprop(int idprop) {
        this.idprop = idprop;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
}
