
package com.joels.hibernate.dominio;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
@Entity
@Table(name="Municipio")
public class Municipio {
    @Id
    @Column(name="idMunicipio")
   
    private int idMunicipio;
    @Column
    private int codProvincia;
    @Column
    private int codMunicipio;
    @Column
    private String nombre;
   

    public Municipio() {
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public int getCodProvincia() {
        return codProvincia;
    }

    public void setCodProvincia(int codProvincia) {
        this.codProvincia = codProvincia;
    }

    public int getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(int codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public Municipio( int codProvincia, int codMunicipio, String nombre) {
     
        this.codProvincia = codProvincia;
        this.codMunicipio = codMunicipio;
        this.nombre = nombre;
    }

    public Municipio(int idMunicipio, int codProvincia, int codMunicipio, String nombre) {
        this.idMunicipio = idMunicipio;
        this.codProvincia = codProvincia;
        this.codMunicipio = codMunicipio;
        this.nombre = nombre;
    }
    
}
