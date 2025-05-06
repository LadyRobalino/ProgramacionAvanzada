/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1.Clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Paula Lopez
 */
@Entity
public class Celular implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int idCel;
    String numero;
    String estado;
    double saldo;
    double megas;

    public Celular() {

    }

    public Celular(int idCel, String numero, String estado, double saldo, double megas) {
        this.idCel = idCel;
        this.numero = numero;
        this.estado = estado;
        this.saldo = saldo;
        this.megas = megas;
    }

    public int getIdCel() {
        return idCel;
    }

    public void setIdCel(int idCel) {
        this.idCel = idCel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMegas() {
        return megas;
    }

    public void setMegas(double megas) {
        this.megas = megas;
    }

    @Override
    public String toString() {
        return "Celular{" + "idCel=" + idCel + ", numero=" + numero + ", estado=" + estado + ", saldo=" + saldo + ", megas=" + megas + '}';
    }

}
