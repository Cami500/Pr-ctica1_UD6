package ed.fran;

public class Instituto {
    private final static String kNOMBRE_ALUMNO    = "Camilo";
    private final static String kAPELLIDOS_ALUMNO = "Juan";
    private final static String kCICLO_FORMATIVO  = "1º DAM/DAW";
    private final static int    kANYO             = 2023;

    public static void main(String[] args) {

        Alumno p = new Alumno();

        p.nombre         = kNOMBRE_ALUMNO;
        p.apellidos      = kAPELLIDOS_ALUMNO;
        p.cicloFormativo = kCICLO_FORMATIVO;
        p.anyo           = kANYO;

        System.out.println( p.toString() );

    }

}
