package ed.arantxa;

public class Instituto {

	public static final String kNOMBRE_ALUMNO = "Arantxa";
	public static final String kAPELLIDOS_ALUMNO = "Gandia";
	public static final String kCICLO_FORMATIVO = "1º DAW";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDOS_ALUMNO;
		p.ciclo_formativo = kCICLO_FORMATIVO;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
