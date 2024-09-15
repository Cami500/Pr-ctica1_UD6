package ed.javier;

public class Instituto {

	final static String kNOMBRE_ALUMNO = "Javier";
	final static String kAPELLIDOS_ALUMNO = "Guijarro";
	final static String kCICLO_FORMATIVO = "1º DAW";
	final static int kANYO = 2023;


	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDOS_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
