package ed.doha;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();
		
		p.nombre = "Doha";
		p.apellidos = "Aliat";
		p.cicloInformativo = "1º DAW";
		p.anyo = 2023;

		System.out.println(p.toString());

	}

}
