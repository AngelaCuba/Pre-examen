package Ejercicio1Singleton;

public class Cliente {
    public static void main(String[] args) {

        Cajero cajero = new Cajero();

        cajero.setNombre("Javier Riveros ");
        cajero.setCodigo(57805);
        cajero.registrarseEnVentanilla();

        Estudiante estudiante1 = new Estudiante();

        estudiante1.setNombre("Idalgo");

        estudiante1.pagarMatricula(200);
        cajero.mostrarSaldoCajero();

        Estudiante estudiante2 = new Estudiante();

        estudiante2.setNombre("Enrique Perez");

        estudiante2.pagarMatricula(500);
        cajero.mostrarSaldoCajero();

        Estudiante estudiante3 = new Estudiante();

        estudiante3.setNombre("Katerin Flores");

        estudiante3.pagarMatricula(750);
        cajero.mostrarSaldoCajero();

        Estudiante estudiante4 = new Estudiante();

        estudiante4.setNombre("Mandy Espinoza");

        estudiante4.pagarMatricula(220);
        cajero.mostrarSaldoCajero();

        Estudiante estudiante5 = new Estudiante();

        estudiante5.setNombre("Johan Revollo");

        estudiante5.pagarMatricula(310);
        cajero.mostrarSaldoCajero();

    }

}

