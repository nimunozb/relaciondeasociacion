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
public class Main {
    public static void main(String[] args) {
        Fecha fNacimiento= new Fecha(10,10,1980);
        Fecha fIngreso=new Fecha(29,8,2018);
        Empleado empleado=new Empleado("Elver","Galarga",fNacimiento,fIngreso);
        empleado.setfIngreso(fIngreso);
        
    }
}
