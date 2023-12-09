/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam1ej0501a02alumnoprofesorcons;

/**
 *
 * @author user
 */
public class Persona {
    long nroDNI;
    char letraDNI;
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    char sexo; 
    
    public Persona (long nroDNI, char letraDNI, String nombre ,String apellido1, String apellido2, int edad, char sexo){
        this.nroDNI = nroDNI;
        this.letraDNI = letraDNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.sexo = sexo;
    }
}
