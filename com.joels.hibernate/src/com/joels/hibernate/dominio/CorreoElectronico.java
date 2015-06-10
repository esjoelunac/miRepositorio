/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.joels.hibernate.dominio;

import javax.persistence.*;

@Entity
@Table(name="CorreoElectronico")
public class CorreoElectronico {
    @Id
    @Column(name="idcorreo")
    private int idCorreo;
    @Column(name="direccionCorreo")
    private String direccionCorreo;
    @ManyToOne
    @JoinColumn(name="IdProfesor")
    private Profesor profesor;//profesor "p" es la varibale que mapeara esta clace
    //en la base de datos existe una columna idProfesor.. pero se ingresara utomaticamente 
    //por la clace profesor con un join column
    public CorreoElectronico() {
    }

    public int getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
  

    public CorreoElectronico(int idCorreo, String direccionCorreo, Profesor Profesor) {
        this.idCorreo = idCorreo;
        this.direccionCorreo = direccionCorreo;
        this.profesor = Profesor;
    }
  
}
