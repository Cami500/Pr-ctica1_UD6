package ed.alejandro;

public class Instituto {

	private static final int kANYO = 2023;
	private static final String kCICLO_FORMATIVO = "1º DAW";
	private static final String kAPELLIDO_ALUMNO = "Pons";
	private static final String kNOMBRE_ALUMNO = "Alejandro";

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDO_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
