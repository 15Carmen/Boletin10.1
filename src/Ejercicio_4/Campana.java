package Ejercicio_4;

public class Campana extends Instrumento{

    /**
     * Constructor por defecto
     */
    public Campana() {
        super();
    }


    /**
     * Método que añade notas musicales al array notas
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
        //System.out.println("");
        interpretacion.append(System.lineSeparator());

        for (int i = 0; i < this.notas.length; i++) {

            if (notas[i] != null) {

                switch (notas[i]) {
                    case DO:
                        interpretacion.append("Talan ");
                        break;
                    case RE:
                        interpretacion.append("Telen ");
                        break;
                    case MI:
                        interpretacion.append("Tilin ");
                        break;
                    case FA:
                        interpretacion.append("Tolon ");
                        break;
                    case SOL:
                        interpretacion.append("Tulun ");
                        break;
                    case LA:
                        interpretacion.append("Talin ");
                        break;
                    case SI:
                        interpretacion.append("Telin ");
                        break;
                }
            }
        }

        interpretacion.append(System.lineSeparator());
        //System.out.println("");
        System.out.println(interpretacion);

    }
}
