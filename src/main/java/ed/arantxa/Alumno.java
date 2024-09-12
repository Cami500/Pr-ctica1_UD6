package ed.arantxa;

public class Alumno {
    public String nombre;
    public String apellidos;
    public int anyo;
    public String ciclo_formativo;

    @Override
    public String toString() {

        return  "nombre = " + nombre + System.lineSeparator() +
                "apellidos = " + apellidos + System.lineSeparator() +
                "anyo = " + anyo + System.lineSeparator() +
                "ciclo_formativo = " + ciclo_formativo;


    }
}
