package ed.izan;

public class Instituto {

	public static final String NOMBRE_ALUMNO = "Izan";
	public static final String APELLIDOS_ALUMNO = "Blanes";
	public static final String CICLO_FORMATIVO = "1º DAM";
	public static final int ANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = NOMBRE_ALUMNO;
		p.apellidos = APELLIDOS_ALUMNO;
		p.cicloFormativo = CICLO_FORMATIVO;
		p.anyo = ANYO;
		
		System.out.println(p.toString());

	}

}
