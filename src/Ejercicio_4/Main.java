package Ejercicio_4;

public class Main {

    private static final int MINIMO_MENU1 = 0;
    private static final int MAXIMO_MENU1 = 2;//=MAXIMO_MENU_INSTRUMENTOS
    private static final int MINIMO_MENU_INSTRUMENTO = 1;

    public static void main(String[] args) {

        boolean salir=false;
        int opcion;
        int tipoInstrumento;

        Notas[] notas = Metodos.valorNotas();
        Piano piano = new Piano();
        Campana campana = new Campana();

        do {

            System.out.print(mostrarMenu());
            opcion = Metodos.comprobarNumero(MINIMO_MENU1,MAXIMO_MENU1);

            System.out.print(preguntarTipoInstrumento());
            tipoInstrumento = Metodos.comprobarNumero(MINIMO_MENU_INSTRUMENTO,MAXIMO_MENU1);

            switch (opcion){

                case (1):
                    Metodos.aumentoInstrumento(tipoInstrumento,notas, piano,campana);
                    break;

                case (2):
                    Metodos.interpretacionInstrumento(tipoInstrumento,piano,campana);
                    break;

                case (0):
                    salir=true;
                    break;
            }

        }while (!salir);

    }

    /**
     * Método que muestra el primer menu que da a elegir que hacer en el programa
     *
     * NOTA: No entiendo por qué no me va la opción para salir del programa, pero intentaré arreglarla antes de la
     * clase del lunes
     *
     * @return menu1
     */
    public static String mostrarMenu(){
        return  """
                Escoja lo que desee hacer:
                1.Insertar notas.
                2.Interpretar notas.
                
                0.Salir
               
                """;
    }

    /**
     * Método que muestra el segundo menu, que da la lista de instrumentos disponibles en el programa
     * @return menu2
     */
    public static String preguntarTipoInstrumento(){
        return  """
                Elija uno de los instrumentos disponibles:
                1.Piano
                2.Campana
                """;
    }

    /**
     * Método que muestra el tercer menu, que da la lista de la variedad de notas que puede el usuario introducir
     * @return menu3
     */
    public static String preguntarNotaMusical(){
        return """
                Escoja las notas que desea que el instrumento que ha elegido toque
                1.Do
                2.Re
                3.Mi
                4.Fa
                5.Sol
                6.La
                7.Si
                
                0.Salir
                """;
    }


}
