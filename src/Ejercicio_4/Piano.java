package Ejercicio_4;

public class Piano extends Instrumento{

    /**
     * Constructor por defecto
     */
    public Piano() {
        super();
    }


    /**
     * Método que añade notas musicales al array notas.
     *
     * Precondición: Las notas introducidas deben pertenecer al enum Notas
     * Postcondición: Una vez que se llene el array aparecerá un mensaje que nos advertirá que no se pueden
     * introducir más notas en él
     */
    @Override
    public void add(Notas nota){

        if (contadorNotas<MAXIMO_NOTAS){

            this.notas[this.contadorNotas] = nota;
            this.contadorNotas++;

        }else {
            System.out.println("No se pueden introducir más notas");
        }
    }


    /**
     * Método que interpreta las notas musicales almacenadas en el array notas y les da un sonido característico
     * del instrumento
     */
    @Override
    public void interpretar() {

        StringBuilder interpretacion = new StringBuilder();
        interpretacion.append(System.lineSeparator());

        for (int i = 0; i < this.notas.length; i++) {

            if (notas[i] != null){

                switch (notas[i]){
                    case DO:
                        interpretacion.append("Plan ");
                        break;

                    case RE:
                        interpretacion.append("Plen ");
                        break;

                    case MI:
                        interpretacion.append("Plin ");
                        break;

                    case FA:
                        interpretacion.append("Plon ");
                        break;

                    case SOL:
                        interpretacion.append("Plun ");
                        break;

                    case LA:
                        interpretacion.append("Pilin ");
                        break;

                    case SI:
                        interpretacion.append("Polon ");
                        break;
                }
            }
        }

        interpretacion.append(System.lineSeparator());
        System.out.println(interpretacion);
    }
}
