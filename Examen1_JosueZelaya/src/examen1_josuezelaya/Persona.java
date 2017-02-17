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
public class Persona {
    private String nombre;
    private int edad;
    private long id;
    private long id_boleteria;
    private String departamento;
    private int dinero;

    public Persona() {
    }

    public Persona(String nombre, int edad, long id, long id_boleteria, String departamento, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.id_boleteria = id_boleteria;
        this.departamento = departamento;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_boleteria() {
        return id_boleteria;
    }

    public void setId_boleteria(long id_boleteria) {
        this.id_boleteria = id_boleteria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", id_boleteria=" + id_boleteria + ", departamento=" + departamento + ", dinero=" + dinero + '}';
    }
    
}
