package Ejercicio1Singleton;

public class Estudiante {
    private String nombre;

    public Estudiante() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void pagarMatricula(int monto) {

        System.out.println(nombre + " tienes pendiente el pago de la matricula!");

        Ventanilla.getInstance().pagar(monto);

    }
}

