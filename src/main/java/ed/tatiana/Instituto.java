package ed.tatiana;

public class Instituto {

	public static void main(String[] args) {
		
		Alumno p = new Alumno();

		p.nombre = "Camilo";
		p.apellidos = "Juan";
		p.ciclo_formativo = "1º DAM/DAW";
		p.anyo = 2023;
		
		System.out.println(p.toString());

	}

}
