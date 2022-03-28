package Ejercicios.Ejercicio_1;

import Ejercicios.Ejercicio_1.Enums.Racion;
import Ejercicios.Ejercicio_1.Enums.Tipo;
import Ejercicios.Ejercicio_1.Enums.tamanoPanini;

public class Panini extends Pizzeria{

    //atributos
    protected tamanoPanini tamanoPa;
    protected Racion racion;
    protected static int contadorPaninisServidos=0;
    protected static int contadorPaninisPedidos=0;


    //constructor
    public Panini(Tipo tipoPizza, tamanoPanini tamanoPa, Racion racion){
        super(tipoPizza);
        this.tamanoPa = tamanoPa;
        this.racion=racion;
        contadorPaninisPedidos++;
    }

    //sobreescribimos el metodo servir

    @Override
    public void servir(){
        super.servir();
        contadorPaninisServidos++;
        contadorPaninisPedidos--;
    }

    @Override
    public String toString(){
        return "El panini pedido es de tamaño " + this.tamanoPa + super.toString();
    }
}

