package ed.Felipe;

public class Instituto {

	public static final String k_NOMBRE_ALUMNO = "Camilo";
	public static final String k_APELLIDOS_ALUMNO = "Juan";
	public static final String k_CICLO_FORMATIVO = "1º DAM/DAW";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();

		p.nombre = k_NOMBRE_ALUMNO;
		p.apellidos = k_APELLIDOS_ALUMNO;
		p.ciclo_formativo = k_CICLO_FORMATIVO;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
