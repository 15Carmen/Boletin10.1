package Ejercicio_1.modelo;



public class Pizza extends Producto {

   public enum tamanoPizza {MEDIANA, FAMILIAR}

    //atributos
    private tamanoPizza tamanoPi;
    private static int totalPizzasServidas =0;
    private static int totalPizzasPedidas =0;


    //constructores

    public Pizza(tipo tipoPizza, tamanoPizza tamanoPi){
        super(tipoPizza);
        this.tamanoPi = tamanoPi;
        totalPizzasPedidas++;
    }

    public static int getTotalPizzasServidas() {
        return totalPizzasServidas;
    }

    public static int getTotalPizzasPedidas() {
        return totalPizzasPedidas;
    }

    public tamanoPizza getTamanoPi() {
        return tamanoPi;
    }

    //sobreescribimos el metodo servir

    @Override
    public void servir(){
        super.servir();
        totalPizzasServidas++;
        totalPizzasPedidas--;
    }

    @Override
    public String toString(){
        return String.format("La pizza pedida es de tamaño %s", this.tamanoPi)  + super.toString();
    }

}
