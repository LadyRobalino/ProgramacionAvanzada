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
import javax.persistence.ManyToOne;


/**
 *
 * @author Paula Lopez
 */
@Entity
public class Recargas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int idReca;
    int valor;
    double saldo;
    double megas;

    @ManyToOne
    Celular celular; // Relación correcta

    public Recargas() {
    }

    public Recargas(int idReca, int valor, double saldo, double megas, Celular celular) {
        this.idReca = idReca;
        this.valor = valor;
        this.saldo = saldo;
        this.megas = megas;
        this.celular = celular;
        
    }

    public int getIdReca() {
        return idReca;
    }

    public void setIdReca(int idReca) {
        this.idReca = idReca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        
    }

    @Override
    public String toString() {
        return "Recargas{" + "idReca=" + idReca + ", valor=" + valor + ", saldo=" + saldo + ", megas=" + megas + ", celular=" + celular + '}';
    }
}

   