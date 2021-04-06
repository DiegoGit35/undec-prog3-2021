import java.nio.charset.Charset;
import java.util.GregorianCalendar;

public class Piloto {
    private final String apellido;
    private String nombre;
    private GregorianCalendar fechaNac;
    private RolTripulacion rol;
    private int dni;
    public String cuil;

    public Piloto(String cuil, int dni, String apellido, String nombre, GregorianCalendar fechaNac, RolTripulacion rol) {
        this.cuil = cuil;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.rol = rol;
    }

    public String getCuil() {
        return cuil;
    }

    public String getApellido() {
        return this.apellido;
    }
}
