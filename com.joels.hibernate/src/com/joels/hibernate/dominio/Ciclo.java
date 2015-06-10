/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.joels.hibernate.dominio;
import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="CicloFormativo")
public class Ciclo {

    @Id
    @Column(name="IdCiclo")
    private int idCiclo;
    @Column(name="nombreCiclo")
    private String nombre;
    @Column(name="Horas")
    private int horas;
    public Ciclo() {
    }

    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Ciclo(int idCiclo, String nombre, int horas) {
        this.idCiclo = idCiclo;
        this.nombre = nombre;
        this.horas = horas;
    }
    
    
}
