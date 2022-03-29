package Ejercicio_2;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        Profesores profesor1 = new Profesores ("Juan", "Hernández García", 33);

        Calendar fecha1 = Calendar.getInstance();

        fecha1.set(2019, 2,22); //Los meses van de 0 a 11, luego 10 representa noviembre

        Interinos interino1 = new Interinos("José Luis", "Morales Pérez", 54, fecha1);

        listasProfes lista1 = new listasProfes();

        lista1.darAlta(profesor1);

        lista1.darAlta(interino1);

        lista1.listar(); }

    /*
        Interinos.renovarInterinidad();
        Interinos.duracionInterinidad();
        Fijos.cambioCargo();
*/

}
