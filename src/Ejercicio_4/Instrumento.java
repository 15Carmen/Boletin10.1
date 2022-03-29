package Ejercicio_4;

abstract public class Instrumento {

    //atributos
    protected final int MAXIMO_NOTAS = 100;
    protected int contadorNotas = 0;
    protected Notas[] notas = new Notas[MAXIMO_NOTAS];

    /**
     * Método que añade notas al array de notas definido para el instrumento.
     * Validará que no hemos llegado a la capacidad máxima del array notasMusicales.
     * El método se desarrolla de forma extensa en las classes hijas.
     *
     * Precondición: La nota debe estar definida en el enum
     * Postcondición: Ninguna
     */
    public abstract void add(Notas nota);

    /**
     * Método que cambiará las notas especificadas en el array por los sonidos que hará cada instrumento al
     * tocar dichas notas.
     * El método se desarrolla de forma extensa en las classes hijas.
     *
     * Precondición: La nota debe estar definida en el enum
     * Postcondición: Ninguna
     */

    protected abstract void interpretar();

}
