package ed.javier;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.n = "Javier";
		p.c = "Guijarro";
		p.cl = "1º DAW";
		p.a = 2023;
		
		System.out.println(p.toString());

	}

}
