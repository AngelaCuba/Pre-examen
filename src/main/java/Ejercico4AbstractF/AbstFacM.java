package Ejercico4AbstractF;

public class AbstFacM {
    public static IM make(Materias m) {

        IM materias;

        switch(m) {

            case MATEMATICAS:
                materias = new Mate ();
                ((Mate) materias).setCreditos(4);
                ((Mate) materias).setDocente("Carlos");
                break;

            case LENGUAJE:
                materias = new Len();
                ((Len) materias).setCreditos(6);
                ((Len) materias).setDocente("Ana");
                break;

            case HISTORIA:
                materias = new His();
                ((His) materias).setCreditos(3);
                ((His) materias).setDocente("Jaime");
                break;

            case INGLES:
                materias = new Ingles();
                ((Ingles) materias).setCreditos(8);
                ((Ingles) materias).setDocente("Johny");
                break;

            default:
                materias = null;



        }

        return materias;

    }
}
