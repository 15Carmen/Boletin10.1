package Ejercicio_5;

public class Caja {

    protected int ancho;
    protected int alto;
    protected int fondo;
    protected Unidades unidad;
    protected String cm_m;
    protected Etiqueta etiqueta;

    public static enum MEDIDA{
        CM("CM",0),M("M",1);
        private String descripcion;
        private int posicion;

        private MEDIDA(String descripcion, int posicion){
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

    public Caja(int ancho, int alto, int fondo, Unidades unidad, MEDIDA cm_mt) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.cm_m=cm_mt.descripcion;

    }

    public void setEtiqueta(Etiqueta etiqueta){
        this.etiqueta=etiqueta;
    }

    public double getVolumen(){
        double resultado=0;
        resultado=ancho*alto*fondo;
        if(cm_m.equals(MEDIDA.CM.descripcion)){
            resultado=resultado/100;
        }
        return resultado;
    }

    @Override
    public String toString() {
        String resultado="";
        //getVolumen();
        resultado="La caja tiene "+ancho+cm_m.toLowerCase()+ " de ancho\n"
                +", "+alto+cm_m.toLowerCase()+" de alto y de fondo "+fondo+cm_m.toLowerCase()+"\n";
        return resultado;
    }

}
