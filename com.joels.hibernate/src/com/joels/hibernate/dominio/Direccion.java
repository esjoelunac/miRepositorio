/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joels.hibernate.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Direccion")
public class Direccion implements Serializable{
    @Id
    @Column(name="Id")
    private int id;
    @Column(name="calle")
    private String calle;
    @Column(name="numero")
    private int numero;

    @Column(name="provincia")
    private String provincia;
    
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Profesor profesor;
    
    @JoinColumn(name = "idMunicipio", referencedColumnName = "idMunicipio")
     @ManyToOne(cascade=CascadeType.ALL)
    private Municipio municipio;
    
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    
    public Direccion() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
//    public Direccion(int id, String calle, int numero, String provincia) {
//        this.id = id;
//        this.calle = calle;
//        this.numero = numero;
//        this.provincia = provincia;
//    }
    
    //acceder sin relacion con profesor
    public Direccion(int id, String calle, int numero, String provincia, Municipio municipio) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
        this.municipio = municipio;
    }

    
    public Direccion(int id, String calle, int numero, String provincia, Profesor profesor, Municipio municipio) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
        this.profesor = profesor;
        this.municipio = municipio;
    }
    
    
}
