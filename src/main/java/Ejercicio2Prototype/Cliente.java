package Ejercicio2Prototype;

public class Cliente {
    public static void main(String[] args) {

        ContratoD template = new ContratoD();

        template.setSueldo(500);
        template.setCargaHoraria(80);
        template.setCursoEducacionSuperior(true);
        template.setAccesoPlataforma(true);
        template.setMarcadoBiometrico(false);
        template.setMarcadoHoraDeEntrada("08:00");
        template.setMarcadoHoraDeSalida("18:00");

        ContratoD d1 = (ContratoD) template.clone();

        d1.setNombre("Javier");
        d1.setApellido("Rojas");

        ContratoD d2 = (ContratoD) template.clone();

        d2.setNombre("Jacinto");
        d2.setApellido("Rodriguez");

        ContratoD d3 = (ContratoD) template.clone();

        d3.setNombre("Jaime");
        d3.setApellido("Rocas");

        ContratoD d4 = (ContratoD) template.clone();

        d4.setNombre("Juana");
        d4.setApellido("Rojas");

        ContratoD d5 = (ContratoD) template.clone();

        d5.setNombre("Carla");
        d5.setApellido("Borjas");

        ContratoD d6 = (ContratoD) template.clone();

        d6.setNombre("Juan");
        d6.setApellido("Salas");

        ContratoD d7 = (ContratoD) template.clone();
        d7.setNombre("Julian");
        d7.setApellido("Rojas");

        ContratoD d8 = (ContratoD) template.clone();

        d8.setNombre("Javier");
        d8.setApellido("Vargas");

        ContratoD d9 = (ContratoD) template.clone();

        d9.setNombre("Jhon");
        d9.setApellido("Rojas");

        ContratoD d10 = (ContratoD) template.clone();

        d10.setNombre("Johan");
        d10.setApellido("Revollo");

        ContratoD d11 = (ContratoD) template.clone();

        d11.setNombre("Angela");
        d11.setApellido("Cuba");

        ContratoD d12 = (ContratoD) template.clone();

        d12.setNombre("Manuel");
        d12.setApellido("Illanes");
        ContratoD d13 = (ContratoD) template.clone();

        d13.setNombre("Alan");
        d13.setApellido("Yarari");
        ContratoD d14 = (ContratoD) template.clone();

        d14.setNombre("Antonio");
        d14.setApellido("Mamani");
        ContratoD d15 = (ContratoD) template.clone();

        d15.setNombre("Alex");
        d15.setApellido("Zabala");


        d1.showInfo();
        d2.showInfo();
        d3.showInfo();
        d4.showInfo();
        d5.showInfo();
        d6.showInfo();
        d7.showInfo();
        d8.showInfo();
        d9.showInfo();
        d10.showInfo();
        d11.showInfo();
        d12.showInfo();
        d13.showInfo();
        d14.showInfo();
        d15.showInfo();


    }
    }
