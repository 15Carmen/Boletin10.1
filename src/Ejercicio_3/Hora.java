package Ejercicio_3;

public class Hora {

    protected int hour;
    protected int minutes;

    public Hora(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }
    public void inc(){
        //12:05
        //12:06
        //23:59==0:0
        //23:58
        //12:59===13:00
        if(this.minutes==59){
            if(this.hour==23){
                this.hour=0;
                this.minutes=0;
            }else{
                this.hour++;
                this.minutes=0;
            }
        }else{
            this.minutes++;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
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
        return hora+":"+minuto;
    }
}
