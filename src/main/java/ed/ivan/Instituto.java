package ed.ivan;

public class Instituto {

	public static final String kNOMBRE_ALUMNO = "Ivan";
	public static final String kAPELLIDOS_ALUMNO = "Juan";
	public static final String kCICLO_FORMATIVO = "1º DAM/DAW";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno cadenaPersona = new Alumno();
		
		cadenaPersona.nombre = kNOMBRE_ALUMNO;
		cadenaPersona.apellidos = kAPELLIDOS_ALUMNO;
		cadenaPersona.cicloFormativo = kCICLO_FORMATIVO;
		cadenaPersona.anyo = kANYO;
		
		System.out.println(cadenaPersona.toString());

	}

}
