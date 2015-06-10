/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joels.hibernate.dominio;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name="Modulo")
public class Modulo implements Serializable {
    @Id
    @Column(name="IdModulo")
    
    private int idModulo;
    @Column(name="nombre")
    private String nombre;
    
    @ManyToMany(cascade={CascadeType.ALL},mappedBy="modulo")
    private Set<Profesor>profesores = new HashSet();//not included constructor

    public Modulo() {
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(Set<Profesor> profesores) {
        this.profesores = profesores;
    }

    
    public Modulo(int idModulo, String nombre) {
        this.idModulo = idModulo;
        this.nombre = nombre;
    }
    
    
    
    
}
