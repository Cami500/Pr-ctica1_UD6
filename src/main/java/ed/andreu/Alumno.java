package ed.andreu;

public class Alumno {
	
	
	public String nombre;
	public String apellidos;
	public int anyo;
	public String cicloFormativo
	;
	
	@Override
	public String toString() {
		
		return  "nombre = " + nombre + System.lineSeparator() +
				"apellidos = " + apellidos + System.lineSeparator() +
				"año = " + anyo + System.lineSeparator() +
				"ciclo formativo = " + cicloFormativo;
				
		
	}

}
