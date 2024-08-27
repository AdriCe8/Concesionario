/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concesionario.persistencia;

import com.mycompany.concesionario.logica.Automovil;
import com.mycompany.concesionario.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adriancuenca
 */
public class ControladoraPersistencia {
    
    AutomovilJpaController aJpa = new AutomovilJpaController();

    public void agregarAuto(Automovil auto) {
        aJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return aJpa.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        try {
            aJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int idAuto) {
       return aJpa.findAutomovil(idAuto);
    }

    public void actualizarAuto(Automovil auto) {
        try {
            aJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
