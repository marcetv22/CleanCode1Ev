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
public class Profesor extends Persona {
       public long NRP;
       
       public Profesor (long nroDNI, char letraDNI, String nombre ,String apellido1, String apellido2, int edad, char sexo, long NRP){
           super(nroDNI,letraDNI,nombre,apellido1,apellido2,edad,sexo);
           this.NRP = NRP;
       }
}
