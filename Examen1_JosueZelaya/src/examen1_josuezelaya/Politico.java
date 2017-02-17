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
public class Politico extends Persona{
    private String partido;

    public Politico() {
        super();
    }

    public Politico(String partido, String nombre, int edad, long id, long id_boleteria, String departamento, int dinero) {
        super(nombre, edad, id, id_boleteria, departamento, dinero);
        this.partido = partido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
