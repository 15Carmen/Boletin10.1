package Ejercicio_1;

import Ejercicio_1.modelo.Pizzeria;

public class Main {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        pizzeria.crearProductosEjemplo();
        pizzeria.servirProductos(new int[]{0, 2, 3});
        pizzeria.mostrarTodosProductos();
        pizzeria.mostrarTotales();
    }
}
