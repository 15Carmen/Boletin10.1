package Ejercicios.Ejercicio_1;

import Ejercicios.Ejercicio_1.Enums.Tipo;
import Ejercicios.Ejercicio_1.Enums.tamanoPizza;

public class Pizza extends Pizzeria{

    //atributos
    protected tamanoPizza tamanoPi;
    protected static int contadorPizzasServidas=0;
    protected static int contadorPizzasPedidas=0;


    //constructores

    public Pizza(Tipo tipoPizza, tamanoPizza tamanoPi){
        super(tipoPizza);
        this.tamanoPi = tamanoPi;
        contadorPizzasPedidas++;
    }

    //sobreescribimos el metodo servir

    @Override
    public void servir(){
        super.servir();
        contadorPizzasServidas++;
        contadorPizzasPedidas--;
    }

    @Override
    public String toString(){
        return "La pizza pedida es de tamaño " + this.tamanoPi + super.toString();
    }

}
