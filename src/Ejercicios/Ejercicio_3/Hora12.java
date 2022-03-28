package Ejercicios.Ejercicio_3;

public class Hora12 extends Hora{

    private String am_pm;

    public static enum AMPM{

        AM("AM",0),PM("PM",1);
        private String descripcion;
        private int posicion;

        private AMPM(String descripcion, int posicion){
            this.descripcion = descripcion;
            this.posicion = posicion;
        }

        public String getDescripcion() {
            return descripcion;
        }
        public int getPosicion() {
            return posicion;
        }
    }


    //public Hora12(int hour, int minutes,String am_pm) {
    public Hora12(int hour, int minutes,AMPM am_pm) {
        super(hour, minutes);
        this.am_pm=am_pm.descripcion;
        //this.am_pm=am_pm;
    }

    @Override
    public void inc(){
        //1 al 12 AM/PM
        //12:59AM
        if(this.minutes==59){

            if(this.hour==12){
                this.hour=1;
                this.minutes=0;

                if(this.am_pm.equals(AMPM.AM.descripcion)){
                    this.am_pm=AMPM.PM.descripcion;

                }else{
                    this.am_pm=AMPM.AM.descripcion;
                }

            }else{
                this.hour++;
                this.minutes=0;
            }

        }else{
            this.minutes++;
        }

    }

    @Override
    public String toString() {

        String hora;
        String minuto;

        if(this.hour<10){
            hora= "0"+this.hour;

        }else{
            hora= String.valueOf(this.hour);
        }

        if(this.minutes<10){
            minuto="0"+this.minutes;

        }else{
            minuto=""+this.minutes;
        }

        return hora+":"+minuto+this.am_pm;
    }
}
