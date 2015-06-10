

package com.joels.hibernate.dominio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
@Entity
@Table(name="Profesor")
public class Profesor implements Serializable{
    @Id
    @Column(name="Id")
    private int id;
    @Column(name="nombre")
    private String nombre;
    @Column
    private String ape1;
    @Column
    private String ape2;
    
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Direccion direccion;
    
    
    @OneToMany(mappedBy="profesor",cascade=CascadeType.ALL)
    private Set<CorreoElectronico> correosElectronicos;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="ProfesorModulo",joinColumns={@JoinColumn(name="IdProfesor")},inverseJoinColumns = {@JoinColumn(name="IdModulo")})
    private Set<Modulo>modulo = new HashSet();
    
    @Enumerated(EnumType.ORDINAL)
    private tipoFuncionario tipofuncionario;

    public tipoFuncionario getTipofuncionario() {
        return tipofuncionario;
    }

    public void setTipofuncionario(tipoFuncionario tipofuncionario) {
        this.tipofuncionario = tipofuncionario;
    }
    
    
    public Set<CorreoElectronico> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(Set<CorreoElectronico> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }
    
    public Profesor(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }


    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public Set<Modulo> getModulos() {
        return modulo;
    }

    public void setModulos(Set<Modulo> modulos) {
        this.modulo = modulos;
    }
    
    public Profesor(int id, String nombre, String ape1, String ape2,tipoFuncionario tipofuncionario) {
        this.id = id;
        this.nombre = nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
        this.tipofuncionario = tipofuncionario;
    }
    
    
}
