package Ejercicio_1.modelo;

public class Panini extends Producto {

    public enum Racion {SIMPLE, DOBLE}
    public enum tamanoPanini {SEVILLA, GRANADA, ALMERIA}

    //atributos
    private tamanoPanini tamanoPa;
    private Racion racion;
    private static int totalPaninisServidos =0;
    protected static int totalPaninisPedidos =0;


    //constructor
    public Panini(tipo tipoPizza, tamanoPanini tamanoPa, Racion racion){
        super(tipoPizza);
        this.tamanoPa = tamanoPa;
        this.racion=racion;
        totalPaninisPedidos++;
    }

    //sobreescribimos el metodo servir

    @Override
    public void servir(){
        super.servir();
        totalPaninisServidos++;
        totalPaninisPedidos--;
    }

    @Override
    public String toString(){
        return String.format("El panini pedido es de tamaño %s", this.tamanoPa)  + super.toString();
    }
}

