package Ejercicios.Ejercicio_2;

import java.util.Calendar;

public class Fijos extends Profesores{

    //atributos de los profesores fijos
    private String idFuncionario;
    private Calendar fechaPlaza;

    //constructores
    public Fijos (Calendar fechaPlaza){
        super();
        idFuncionario="null";
        fechaPlaza=fechaPlaza;
    }

    public Fijos(String nombre, String apellidos, int edad, Calendar fechaPlaza) {
        super(nombre, apellidos, edad);
        idFuncionario="null";
        fechaPlaza=fechaPlaza;
    }


    //getter y setter
    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario (String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Calendar getFechaPlaza() {
        return fechaPlaza;
    }

    public void setFechaPlaza(Calendar fechaPlaza) {
        this.fechaPlaza = fechaPlaza;
    }


    //metodos
    public static void cambioCargo() {
    }

    public static void darAlta() {
    }
}