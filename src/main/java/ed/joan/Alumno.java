package ed.joan;

public class Alumno {
	
	
	public String nombre;
	public String apellidos;
	public int anyo;
	public String ciclo_formativo;
	
	@Override
	public String toString() {
		
		return  "n = " + nombre + System.lineSeparator() +
				"c = " + apellidos + System.lineSeparator() +
				"a = " + anyo + System.lineSeparator() +
				"cl = " + ciclo_formativo;
				
		
	}

}
