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
public class CleanCodeMTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instancio objetos de la calse alumno
        Alumno Alumno1 = new Alumno(11111111,'X',"Marcelo","Taboada","Velasquez",19,'M',000000);
        Alumno Alumno2 = new Alumno(22222222,'Z',"Gonzalo","Bilbao","Alcazar",21,'M',111111);
        Alumno Alumno3 = new Alumno(33333333,'Y',"Mary","Martin","Tadeo",21,'F',222222);
        Alumno Alumno4 = new Alumno(44444444,'R',"Alberto","Luque","Abril",20,'M',3333333);
        Alumno Alumno5 = new Alumno(55555555,'M',"Daniel","Silva","Moratilla",18,'M',444444);
        Profesor Profesor = new Profesor(66666666,'W',"Andrés","Ramos","xxxx",50,'M',999999); 
        Persona Jose = new Persona(99999999,'A',"Jose","ddddd","rrrrrr",43,'X');
        
        
        //muestro por pantalla los datos que he instanciado con formato
        System.out.printf ("DNI : %9d \n Letra DNI : %1c \n Nombre : %10s \n Apellido 1 : %10s \n Apellido 2 : %10s \n Edad : %2d \n Genero : %1c \n NIA : %06d\n"
                          ,Alumno1.nroDNI, Alumno1.letraDNI,Alumno1.nombre,Alumno1.apellido1,Alumno1.apellido2,Alumno1.edad,Alumno1.sexo,Alumno1.NIA);
        System.out.println("-----------------------");
        System.out.printf ("DNI : %9d \n Letra DNI : %1c \n Nombre : %10s \n Apellido 1 : %10s \n Apellido 2 : %10s \n Edad : %2d \n Genero : %1c \n NIA : %06d"
                          ,Alumno2.nroDNI, Alumno2.letraDNI,Alumno2.nombre,Alumno2.apellido1,Alumno2.apellido2,Alumno2.edad,Alumno2.sexo,Alumno2.NIA);
        System.out.println("-----------------------");
        System.out.printf ("DNI : %9d \n Letra DNI : %1c \n Nombre : %10s \n Apellido 1 : %10s \n Apellido 2 : %10s \n Edad : %2d \n Genero : %1c \n NIA : %06d"
                          ,Alumno3.nroDNI, Alumno3.letraDNI,Alumno3.nombre,Alumno3.apellido1,Alumno3.apellido2,Alumno3.edad,Alumno3.sexo,Alumno3.NIA);
        System.out.println("-----------------------");
        System.out.printf ("DNI : %9d \n Letra DNI : %1c \n Nombre : %10s \n Apellido 1 : %10s \n Apellido 2 : %10s \n Edad : %2d \n Genero : %1c \n NIA : %06d"
                          ,Alumno4.nroDNI, Alumno4.letraDNI,Alumno4.nombre,Alumno4.apellido1,Alumno4.apellido2,Alumno4.edad,Alumno4.sexo,Alumno4.NIA);
        System.out.println("-----------------------");
        System.out.printf ("DNI : %9d \n Letra DNI : %1c \n Nombre : %10s \n Apellido 1 : %10s \n Apellido 2 : %10s \n Edad : %2d \n Genero : %1c \n NIA : %06d"
                          ,Alumno5.nroDNI, Alumno5.letraDNI,Alumno5.nombre,Alumno5.apellido1,Alumno5.apellido2,Alumno5.edad,Alumno5.sexo,Alumno5.NIA);
        System.out.println("-----------------------");
        System.out.printf ("DNI : %9d \n Letra DNI : %1c \n Nombre : %10s \n Apellido 1 : %10s \n Apellido 2 : %10s \n Edad : %2d \n Genero : %1c \n NRP : %06d"
                          ,Profesor.nroDNI, Profesor.letraDNI,Profesor.nombre,Profesor.apellido1,Profesor.apellido2,Profesor.edad,Profesor.sexo,Profesor.NRP);
        System.out.println("-----------------------");
        System.out.printf ("DNI : %9d \n Letra DNI : %1c \n Nombre : %10s \n Apellido 1 : %10s \n Apellido 2 : %10s \n Edad : %2d \n Genero : %1c \n    "
                          ,Jose.nroDNI, Jose.letraDNI,Jose.nombre,Jose.apellido1,Jose.apellido2,Jose.edad,Jose.sexo);
    }
    
}
