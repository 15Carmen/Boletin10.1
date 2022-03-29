package Ejercicio_2;

import java.util.Calendar;

public class Interinos extends Profesores{

    //atributos exclusivos de los profesores interinos
    private Calendar fechaInicioInterinidad;
    private Calendar fechaCeseInterinidad;
    private String nombreInstituto;


    //constructores
    public Interinos(Calendar fechaInicioInterinidad, Calendar fechaCeseInterinidad){
        super();
        fechaInicioInterinidad=fechaInicioInterinidad;
        fechaCeseInterinidad=fechaCeseInterinidad;
        nombreInstituto="null";
    }

    public Interinos(String nombre, String apellidos, int edad, Calendar fechaInicioInterinidad) {
        super(nombre, apellidos, edad);
        fechaInicioInterinidad = fechaInicioInterinidad;
        fechaCeseInterinidad = fechaCeseInterinidad;
        nombreInstituto="null";
    }


    //getter y setter
    public Calendar getFechaInicioInterinidad() {
        return fechaInicioInterinidad;
    }

    public void setFechaInicioInterinidad(Calendar fechaInicioInterinidad) {
        this.fechaInicioInterinidad = fechaInicioInterinidad;
    }

    public Calendar getFechaCeseInterinidad() {
        return fechaCeseInterinidad;
    }

    public void setFechaCeseInterinidad(Calendar fechaCeseInterinidad) {
        this.fechaCeseInterinidad = fechaCeseInterinidad;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }


    //metodos


    public static void duracionInterinidad() {
    }

    public static void renovarInterinidad() {
    }

    public static void darAlta() {
    }
}
