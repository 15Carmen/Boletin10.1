package Ejercicio_1.modelo;

public class Producto {

    public enum tipo {MARGARITA, CUATRO_QUESOS, FUNGI}
    enum Estado {PEDIDO, SERVIDO}

    /*
    La clase pizzeria es la que vamos a usar como clase padre de las clases Pizza y Panini
     */

    protected tipo tipoPizza;
    private Estado estadoPizza;
    private static int totalProductosPedidos =0;
    private static int totalProductosServidos =0;

    //constructor

    public Producto(tipo tipoPizza){
        this.tipoPizza=tipoPizza;
        estadoPizza=Estado.PEDIDO;
        totalProductosPedidos++;
    }

    //getter y setter

    public static int getTotalProductosServidos() {
        return totalProductosServidos;
    }

    public static int getTotalProductosPedidos() {
        return totalProductosPedidos;
    }


    //metodo servir

    public void servir(){
        this.estadoPizza=Estado.SERVIDO;
        totalProductosServidos++;
    }

    //metodo mostrar

    @Override
    public String toString() {
        return String.format (", de tipo %s y cuyo estado es %s", tipoPizza, estadoPizza);
    }


}
