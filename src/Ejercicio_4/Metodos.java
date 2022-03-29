package Ejercicio_4;


import java.util.Scanner;

public class Metodos {

    static Scanner sc = new Scanner(System.in);

    private static final int MAXIMO_MENU_NOTAS = 7;
    private static final int MINIMO_MENU = 0;

    /**
     * Método que introduce en cada posición de un array del enum Notas uno de los valores que contiene el
     * enumerado. En la posición 0 el DO, en la posición 1 el RE, etc.
     * @return notas
     */
    public static Notas[] valorNotas(){

        Notas[] notas = new Notas[MAXIMO_MENU_NOTAS];

        notas[0] = Notas.DO;
        notas[1] = Notas.RE;
        notas[2] = Notas.MI;
        notas[3] = Notas.FA;
        notas[4] = Notas.SOL;
        notas[5] = Notas.LA;
        notas[6] = Notas.SI;

        return notas;
    }

    /**
     * Método que añade las notas que el usuario introduce, según el tipo de instrumento que se ha escogido.
     * Precondición: la nota se debe encontrar en el enum Notas
     * Postcondición:
     * @param tipoInstrumento
     * @param notas
     * @param piano
     * @param campana
     */
    public static void aumentoInstrumento(int tipoInstrumento, Notas[] notas, Piano piano, Campana campana){

        int nota;

        do {
            nota = pedirNota();
            if (nota != - 1){

                switch (tipoInstrumento){
                    case (1):
                        piano.add(notas[nota]);
                        break;

                    case (2):
                        campana.add(notas[nota]);
                        break;

                }
            }
        }while (nota != -1);
    }


    /**
     * Método que le pide al usuario la nota que quiere introducir.
     *
     * Precondición: se resta 1 a nota en el retorno porque luego se va a operar con un array. Esto hace que
     * de esta forma se pueda operar correctamente con las posiciones del array
     *
     * @return nota
     */
    public static int pedirNota(){

        System.out.print(Main.preguntarNotaMusical());

        int nota = comprobarNumero(MINIMO_MENU, MAXIMO_MENU_NOTAS);

        return nota-1;
    }


    /**
     * Método que gestiona según la opción que ha escogido el usuario el instrumento que se va a interpretar.
     * Para ello usamos un switch case, asignándole a cada instrumento un número.
     *
     * Precondición: debe escoger uno de los dos instrumentos
     * Postcondición: ninguna
     *
     * @param tipoInstrumento
     * @param piano
     * @param campana
     */
    public static void interpretacionInstrumento(int tipoInstrumento,Piano piano,Campana campana){

        switch (tipoInstrumento){

            case (1):
                piano.interpretar();
                break;

            case (2):
                campana.interpretar();
                break;
        }
    }

    //excepciones

    /**
     * Método en el cual se comprueban que los datos introducidos por el usuario son enteros, además de verificar
     * si están dentro del intervalo especificado en la llamada del método.
     *
     * @param minimo
     * @param maximo
     * @return numero
     */
    public static int comprobarNumero(int minimo,int maximo){

        int numero = 0;

        do {
            try {

                numero=sc.nextInt();

                if (numero<minimo || numero>maximo){
                    System.out.print("Debe introducir un valor entre " + minimo + " y " + maximo + ": ");
                }

            }catch (Exception e){

                System.out.print("Por favor, introduzca un valor válido");
                sc.nextLine();

            }
        }while (numero<minimo || numero>maximo);

        return numero;
    }

}
