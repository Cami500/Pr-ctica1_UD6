package ed.joan;

public class Escuela {

	public static void main(String[] args) {
		
		Persona p = new Persona();

		String camilo = "Camilo";
		p.n = camilo;
		String juan = "Juan";
		p.c = juan;
		String cl = "1º DAM/DAW";
		p.cl = cl;
		int a = 2023;
		p.a = a;
		
		System.out.println(p.toString());

	}

}
