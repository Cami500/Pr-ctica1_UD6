package ed.roger;

public class Instituto {

	public static final String kNOMBRE_ALUMNO = "Roger";
	public static final String kAPELLIDOS_ALUMNO = "Moll";
	public static final String kCICLO_FORMATIVO = "1º DAM";
	public static final int kANYO = 2023;

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = kNOMBRE_ALUMNO;
		p.apellido = kAPELLIDOS_ALUMNO;
		p.cicloFormativo = kCICLO_FORMATIVO;
		p.anyo = kANYO;
		
		System.out.println(p.toString());

	}

}
