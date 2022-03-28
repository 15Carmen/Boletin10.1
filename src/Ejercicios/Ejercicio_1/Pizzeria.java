package Ejercicios.Ejercicio_1;

import Ejercicios.Ejercicio_1.Enums.Estado;
import Ejercicios.Ejercicio_1.Enums.Tipo;

public class Pizzeria {

    /*
    La clase pizzeria es la que vamos a usar como clase padre de las clases Pizza y Panini
     */

    protected Tipo tipoPizza;
    protected Estado estadoPizza;
    protected static int totalPedidos =0;
    public static int totalServidos =0;

    //constructor

    public Pizzeria(Tipo tipoPizza){
        this.tipoPizza=tipoPizza;
        this.estadoPizza=Estado.PEDIDA;
        totalPedidos++;
    }

    //getter y setter

    public Tipo getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(Tipo tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public Estado getEstadoPizza() {
        return estadoPizza;
    }

    public void setEstadoPizza(Estado estadoPizza) {
        this.estadoPizza = estadoPizza;
    }

    public static int getTotalPedidos() {
        return totalPedidos;
    }

    public static void setTotalPedidos(int totalPedidos) {
        Pizzeria.totalPedidos = totalPedidos;
    }

    public static int getTotalServidos() {
        return totalServidos;
    }

    public static void setTotalServidos(int totalServidos) {
        Pizzeria.totalServidos = totalServidos;
    }


    //metodo servir

    public void servir(){
        this.estadoPizza=Estado.SERVIDA;
        totalServidos++;
    }

    //metodo mostrar

    @Override
    public String toString() {
        return ", de tipo " + this.tipoPizza + " y cuyo estado es " + this.estadoPizza;
    }


}
