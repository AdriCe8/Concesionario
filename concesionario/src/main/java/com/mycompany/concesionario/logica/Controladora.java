/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concesionario.logica;

import com.mycompany.concesionario.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author adriancuenca
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAuto(String marca, String modelo, String motor, String color, String patente, int nPuertas) {
        Automovil auto = new Automovil();
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setnPuertas(nPuertas);
        
        controlPersis.agregarAuto(auto);
        
    }

    public List<Automovil> traerAutos() {
        
         return controlPersis.traerAutos();
        
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String marca, String modelo, String motor, String color, String patente, int nPuertas) {
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setnPuertas(nPuertas);
        
        controlPersis.actualizarAuto(auto);
        
        
        
    }

    
    
}
