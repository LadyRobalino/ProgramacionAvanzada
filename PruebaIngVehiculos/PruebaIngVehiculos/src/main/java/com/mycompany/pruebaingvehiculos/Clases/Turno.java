/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaingvehiculos.Clases;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author USER
 */
@Entity
public class Turno implements Serializable {
    @Id 
    @GeneratedValue
    private int idturn;
    private int anden;
    private Date dia;
    private Time hora;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculo vehiculo;

    public Turno() {
    }

    public Turno(int idturn, int anden, Date dia, Time hora, Vehiculo vehiculo) {
        this.idturn = idturn;
        this.anden = anden;
        this.dia = dia;
        this.hora = hora;
        this.vehiculo = vehiculo;
    }

    public int getIdturn() {
        return idturn;
    }

    public void setIdturn(int idturn) {
        this.idturn = idturn;
    }

    public int getAnden() {
        return anden;
    }

    public void setAnden(int anden) {
        this.anden = anden;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}
