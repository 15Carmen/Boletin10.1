package Ejercicios.Ejercicio_2;

import java.util.ArrayList;

public class listasProfes {

    /**
     * metodo para dar de alta a un profesor. Es te metodo lo vamos a usar para añadir los profesores en un array.
     * precondiciones: primero tenemos que crear un array profesores
     * postcondiciones: ninguna
     */

    private ArrayList<Profesores> listaProfes;

    //constructor
    public listasProfes(){
        listaProfes = new ArrayList<Profesores>();
    }

    //metodo darAlta

    public void darAlta (Profesores profe){
        listaProfes.add(profe);
    }

    public void listar(){
        System.out.println("Estos son los datos de los profesores existentes en la lista");
        for (Profesores tmp: listaProfes);
    }
}
