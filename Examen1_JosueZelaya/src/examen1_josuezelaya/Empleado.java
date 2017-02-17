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
public class Empleado extends Persona{
    private String empleo;

    public Empleado() {
        super();
    }

    public Empleado(String empleo, String nombre, int edad, long id, long id_boleteria, String departamento, int dinero) {
        super(nombre, edad, id, id_boleteria, departamento, dinero);
        this.empleo = empleo;
    }

    public String getEmpleo() {
        return empleo;
    }

    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
