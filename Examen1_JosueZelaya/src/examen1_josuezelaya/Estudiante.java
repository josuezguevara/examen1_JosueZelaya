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
public class Estudiante extends Persona{
    private String carrera_estudiantil;

    public Estudiante() {
        super();
    }

    public Estudiante(String carrera_estudiantil, String nombre, int edad, long id, long id_boleteria, String departamento, int dinero) {
        super(nombre, edad, id, id_boleteria, departamento, dinero);
        this.carrera_estudiantil = carrera_estudiantil;
    }

    public String getCarrera_estudiantil() {
        return carrera_estudiantil;
    }

    public void setCarrera_estudiantil(String carrera_estudiantil) {
        this.carrera_estudiantil = carrera_estudiantil;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" + "carrera_estudiantil=" + carrera_estudiantil + '}';
    }
    
    
}
