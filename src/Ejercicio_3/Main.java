package Ejercicio_3;

public class Main {

    public static void main(String[] args) {

        /*Hora hora1=new Hora(0,59);
        System.out.println(hora1.toString());
        hora1.inc();
        System.out.println(hora1.toString());
        */

        //Hora12 hora2=new Hora12(5,25,Hora12.AMPM.PM.getDescripcion());

        Hora12 hora3=new Hora12(12,59,Hora12.AMPM.AM);
        Hora12 hora4=new Hora12(12,59,Hora12.AMPM.PM);
        System.out.println(hora3.toString());
        System.out.println(hora4.toString());
        hora3.inc();
        hora4.inc();
        System.out.println(hora3.toString());
        System.out.println(hora4.toString());
        /*
        HoraExacta hora5=new HoraExacta(18,56,20);
        HoraExacta hora6=new HoraExacta(18,36,20);
        System.out.println(hora5.toString());
        System.out.println(hora6.toString());
        System.out.println(hora5.equals(hora6));
        */
    }

}

