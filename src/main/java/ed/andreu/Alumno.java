package ed.andreu;

public class Alumno {
	public String nombre;
	public String apellidos;
	public int cualquiera;
	public String cicloFormativo;
	
	@Override
	public String toString() {
		
		return  "n = " + nombre + System.lineSeparator() +
				"c = " + apellidos + System.lineSeparator() +
				"a = " + cualquiera + System.lineSeparator() +
				"cl = " + cicloFormativo;
	}
}