package Ejercicio_1;


import Ejercicio_1.modelo.Panini;
import Ejercicio_1.modelo.Pizza;
import Ejercicio_1.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Producto> listProducto = new ArrayList<>();

    public static void main(String[] args) {
        crearProductos();
        servirProductos(new int[]{0, 1, 3});
        mostrarTodosProductos();
  /*
        System.out.println("El total de pizzas pedidas es " + Pizza.pizzasPedidas + ", " +
                "y el total de pizzas servidas es " + Pizza.pizzasServidas);
        System.out.println("El total de paninis pedidos es " + Panini.paninisPedidos + ", " +
                "y el total de paninis servidos es " + Panini.paninisServidos);
        System.out.println("El total de pedidos es " + Pizzeria.totalPizzas + ", " +
                "y el total servidos es " + Pizzeria.contadorServidas);
*/
    }

    private static void crearProductos() {
        listProducto.add(new Pizza(Producto.tipo.MARGARITA, Pizza.tamanoPizza.FAMILIAR));
        listProducto.add(new Pizza(Producto.tipo.FUNGI, Pizza.tamanoPizza.FAMILIAR));
        listProducto.add(new Pizza(Producto.tipo.CUATRO_QUESOS, Pizza.tamanoPizza.MEDIANA));
        listProducto.add(new Panini(Producto.tipo.FUNGI, Panini.tamanoPanini.SEVILLA, Panini.Racion.DOBLE));
        listProducto.add(new Panini(Producto.tipo.CUATRO_QUESOS, Panini.tamanoPanini.GRANADA, Panini.Racion.SIMPLE));
    }

    private static void servirProductos(int[] posicion) {
        for (int pos :
                posicion) {
            listProducto.get(pos).servir();
        }
    }

    private static void servirTodosProductos() {
        for (Producto producto :
                listProducto) {
            producto.servir();
        }
    }

    private static void mostrarTodosProductos() {
        for (Producto producto :
                listProducto) {
            System.out.println(producto.toString());
        }
    }
}
