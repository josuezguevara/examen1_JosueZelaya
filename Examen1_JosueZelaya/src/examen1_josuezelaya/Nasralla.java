/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_josuezelaya;

/**
 *
 * @author usuario
 */
public class Nasralla {
    private String Nombre;
    private String contrasena;

    public Nasralla() {
    }

    public Nasralla(String Nombre, String contrasena) {
        this.Nombre = Nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Nasralla{" + "Nombre=" + Nombre + ", contrasena=" + contrasena + '}';
    }
    
}
