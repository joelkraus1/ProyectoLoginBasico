
package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
   
    private  int id;
    private String nombreuUsuario;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(int id, String nombreuUsuario, String contraseña) {
        this.id = id;
        this.nombreuUsuario = nombreuUsuario;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreuUsuario() {
        return nombreuUsuario;
    }

    public void setNombreuUsuario(String nombreuUsuario) {
        this.nombreuUsuario = nombreuUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
