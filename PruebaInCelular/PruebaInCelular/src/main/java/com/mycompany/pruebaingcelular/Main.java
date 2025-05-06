/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebaingcelular;
import com.mycompany.examen1.Persistencias.CelularJpaController;
import com.mycompany.examen1.Persistencias.ClienteJpaController;
import com.mycompany.examen1.Persistencias.RecargasJpaController;

/**
 *
 * @author Paula Lopez
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try {
        ClienteJpaController clienteJpa = new ClienteJpaController();
        CelularJpaController celularJpa = new CelularJpaController();
        RecargasJpaController recargaJpa = new RecargasJpaController();
        
         System.out.println("Tablas creadas correctamente.");
        } catch (Exception e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
        }
    }
}
