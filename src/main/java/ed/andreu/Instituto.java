package ed.andreu;

public class Instituto {

	public static String kNOMBRE_ALUMNO = "Andreu";
	public static String kAPELLIDOS_ALUMNO = "Francés";
	public static String kCICLO_FORMATIVO = "1º DAM";
	public static int kANYO = 2023;


	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellidos = kAPELLIDOS_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
