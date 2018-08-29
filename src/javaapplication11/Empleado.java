/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Estudiante
 */
public class Empleado {
    
    private String nombre;
    public  Fecha fNacimiento;
    private Fecha fIngreso;
    private String apellido;
    private String genero;
    private String foto;
    

    public Empleado(String nombre,String apellido, Fecha fNacimiento,Fecha fIngreso ) {
        this.nombre = nombre;
        this.apellido = nombre;
        this.fNacimiento =fNacimiento;
        this.fIngreso = fIngreso;
    }

    Empleado(String v, String g, Fecha fNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public Fecha getfIngreso() {
        return fIngreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public void setfIngreso(Fecha fIngreso) {
        this.fIngreso = fIngreso;
    }
    
    
}
