package Ejercicio_3;

public class HoraExacta extends Hora{

    //atributos
    private int second;

    //constructor
    public HoraExacta(int hour, int minutes,int second) {
        super(hour, minutes);
        this.second=second;
    }


    @Override
    public void inc(){
        //23:59:59
        //22:59:59

        if(this.second==59){
            this.second=0;

            if(this.minutes==59){
                this.minutes=0;

                if(this.hour==23){
                    this.hour=0;
                }else{
                    this.hour++;
                }

            }else{
                this.minutes++;
            }

        }else{
            this.second++;
        }
    }


    @Override
    public String toString() {

        String hora;
        String minuto;
        String segundo;

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

        if(this.second<10){
            segundo="0"+this.second;
        }else{
            segundo=""+this.second;
        }

        return hora+":"+minuto+":"+segundo;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    @Override
    public boolean equals(Object obj) {

        HoraExacta hora;
        hora=(HoraExacta)obj;

        if( (hora.getHour()==this.getHour())
                && hora.getMinutes()==this.getMinutes()
                && hora.getSecond()==this.getSecond() ){

            return true;

        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.second;
        return hash;
    }

}
