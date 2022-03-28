package Ejercicios.Ejercicio_1;

import Ejercicios.Ejercicio_1.Enums.*;

public class Main {

    public static void main(String[] args) {

        //Creamos 3 pizzas

        Pizza pizza1=new Pizza(Tipo.MARGARITA, tamanoPizza.FAMILIAR);
        Pizza pizza2=new Pizza(Tipo.FUNGI, tamanoPizza.MEDIANA);
        Pizza pizza3=new Pizza(Tipo.CUATRO_QUESOS, tamanoPizza.FAMILIAR);

        //Creamos 2 paninis

        Panini panini1=new Panini(Tipo.FUNGI,tamanoPanini.ALMERIA, Racion.SIMPLE);
        Panini panini2=new Panini(Tipo.MARGARITA, tamanoPanini.GRANADA, Racion.DOBLE);

        //Servimos las pizzas 1 y 2, y el panini 2

        pizza1.servir();
        pizza2.servir();
        panini2.servir();

        //metodo para mostrar los pedidos

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println("");
        System.out.println(panini1);
        System.out.println(panini2);
        System.out.println("");
        System.out.println("El total de pizzas pedidas es: " + Pizza.contadorPizzasPedidas);
        System.out.println("El total de pizzas servidas es: " + Pizza.contadorPizzasServidas);
        System.out.println("");
        System.out.println("El total de paninis pedidos es: " + Panini.contadorPaninisPedidos);
        System.out.println("El total de paninis servidos es: " + Panini.contadorPaninisServidos);
        System.out.println("");
        System.out.println("El número total de pedidos es: " + Pizzeria.totalPedidos);
        System.out.println("El número total de servidos es: " + Pizzeria.totalServidos);



    }
}
