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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author USER
 */
@Entity
public class Vehiculo implements Serializable {
    @Id
    @GeneratedValue
    private int idveh;
    private String placa;
    private String marca;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "propietario_id")
    private Propietario propietario;

    @OneToMany(mappedBy = "vehiculo")
    private List<Turno> turnos;

    public Vehiculo() {
    }

    public Vehiculo(int idveh, String placa, String marca, String estado, Propietario propietario, List<Turno> turnos) {
        this.idveh = idveh;
        this.placa = placa;
        this.marca = marca;
        this.estado = estado;
        this.propietario = propietario;
        this.turnos = turnos;
    }

    public int getIdveh() {
        return idveh;
    }

    public void setIdveh(int idveh) {
        this.idveh = idveh;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }
    
    
}
