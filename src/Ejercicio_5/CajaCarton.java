package Ejercicio_5;

public class CajaCarton extends Caja{

    private String cm;

    public CajaCarton(int ancho, int alto, int fondo, Unidades unidad, MEDIDA cm_mt) {
        super(ancho, alto, fondo, unidad, cm_mt);
        cm=Caja.MEDIDA.CM.getDescripcion();
        //cm=Caja.MEDIDA.CM.getDescripcion();
    }
    @Override
    public double getVolumen(){
        double resultado=0;
        resultado=ancho*alto*fondo;
        resultado=(resultado*.8)/100;
        return resultado;
    }

    @Override
    public String toString() {
        String resultado="";
        cm_m=cm;
        resultado="La caja tiene "+ancho+cm_m.toLowerCase()+ " de ancho\n"
                +", "+alto+cm_m.toLowerCase()+" de alto y de fondo "+fondo+cm_m.toLowerCase()+"\n";
        return resultado;
    }
}