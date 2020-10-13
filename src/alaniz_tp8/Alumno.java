/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaniz_tp8;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alejandro
 */ 
public class Alumno {
    int legajo;
    String apellid;
    String nombre;
    
    Set<Materia> listMat = new HashSet<>();   

    public Alumno(int legajo, String apellid, String nombre) {
        this.legajo = legajo;
        this.apellid = apellid;
        this.nombre = nombre;
    } 

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellid() {
        return apellid;
    }

    public void setApellid(String apellid) {
        this.apellid = apellid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    void agregarMaterias(Materia m) {
        listMat.add(m);
    }
    
    int cantidadMaterias() {
        return listMat.size(); // retorna el tamaño  de la lista
    }
}
