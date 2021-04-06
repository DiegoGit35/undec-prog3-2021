public class Aeropuerto {
    String codIATA;
    String nombre;
    String ciudad;
    int codPostal;
    public Aeropuerto(String codIATA, String nombre, String ciudad  , int codPostal) {
        this.codIATA = codIATA;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.codPostal = codPostal;
    }

    public String getCodIATA() {
        return codIATA;
    }

    public void setCodIATA(String codIATA) {
        this.codIATA = codIATA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCodPostal() {
        return codPostal;
    }
}
