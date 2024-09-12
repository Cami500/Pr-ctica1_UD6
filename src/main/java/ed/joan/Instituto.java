package ed.joan;

public class Instituto {

	public static final String kNOMBRE_ALUMNO = "Camilo";
	public static final String kAPELLIDOS_ALUMNO = "Juan";
	public static final String kCICLO_FORMATIVO = "1º DAM/DAW";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();

		String camilo = kNOMBRE_ALUMNO;
		p.nombre = camilo;
		String juan = kAPELLIDOS_ALUMNO;
		p.apellidos = juan;
		String cl = kCICLO_FORMATIVO;
		p.ciclo_formativo = cl;
		int a = kANYO;
		p.anyo = a;
		
		System.out.println(p.toString());

	}

}
