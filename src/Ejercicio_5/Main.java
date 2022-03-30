package Ejercicio_5;

import java.util.Set;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Unidades unidad1 = new Unidades(5);
        Unidades unidad2 = new Unidades(15);
        Unidades unidad3 = new Unidades(10);
        /*
        this.nombre = nombre;
        this.destinatario = destinatario;
        this.dirección = dirección;
        this.telefono = telefono;
        this.Poblacion = Poblacion;
        this.CP = CP;
        */

        Etiqueta etiqueta1 = new Etiqueta("Luis", "MALAGA", "Direcion sdsd", "6456646", "MURCIA", "46960");
        Etiqueta etiqueta2 = new Etiqueta("Luis", "MALAGA", "Direcion sdsd", "6456646", "MURCIA", "46960");
        Etiqueta etiqueta3 = new Etiqueta("Luis", "MALAGA", "Direcion sdsd", "6456646", "MURCIA", "46960");

        Caja caja1 = new Caja(15, 25, 10, unidad1, Caja.MEDIDA.CM);
        caja1.setEtiqueta(etiqueta1);

        Caja caja2 = new Caja(15, 25, 10, unidad2, Caja.MEDIDA.M);
        caja2.setEtiqueta(etiqueta2);

        CajaCarton caja3 = new CajaCarton(15, 25, 10, unidad3, Caja.MEDIDA.M);
        caja3.setEtiqueta(etiqueta3);

        System.out.print(caja1.toString());
        System.out.print(caja2.toString());
        System.out.print(caja3.toString());

        System.out.println(caja1.getVolumen());
        System.out.println(caja2.getVolumen());
        System.out.println(caja3.getVolumen());
    }
}
