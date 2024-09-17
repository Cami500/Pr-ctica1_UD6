package ed.andreu;

public class Instituto {
	final static String kNOMBRE_ALUMNO = "Camilo";
	final static String kAPELLIDOS_ALUMNO = "Juan";
	final static String kCICLO_FORMATIVO = "1º DAM/DAW";
	final static int kANYO = 2023;

	public static void main(String[] args) {
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDOS_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO;
		p.cualquiera = kANYO;
		
		System.out.println(p.toString());
	}
}