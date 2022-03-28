package Ejercicios.Ejercicio_2;

import java.util.ArrayList;

public class Profesores {

    //atributos que todos los profesores tienen en comun
    private String nombre;
    private String apellidos;
    private int edad;

    //constructores
    public Profesores(){}

    public Profesores(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }





}
