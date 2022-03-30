package Ejercicio_5;

public class Etiqueta {
    private String nombre;
    private String destinatario;
    private String dirección;
    private String telefono;
    private String Poblacion;
    private String CP;

    public Etiqueta(String nombre, String destinatario, String dirección, String telefono, String Poblacion, String CP) {
        this.nombre = nombre;
        this.destinatario = destinatario;
        this.dirección = dirección;
        this.telefono = telefono;
        this.Poblacion = Poblacion;
        this.CP = CP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return Poblacion;
    }

    public void setPoblacion(String Poblacion) {
        this.Poblacion = Poblacion;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

}
