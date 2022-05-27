package Ejercico4AbstractF;

public class Cliente {
    public static void main(String[] args) {

        Est estudiante1 = new Est();
        estudiante1.setName("Roberto");
        estudiante1.setName("Castillo");

        Est estudiante2 = new Est();
        estudiante1.setName("Dylan");
        estudiante1.setName("Prado");

        Est estudiante3 = new Est();
        estudiante1.setName("Alex");
        estudiante1.setName("Pereira");

        Est estudiante4 = new Est();
        estudiante1.setName("Angela");
        estudiante1.setName("Cuba");

        Est estudiante5 = new Est();
        estudiante1.setName("Johan");
        estudiante1.setName("Revollo");


        estudiante1.insciribirse(Materias.MATEMATICAS);
        estudiante2.insciribirse(Materias.LENGUAJE);
        estudiante3.insciribirse(Materias.HISTORIA);
        estudiante4.insciribirse(Materias.INGLES);
        estudiante5.insciribirse(Materias.MATEMATICAS);

    }
}
